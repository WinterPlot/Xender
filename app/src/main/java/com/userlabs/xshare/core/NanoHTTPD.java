package com.userlabs.xshare.core;

import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import com.userlabs.xshare.core.create.XCreateApException;
import com.userlabs.xshare.core.utils.y;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NanoHTTPD {
    private final String a;
    private final int b;
    private ServerSocket c;
    private Set<Socket> d = new HashSet();
    private Thread e;
    private b f;
    private m g;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Method {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS;

        public static Method lookup(String str) {
            for (Method method : values()) {
                if (method.toString().equalsIgnoreCase(str)) {
                    return method;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: com.userlabs.xshare.core.NanoHTTPD$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class RunnableC0319a implements Runnable {
            final /* synthetic */ Socket a;
            final /* synthetic */ InputStream b;

            public RunnableC0319a(Socket socket, InputStream inputStream) {
                this.a = socket;
                this.b = inputStream;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                OutputStream outputStream = null;
                try {
                    try {
                        OutputStream outputStream2 = this.a.getOutputStream();
                        try {
                            i iVar = NanoHTTPD.this.new i(NanoHTTPD.this.g.create(), this.b, outputStream2, this.a.getInetAddress());
                            while (!this.a.isClosed()) {
                                iVar.execute();
                            }
                            NanoHTTPD.safeClose(outputStream2);
                        } catch (Exception e) {
                            e = e;
                            outputStream = outputStream2;
                            if (!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) {
                                e.printStackTrace();
                            }
                            NanoHTTPD.safeClose(outputStream);
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream2;
                            NanoHTTPD.safeClose(outputStream);
                            NanoHTTPD.safeClose(this.b);
                            NanoHTTPD.safeClose(this.a);
                            NanoHTTPD.this.unRegisterConnection(this.a);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    NanoHTTPD.safeClose(this.b);
                    NanoHTTPD.safeClose(this.a);
                    NanoHTTPD.this.unRegisterConnection(this.a);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    Socket socketAccept = NanoHTTPD.this.c.accept();
                    NanoHTTPD.this.registerConnection(socketAccept);
                    socketAccept.setSoTimeout(30000);
                    socketAccept.setTcpNoDelay(true);
                    NanoHTTPD.this.f.exec(new RunnableC0319a(socketAccept, socketAccept.getInputStream()));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } while (!NanoHTTPD.this.c.isClosed());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void exec(Runnable runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private String a;
        private String b;
        private String c;

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public static String getHTTPTime(int i) {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(y.getGMT());
            calendar.add(5, i);
            return simpleDateFormat.format(calendar.getTime());
        }

        public String getHTTPHeader() {
            return this.a + "=" + this.b + "; expires=" + this.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class e implements b {
        private long a;

        @Override // com.userlabs.xshare.core.NanoHTTPD.b
        public void exec(Runnable runnable) {
            this.a++;
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.a + ")");
            thread.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class f implements k {
        private File a;
        private OutputStream b;

        public f(String str) throws IOException {
            this.a = File.createTempFile("NanoHTTPD-", "", new File(str));
            this.b = new FileOutputStream(this.a);
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.k
        public void delete() throws Exception {
            NanoHTTPD.safeClose(this.b);
            this.a.delete();
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.k
        public String getName() {
            return this.a.getAbsolutePath();
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.k
        public OutputStream open() throws Exception {
            return this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class g implements l {
        private final String a;
        private final List<k> b = new ArrayList();

        public g(String str) {
            this.a = str;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.l
        public void clear() {
            Iterator<k> it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().delete();
                } catch (Exception unused) {
                }
            }
            this.b.clear();
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.l
        public k createTempFile() throws IOException {
            f fVar = new f(this.a);
            this.b.add(fVar);
            return fVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class h implements m {
        String a;

        public h(String str) {
            this.a = str;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.m
        public l create() {
            return new g(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class i implements j {
        private final l a;
        private final OutputStream b;
        private PushbackInputStream c;
        private int d;
        private int e;
        private String f;
        private Method g;
        private Map<String, String> h;
        private Map<String, String> i;
        private d j;
        private String k;

        public i(l lVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.a = lVar;
            this.c = new com.userlabs.xshare.core.d(inputStream, 8192);
            this.b = outputStream;
            String hostAddress = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress();
            HashMap map = new HashMap();
            this.i = map;
            map.put("remote-addr", hostAddress);
            this.i.put("http-client-ip", hostAddress);
        }

        private void decodeHeader(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws ResponseException {
            String strDecodePercent;
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    decodeParams(strNextToken.substring(iIndexOf + 1), map2);
                    strDecodePercent = NanoHTTPD.this.decodePercent(strNextToken.substring(0, iIndexOf));
                } else {
                    strDecodePercent = NanoHTTPD.this.decodePercent(strNextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    String line2 = bufferedReader.readLine();
                    while (line2 != null && line2.trim().length() > 0) {
                        int iIndexOf2 = line2.indexOf(58);
                        if (iIndexOf2 >= 0) {
                            map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                        }
                        line2 = bufferedReader.readLine();
                    }
                }
                map.put("uri", strDecodePercent);
            } catch (IOException e) {
                throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        private void decodeMultipartData(String str, ByteBuffer byteBuffer, BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2) throws ResponseException {
            String line;
            int i;
            try {
                int[] boundaryPositions = getBoundaryPositions(byteBuffer, str.getBytes());
                int i2 = 1;
                for (String line2 = bufferedReader.readLine(); line2 != null; line2 = line) {
                    if (!line2.contains(str)) {
                        throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but next chunk does not start with boundary. Usage: GET /example/file.html");
                    }
                    int i3 = i2 + 1;
                    HashMap map3 = new HashMap();
                    line = bufferedReader.readLine();
                    while (true) {
                        i = 0;
                        if (line == null || line.trim().length() <= 0) {
                            break;
                        }
                        int iIndexOf = line.indexOf(58);
                        if (iIndexOf != -1) {
                            map3.put(line.substring(0, iIndexOf).trim().toLowerCase(Locale.US), line.substring(iIndexOf + 1).trim());
                        }
                        line = bufferedReader.readLine();
                    }
                    if (line != null) {
                        String str2 = (String) map3.get("content-disposition");
                        if (str2 == null) {
                            throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but no content-disposition info found. Usage: GET /example/file.html");
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(str2, ";");
                        HashMap map4 = new HashMap();
                        while (stringTokenizer.hasMoreTokens()) {
                            String strTrim = stringTokenizer.nextToken().trim();
                            int iIndexOf2 = strTrim.indexOf(61);
                            if (iIndexOf2 != -1) {
                                map4.put(strTrim.substring(i, iIndexOf2).trim().toLowerCase(Locale.US), strTrim.substring(iIndexOf2 + 1).trim());
                            }
                            i = 0;
                        }
                        String str3 = (String) map4.get("name");
                        String strSubstring = str3.substring(1, str3.length() - 1);
                        String strSubstring2 = "";
                        if (map3.get("content-type") != null) {
                            if (i3 > boundaryPositions.length) {
                                throw new ResponseException(Response.Status.INTERNAL_ERROR, "Error processing request");
                            }
                            int iStripMultipartHeaders = stripMultipartHeaders(byteBuffer, boundaryPositions[i2 - 1]);
                            map2.put(strSubstring, saveTmpFile(byteBuffer, iStripMultipartHeaders, (boundaryPositions[i2] - iStripMultipartHeaders) - 4));
                            String str4 = (String) map4.get("filename");
                            strSubstring2 = str4.substring(1, str4.length() - 1);
                            do {
                                line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                            } while (!line.contains(str));
                        } else {
                            while (line != null && !line.contains(str)) {
                                line = bufferedReader.readLine();
                                if (line != null) {
                                    int iIndexOf3 = line.indexOf(str);
                                    strSubstring2 = iIndexOf3 == -1 ? strSubstring2 + line : strSubstring2 + line.substring(0, iIndexOf3 - 2);
                                }
                            }
                        }
                        map.put(strSubstring, strSubstring2);
                    }
                    i2 = i3;
                }
            } catch (IOException e) {
                throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        private void decodeParams(String str, Map<String, String> map) {
            if (str == null) {
                this.k = "";
                return;
            }
            this.k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                NanoHTTPD nanoHTTPD = NanoHTTPD.this;
                if (iIndexOf >= 0) {
                    map.put(nanoHTTPD.decodePercent(strNextToken.substring(0, iIndexOf)).trim(), NanoHTTPD.this.decodePercent(strNextToken.substring(iIndexOf + 1)));
                } else {
                    map.put(nanoHTTPD.decodePercent(strNextToken).trim(), "");
                }
            }
        }

        private int findHeaderEnd(byte[] bArr, int i) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 3;
                if (i3 >= i) {
                    return 0;
                }
                if (bArr[i2] == 13 && bArr[i2 + 1] == 10 && bArr[i2 + 2] == 13 && bArr[i3] == 10) {
                    return i2 + 4;
                }
                i2++;
            }
        }

        private int[] getBoundaryPositions(ByteBuffer byteBuffer, byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            while (i < byteBuffer.limit()) {
                if (byteBuffer.get(i) == bArr[i2]) {
                    if (i2 == 0) {
                        i3 = i;
                    }
                    i2++;
                    if (i2 == bArr.length) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                    i++;
                } else {
                    i -= i2;
                }
                i2 = 0;
                i3 = -1;
                i++;
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            }
            return iArr;
        }

        private RandomAccessFile getTmpBucket() throws Exception {
            return new RandomAccessFile(this.a.createTempFile().getName(), "rw");
        }

        private String saveTmpFile(ByteBuffer byteBuffer, int i, int i2) throws Throwable {
            if (i2 <= 0) {
                return "";
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    k kVarCreateTempFile = this.a.createTempFile();
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(kVarCreateTempFile.getName());
                    try {
                        FileChannel channel = fileOutputStream2.getChannel();
                        byteBufferDuplicate.position(i).limit(i + i2);
                        channel.write(byteBufferDuplicate.slice());
                        String name = kVarCreateTempFile.getName();
                        NanoHTTPD.safeClose(fileOutputStream2);
                        return name;
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        throw new Error(e);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        NanoHTTPD.safeClose(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0029 A[PHI: r3
          0x0029: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:7:0x0016, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        private int stripMultipartHeaders(ByteBuffer byteBuffer, int i) {
            while (i < byteBuffer.limit()) {
                if (byteBuffer.get(i) == 13) {
                    int i2 = i + 1;
                    if (byteBuffer.get(i2) == 10) {
                        i2 = i + 2;
                        if (byteBuffer.get(i2) == 13) {
                            i += 3;
                            if (byteBuffer.get(i) == 10) {
                                break;
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                }
                i++;
            }
            return i + 1;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public void execute() throws IOException {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        this.d = 0;
                        this.e = 0;
                        try {
                            int i = this.c.read(bArr, 0, 8192);
                            if (i == -1) {
                                NanoHTTPD.safeClose(this.c);
                                NanoHTTPD.safeClose(this.b);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i > 0) {
                                int i2 = this.e + i;
                                this.e = i2;
                                int iFindHeaderEnd = findHeaderEnd(bArr, i2);
                                this.d = iFindHeaderEnd;
                                if (iFindHeaderEnd > 0) {
                                    break;
                                }
                                PushbackInputStream pushbackInputStream = this.c;
                                int i3 = this.e;
                                i = pushbackInputStream.read(bArr, i3, 8192 - i3);
                            }
                            int i4 = this.d;
                            int i5 = this.e;
                            if (i4 < i5) {
                                this.c.unread(bArr, i4, i5 - i4);
                            }
                            this.h = new HashMap();
                            if (this.i == null) {
                                this.i = new HashMap();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap map = new HashMap();
                            decodeHeader(bufferedReader, map, this.h, this.i);
                            Method methodLookup = Method.lookup((String) map.get("method"));
                            this.g = methodLookup;
                            if (methodLookup == null) {
                                throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                            }
                            this.f = (String) map.get("uri");
                            this.j = NanoHTTPD.this.new d(this.i);
                            Response responseServe = NanoHTTPD.this.serve(this);
                            if (responseServe == null) {
                                throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            this.j.unloadQueue(responseServe);
                            responseServe.setRequestMethod(this.g);
                            responseServe.send(this.b);
                            this.a.clear();
                        } catch (Exception unused) {
                            NanoHTTPD.safeClose(this.c);
                            NanoHTTPD.safeClose(this.b);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (Throwable th) {
                        this.a.clear();
                        throw th;
                    }
                } catch (SocketException e) {
                    throw e;
                } catch (IOException e2) {
                    new Response(Response.Status.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e2.getMessage()).send(this.b);
                    NanoHTTPD.safeClose(this.b);
                    this.a.clear();
                }
            } catch (ResponseException e3) {
                new Response(e3.getStatus(), "text/plain", e3.getMessage()).send(this.b);
                NanoHTTPD.safeClose(this.b);
                this.a.clear();
            } catch (SocketTimeoutException e4) {
                throw e4;
            }
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public d getCookies() {
            return this.j;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public final Map<String, String> getHeaders() {
            return this.i;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public final InputStream getInputStream() {
            return this.c;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public final Method getMethod() {
            return this.g;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public final Map<String, String> getParms() {
            return this.h;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public String getQueryParameterString() {
            return this.k;
        }

        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public final String getUri() {
            return this.f;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00a7 A[PHI: r7
          0x00a7: PHI (r7v7 java.lang.Object) = (r7v15 java.lang.Object), (r7v16 java.lang.Object) binds: [B:29:0x0093, B:31:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.userlabs.xshare.core.NanoHTTPD.j
        public void parseBody(Map<String, String> map) throws Exception {
            Closeable closeable;
            Closeable closeable2;
            long j;
            String strNextToken;
            StringTokenizer stringTokenizer;
            StringTokenizer stringTokenizer2;
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile tmpBucket = getTmpBucket();
                try {
                    if (this.i.containsKey("content-length")) {
                        j = Integer.parseInt(this.i.get("content-length"));
                    } else {
                        int i = this.d;
                        int i2 = this.e;
                        j = i < i2 ? i2 - i : 0L;
                    }
                    byte[] bArr = new byte[512];
                    while (this.e >= 0 && j > 0) {
                        int i3 = this.c.read(bArr, 0, (int) Math.min(j, 512L));
                        this.e = i3;
                        j -= (long) i3;
                        if (i3 > 0) {
                            tmpBucket.write(bArr, 0, i3);
                        }
                    }
                    MappedByteBuffer map2 = tmpBucket.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, tmpBucket.length());
                    tmpBucket.seek(0L);
                    closeable2 = null;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(tmpBucket.getFD())));
                        if (Method.POST.equals(this.g)) {
                            String str = this.i.get("content-type");
                            String strValueOf = "";
                            Object obj = closeable2;
                            if (str != null) {
                                stringTokenizer2 = new StringTokenizer(str, ",; ");
                                if (stringTokenizer2.hasMoreTokens()) {
                                    obj = stringTokenizer2;
                                    strNextToken = stringTokenizer2.nextToken();
                                    stringTokenizer = stringTokenizer2;
                                } else {
                                    obj = stringTokenizer2;
                                    strNextToken = "";
                                    stringTokenizer = obj;
                                }
                            } else {
                                obj = stringTokenizer2;
                                strNextToken = "";
                                stringTokenizer = obj;
                            }
                            if (!"multipart/form-data".equalsIgnoreCase(strNextToken)) {
                                StringBuilder sb = new StringBuilder();
                                char[] cArr = new char[512];
                                for (int i4 = bufferedReader.read(cArr); i4 >= 0 && !strValueOf.endsWith("\r\n"); i4 = bufferedReader.read(cArr)) {
                                    strValueOf = String.valueOf(cArr, 0, i4);
                                    sb.append(strValueOf);
                                }
                                String strTrim = sb.toString().trim();
                                if ("application/x-www-form-urlencoded".equalsIgnoreCase(strNextToken)) {
                                    decodeParams(strTrim, this.h);
                                } else if (strTrim.length() != 0) {
                                    map.put("postData", strTrim);
                                }
                            } else {
                                if (!stringTokenizer.hasMoreTokens()) {
                                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                                }
                                String strSubstring = str.substring(str.indexOf("boundary=") + 9, str.length());
                                if (strSubstring.startsWith("\"") && strSubstring.endsWith("\"")) {
                                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                                }
                                decodeMultipartData(strSubstring, map2, bufferedReader, this.h, map);
                            }
                        } else if (Method.PUT.equals(this.g)) {
                            map.put("content", saveTmpFile(map2, 0, map2.limit()));
                        }
                        NanoHTTPD.safeClose(tmpBucket);
                        NanoHTTPD.safeClose(bufferedReader);
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = tmpBucket;
                        closeable = closeable2;
                        NanoHTTPD.safeClose(randomAccessFile);
                        NanoHTTPD.safeClose(closeable);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface j {
        void execute() throws IOException;

        d getCookies();

        Map<String, String> getHeaders();

        InputStream getInputStream();

        Method getMethod();

        Map<String, String> getParms();

        String getQueryParameterString();

        String getUri();

        void parseBody(Map<String, String> map) throws Exception;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface k {
        void delete() throws Exception;

        String getName();

        OutputStream open() throws Exception;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface l {
        void clear();

        k createTempFile() throws Exception;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface m {
        l create();
    }

    public NanoHTTPD(String str, int i2, String str2) {
        this.a = str;
        this.b = i2;
        setTempFileManagerFactory(new h(str2));
        setAsyncRunner(new e());
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public synchronized void closeAllConnections() {
        Iterator<Socket> it = this.d.iterator();
        while (it.hasNext()) {
            safeClose(it.next());
        }
    }

    public String decodePercent(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public final boolean isAlive() {
        return wasStarted() && !this.c.isClosed() && this.e.isAlive();
    }

    public synchronized void registerConnection(Socket socket) {
        this.d.add(socket);
    }

    public Response serve(j jVar) {
        HashMap map = new HashMap();
        Method method = jVar.getMethod();
        if (Method.PUT.equals(method) || Method.POST.equals(method)) {
            try {
                jVar.parseBody(map);
            } catch (ResponseException e2) {
                return new Response(e2.getStatus(), "text/plain", e2.getMessage());
            } catch (IOException e3) {
                return new Response(Response.Status.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e3.getMessage());
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        jVar.getParms().put("NanoHttpd.QUERY_STRING", jVar.getQueryParameterString());
        return serve();
    }

    public void setAsyncRunner(b bVar) {
        this.f = bVar;
    }

    public void setTempFileManagerFactory(m mVar) {
        this.g = mVar;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        this.c = serverSocket;
        serverSocket.bind(this.a != null ? new InetSocketAddress(this.a, this.b) : new InetSocketAddress(this.b));
        Thread thread = new Thread(new a());
        this.e = thread;
        thread.setDaemon(true);
        this.e.setName("NanoHttpd Main Listener");
        this.e.start();
    }

    public void stop() {
        safeClose(this.c);
        try {
            closeAllConnections();
        } catch (Throwable unused) {
        }
        try {
            Thread thread = this.e;
            if (thread != null) {
                thread.join();
            }
        } catch (Throwable unused2) {
        }
    }

    public synchronized void unRegisterConnection(Socket socket) {
        this.d.remove(socket);
    }

    public final boolean wasStarted() {
        return (this.c == null || this.e == null) ? false : true;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class ResponseException extends Exception {
        private final Response.Status status;

        public ResponseException(Response.Status status, String str) {
            super(str);
            this.status = status;
        }

        public Response.Status getStatus() {
            return this.status;
        }

        public ResponseException(Response.Status status, String str, Exception exc) {
            super(str, exc);
            this.status = status;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void safeClose(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void safeClose(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class d implements Iterable<String> {
        private HashMap<String, String> a = new HashMap<>();
        private ArrayList<c> b = new ArrayList<>();

        public d(Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] strArrSplit = str2.trim().split("=");
                    if (strArrSplit.length == 2) {
                        this.a.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }

        public void delete(String str) {
            set(str, "-delete-", -30);
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.a.keySet().iterator();
        }

        public String read(String str) {
            return this.a.get(str);
        }

        public void set(String str, String str2, int i) {
            this.b.add(new c(str, str2, c.getHTTPTime(i)));
        }

        public void unloadQueue(Response response) {
            ArrayList<c> arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                c cVar = arrayList.get(i);
                i++;
                response.addHeader("Set-Cookie", cVar.getHTTPHeader());
            }
        }

        public void set(c cVar) {
            this.b.add(cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Response {
        private a a;
        private String b;
        protected InputStream c;
        protected Map<String, String> d;
        private Method e;
        private boolean f;
        private boolean g;

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public enum Status implements a {
            SWITCH_PROTOCOL(XCreateApException.CODE_CLOSE_AP, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(MotionKeyTrigger.TYPE_VIEW_TRANSITION_ON_CROSS, "Moved Permanently"),
            NOT_MODIFIED(MotionKeyTrigger.TYPE_POST_LAYOUT, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(XCreateApException.CODE_IP_NULL, "Internal Server Error");

            private final String description;
            private final int requestStatus;

            Status(int i, String str) {
                this.requestStatus = i;
                this.description = str;
            }

            @Override // com.userlabs.xshare.core.NanoHTTPD.Response.a
            public String getDescription() {
                return "" + this.requestStatus + " " + this.description;
            }

            @Override // com.userlabs.xshare.core.NanoHTTPD.Response.a
            public int getRequestStatus() {
                return this.requestStatus;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public interface a {
            String getDescription();

            int getRequestStatus();
        }

        public Response(a aVar, String str, String str2) {
            ByteArrayInputStream byteArrayInputStream;
            this.d = new HashMap();
            this.a = aVar;
            this.b = str;
            if (str2 != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(str2.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                byteArrayInputStream = null;
            }
            this.c = byteArrayInputStream;
        }

        private boolean headerAlreadySent(Map<String, String> map, String str) {
            Iterator<String> it = map.keySet().iterator();
            boolean zEqualsIgnoreCase = false;
            while (it.hasNext()) {
                zEqualsIgnoreCase |= it.next().equalsIgnoreCase(str);
            }
            return zEqualsIgnoreCase;
        }

        public void addHeader(String str, String str2) {
            this.d.put(str, str2);
        }

        public InputStream getData() {
            return this.c;
        }

        public String getMimeType() {
            return this.b;
        }

        public Method getRequestMethod() {
            return this.e;
        }

        public a getStatus() {
            return this.a;
        }

        public boolean isChunkedTransfer() {
            return this.f;
        }

        public void send(OutputStream outputStream) {
            String str = this.b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(y.getGMT());
            try {
                try {
                    if (this.a == null) {
                        throw new Error("sendResponse(): Status can't be null.");
                    }
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    printWriter.print("HTTP/1.1 " + this.a.getDescription() + " \r\n");
                    if (str != null) {
                        printWriter.print("Content-Type: " + str + "\r\n");
                    }
                    Map<String, String> map = this.d;
                    if (map == null || map.get("Date") == null) {
                        printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                    }
                    Map<String, String> map2 = this.d;
                    if (map2 != null) {
                        for (String str2 : map2.keySet()) {
                            printWriter.print(str2 + ": " + this.d.get(str2) + "\r\n");
                        }
                    }
                    sendConnectionHeaderIfNotAlreadyPresent(printWriter, this.d);
                    if (this.e == Method.HEAD || !this.f) {
                        InputStream inputStream = this.c;
                        int iAvailable = inputStream != null ? inputStream.available() : 0;
                        sendContentLengthHeaderIfNotAlreadyPresent(printWriter, this.d, iAvailable);
                        printWriter.print("\r\n");
                        printWriter.flush();
                        sendAsFixedLength(outputStream, iAvailable);
                    } else {
                        sendAsChunked(outputStream, printWriter);
                    }
                    outputStream.flush();
                    sendSuccess();
                    NanoHTTPD.safeClose(this.c);
                } catch (IOException e) {
                    sendFailed(e);
                }
            } catch (Throwable th) {
                NanoHTTPD.safeClose(this.c);
                throw th;
            }
        }

        public void sendAsChunked(OutputStream outputStream, PrintWriter printWriter) throws IOException {
            printWriter.print("Transfer-Encoding: chunked\r\n");
            printWriter.print("\r\n");
            printWriter.flush();
            byte[] bytes = "\r\n".getBytes();
            byte[] bArr = new byte[16384];
            while (true) {
                int i = this.c.read(bArr);
                if (i <= 0) {
                    outputStream.write("0\r\n\r\n".getBytes());
                    return;
                } else {
                    outputStream.write(String.format(Locale.US, "%x\r\n", Integer.valueOf(i)).getBytes());
                    outputStream.write(bArr, 0, i);
                    outputStream.write(bytes);
                }
            }
        }

        public void sendAsFixedLength(OutputStream outputStream, int i) throws IOException {
            if (this.e == Method.HEAD || this.c == null) {
                return;
            }
            byte[] bArr = new byte[16384];
            while (true) {
                int i2 = this.c.read(bArr);
                if (i2 <= 0) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            }
        }

        public void sendConnectionHeaderIfNotAlreadyPresent(PrintWriter printWriter, Map<String, String> map) {
            if (headerAlreadySent(map, "connection")) {
                return;
            }
            printWriter.print("Connection: keep-alive\r\n");
        }

        public void sendContentLengthHeaderIfNotAlreadyPresent(PrintWriter printWriter, Map<String, String> map, long j) {
            if (headerAlreadySent(map, "content-length")) {
                return;
            }
            printWriter.print("Content-Length: " + j + "\r\n");
        }

        public void setChunkedTransfer(boolean z) {
            this.f = z;
        }

        public void setData(InputStream inputStream) {
            this.c = inputStream;
        }

        public void setRequestMethod(Method method) {
            this.e = method;
        }

        public void setStatus(Status status) {
            this.a = status;
        }

        public void sendSuccess() {
        }

        public void sendFailed(Exception exc) {
        }

        public Response(a aVar, String str, InputStream inputStream) {
            this.d = new HashMap();
            this.a = aVar;
            this.b = str;
            this.c = inputStream;
        }

        public Response(a aVar, String str, InputStream inputStream, boolean z) {
            this(aVar, str, inputStream);
            this.g = z;
        }

        public Response(String str) {
            this(Status.OK, "text/html", str);
        }

        public Response(a aVar, String str, byte[] bArr) {
            this.d = new HashMap();
            this.a = aVar;
            this.b = str;
            this.c = bArr != null ? new ByteArrayInputStream(bArr) : null;
        }
    }

    @Deprecated
    public Response serve() {
        return new Response(Response.Status.NOT_FOUND, "text/plain", "Not Found");
    }
}
