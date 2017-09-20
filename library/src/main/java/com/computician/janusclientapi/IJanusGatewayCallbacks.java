package com.computician.janusclientapi;

import org.webrtc.PeerConnection;

import java.util.List;

/**
 * Created by ben.trent on 5/7/2015.
 */
public interface IJanusGatewayCallbacks extends IJanusCallbacks {
    void onSuccess();

    void onDestroy();

    String getServerUri();

    List<PeerConnection.IceServer> getIceServers();

    Boolean getIpv6Support();

    Integer getMaxPollEvents();
}
