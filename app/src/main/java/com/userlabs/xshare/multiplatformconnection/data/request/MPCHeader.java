package com.userlabs.xshare.multiplatformconnection.data.request;

import com.userlabs.xshare.core.preferences.a;
import com.userlabs.xshare.multiplatformconnection.client.f;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class MPCHeader {
    private String cmd;
    private int cmd_code;
    private String cmd_name;
    private String d_id;
    private String req_id;
    private String session_id;
    private int ver;

    public static String generateReqId() {
        return System.currentTimeMillis() + "-" + (new Random().nextInt(9000) + 1000);
    }

    public static MPCHeader newInstance(String str, int i) {
        MPCHeader mPCHeader = new MPCHeader();
        mPCHeader.setCmd(str);
        mPCHeader.setCmd_name(str);
        mPCHeader.setCmd_code(i);
        mPCHeader.setSession_id(f.getInstance().getSessionId());
        mPCHeader.setReq_id(generateReqId());
        mPCHeader.setD_id(a.getDevice_Id());
        mPCHeader.setVer(15);
        return mPCHeader;
    }

    public static MPCHeader newRespInstance(String str, int i, String str2) {
        MPCHeader mPCHeader = new MPCHeader();
        mPCHeader.setCmd(str);
        mPCHeader.setCmd_name(str);
        mPCHeader.setCmd_code(i);
        mPCHeader.setSession_id(f.getInstance().getSessionId());
        mPCHeader.setReq_id(str2);
        mPCHeader.setD_id(a.getDevice_Id());
        mPCHeader.setVer(15);
        return mPCHeader;
    }

    public String getCmd() {
        return this.cmd;
    }

    public int getCmd_code() {
        return this.cmd_code;
    }

    public String getCmd_name() {
        return this.cmd_name;
    }

    public String getD_id() {
        return this.d_id;
    }

    public String getReq_id() {
        return this.req_id;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public int getVer() {
        return this.ver;
    }

    public void setCmd(String str) {
        this.cmd = str;
    }

    public void setCmd_code(int i) {
        this.cmd_code = i;
    }

    public void setCmd_name(String str) {
        this.cmd_name = str;
    }

    public void setD_id(String str) {
        this.d_id = str;
    }

    public void setReq_id(String str) {
        this.req_id = str;
    }

    public void setSession_id(String str) {
        this.session_id = str;
    }

    public void setVer(int i) {
        this.ver = i;
    }
}
