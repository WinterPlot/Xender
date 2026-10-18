package com.userlabs.xshare.core.join;

import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class p {
    private final g b;
    private final String d;
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicReference<q> c = new AtomicReference<>();
    private final Map<String, q> e = new HashMap();

    public p(String str, g gVar) {
        this.d = str;
        this.b = gVar;
    }

    private void checkParamsValid(Network network) {
        q qVar = this.e.get(network.toString());
        if (qVar != null && qVar.isWifiNetworkCapabilities() && qVar.acceptNetwork(network) && qVar.checkParams()) {
            this.c.set(qVar);
            this.a.set(true);
            g gVar = this.b;
            if (gVar != null) {
                gVar.onTargetNetAvailable(network, qVar);
            }
        }
    }

    public void onAvailable(Network network) {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.e("join_ap", "onAvailable :" + network);
        }
        this.e.put(network.toString(), new q(this.d));
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        q qVar;
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.e("join_ap", "onCapabilitiesChanged network:" + network + ", networkCapabilities:" + networkCapabilities);
            StringBuilder sb = new StringBuilder("hasTransport wifi :");
            sb.append(networkCapabilities.hasTransport(1));
            com.userlabs.xshare.core.log.h.d("join_ap", sb.toString());
            com.userlabs.xshare.core.log.h.d("join_ap", "hasCapability Validated :" + networkCapabilities.hasCapability(16));
        }
        if (this.a.get() || (qVar = this.e.get(network.toString())) == null) {
            return;
        }
        qVar.acceptAndSetAPI29(networkCapabilities, network);
        checkParamsValid(network);
    }

    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        q qVar;
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.e("join_ap", "onLinkPropertiesChanged network:" + network + ", linkProperties:" + linkProperties);
        }
        if (this.a.get() || (qVar = this.e.get(network.toString())) == null) {
            return;
        }
        qVar.acceptAndSetAPI29(linkProperties, network);
        checkParamsValid(network);
    }

    public void onLost(Network network) {
        g gVar;
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.e("join_ap", "onLost :" + network);
        }
        q qVar = this.c.get();
        if (qVar == null || !qVar.acceptNetwork(network) || (gVar = this.b) == null) {
            return;
        }
        gVar.onNetworkLost(network);
    }

    public void onUnavailable() {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.e("join_ap", "onUnavailable");
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.onTargetNetUnavailable();
        }
    }
}
