package com.userlabs.xshare.utils;

import android.text.TextUtils;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    private static HashMap<String, Cipher> a = new HashMap<>(8);
    private static HashMap<String, Cipher> b = new HashMap<>(8);
    private static String c = "0";
    private static String[][] d = null;

    static {
        initConfTable();
        initCipher();
    }

    public static synchronized byte[] decrypt(byte[] bArr, String str) {
        Cipher cipher = b.get(str);
        if (cipher == null) {
            cipher = b.get(c);
        }
        try {
            try {
                return cipher.doFinal(bArr);
            } catch (Exception unused) {
                return bArr;
            }
        } catch (BadPaddingException unused2) {
            Cipher cipher2 = Cipher.getInstance("AES/CBC/NoPadding");
            cipher2.init(2, getSecretKey(str));
            return cipher2.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return bArr;
        }
    }

    public static synchronized String decryptContainsVersionInfoValue(String str) {
        try {
            try {
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.d("AES", "decryptContainsVersionInfoValue encrypted=" + str);
                }
                if (TextUtils.isEmpty(str)) {
                    return str;
                }
                String myEncryptVersion = getMyEncryptVersion(str);
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.d("AES", "decryptContainsVersionInfoValue version=" + myEncryptVersion);
                }
                if (TextUtils.isEmpty(myEncryptVersion)) {
                    return str;
                }
                String strDecrypt = TextUtils.equals(myEncryptVersion, "1.0.0") ? decrypt("835b2586a428d128", "RandomInitVector", removeMyEncryptHeader(str)) : new String(decrypt(c.decode(removeMyEncryptHeader(str)), myEncryptVersion));
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.d("AES", "decryptContainsVersionInfoValue decrypted=" + strDecrypt);
                }
                if (!TextUtils.isEmpty(strDecrypt)) {
                    return strDecrypt;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static synchronized byte[] decryptResult(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, String str) {
        byte[] bArrDoFinal;
        bArrDoFinal = null;
        try {
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, ivParameterSpec);
                bArrDoFinal = cipher.doFinal(c.decode(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (BadPaddingException unused) {
            Cipher cipher2 = Cipher.getInstance("AES/CBC/NoPadding");
            cipher2.init(2, secretKeySpec, ivParameterSpec);
            bArrDoFinal = cipher2.doFinal(c.decode(str));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return bArrDoFinal;
    }

    public static synchronized byte[] encrypt(byte[] bArr, String str) throws Exception {
        try {
            Cipher cipher = a.get(str);
            if (cipher == null) {
                cipher = a.get(c);
            }
            if (cipher == null) {
                return bArr;
            }
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static synchronized String encryptUseVersion(String str, String str2) {
        try {
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("AES", "encryptUseVersion version=" + str + ",value=" + str2);
            }
            if (TextUtils.isEmpty(str2)) {
                return str2;
            }
            String strEncode = c.encode(encrypt(str2.getBytes(), str));
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("AES", "encryptUseVersion encrypted=" + strEncode);
            }
            if (!TextUtils.isEmpty(strEncode)) {
                return "${" + str + "}_" + strEncode;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
        return str2;
    }

    public static String encryptUseVersion100(String str) {
        return encryptUseVersion("1.0.0", str);
    }

    public static String encryptUseVersion101(String str) {
        return encryptUseVersion("1.0.1", str);
    }

    public static String encryptUseVersion102(String str) {
        return encryptUseVersion("1.0.2", str);
    }

    public static String encryptUseVersion103(String str) {
        return encryptUseVersion("1.0.3", str);
    }

    private static String getMyEncryptVersion(String str) {
        return (!str.startsWith("${") || str.indexOf("}_") == 0) ? "" : str.substring(str.indexOf(123) + 1, str.lastIndexOf(125));
    }

    private static SecretKey getSecretKey(String str) {
        for (String[] strArr : d) {
            if (TextUtils.equals(strArr[0], str)) {
                return new SecretKeySpec(n.string2Byte(strArr[1]), strArr[2]);
            }
        }
        return null;
    }

    private static void initCipher() {
        for (String[] strArr : d) {
            String str = strArr[0];
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(n.string2Byte(strArr[1]), strArr[2]);
                Cipher cipher = Cipher.getInstance(strArr[3]);
                cipher.init(1, secretKeySpec);
                Cipher cipher2 = Cipher.getInstance(strArr[4]);
                cipher2.init(2, secretKeySpec);
                a.put(str, cipher);
                b.put(str, cipher2);
            } catch (Throwable unused) {
            }
        }
    }

    private static void initConfTable() {
        d = new String[][]{new String[]{"1.0.0", "00118c9b7604620d7c73f720639de613", "AES", "AES/ECB/PKCS5Padding", "AES/ECB/NoPadding", " ( 'platform' in ['android','ipad','iphone'] ) && ('apiv' < 23)"}, new String[]{"1.0.1", "5a829260a92fe5e2ff3d1e6216299355", "AES", "AES/ECB/PKCS5Padding", "AES/ECB/PKCS5Padding", " ( 'platform' == 'android' ) ) && ('apiv' >= 23)"}, new String[]{"1.0.2", "52e5dcc0909da93b729e542fb6cec6f6", "AES", "AES/ECB/PKCS5Padding", "AES/ECB/NoPadding", " ( 'platform' in [ 'ipad','iphone'] ) && ('apiv' >= 23)"}, new String[]{"1.0.3", "7c271333292846209e959d70ed3200a5", "AES", "AES/ECB/PKCS5Padding", "AES/ECB/PKCS5Padding", " ( 'platform' == 'android' ) ) && ('apiv' >= 23)"}};
    }

    private static String removeMyEncryptHeader(String str) {
        return str.substring(str.indexOf(95) + 1);
    }

    public static synchronized String decrypt(String str, String str2, String str3) {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new String(decryptResult(new SecretKeySpec(str.getBytes("UTF-8"), "AES"), new IvParameterSpec(str2.getBytes("UTF-8")), str3));
    }
}
