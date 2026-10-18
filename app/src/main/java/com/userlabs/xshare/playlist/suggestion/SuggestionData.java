package com.userlabs.xshare.playlist.suggestion;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class SuggestionData {
    private String result;
    private String suggestionKey;

    public SuggestionData(String str, String str2) {
        this.suggestionKey = str;
        this.result = str2;
    }

    public String getResult() {
        return this.result;
    }

    public String getSuggestionKey() {
        return this.suggestionKey;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setSuggestionKey(String str) {
        this.suggestionKey = str;
    }
}
