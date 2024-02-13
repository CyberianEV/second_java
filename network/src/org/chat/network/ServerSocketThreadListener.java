package org.chat.network;

import java.net.ServerSocket;
import java.net.Socket;

public interface ServerSocketThreadListener {
    void onServerStart(ServerSocketThread thread);
    void onServerStop(ServerSocketThread thread);
    void onServerSocketCreated(ServerSocketThread t, ServerSocket s);
    void onServerSoTimeout(ServerSocketThread t, ServerSocket s);
    void onSocketAccepted(ServerSocketThread t, ServerSocket s, Socket client);
    void onServerException(ServerSocketThread t, Throwable e);
}
