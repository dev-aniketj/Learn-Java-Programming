package com.aniket.java.solid;

/**
 * D - Dependency Inversion Principle
 */

// Application Layer - High Level Module
class MyMessenger {
    //interface ref variable
    ProtocolHandler handler;

    MyMessenger(String protocol) {
        handler = ProtocolHandlerFactory.getProtocolHandler(protocol);
    }

    public void send(String to, String message) {
        handler.sendMessage("message to " + to + ", message is : " + message);
    }
}

interface ProtocolHandler {
    void sendMessage(String message);
}

// Transport Layer - Low Level Module
class TCPProtocolHandler implements ProtocolHandler {

    @Override
    public void sendMessage(String message) {
        System.out.println("TCP Protocol Handler sending message : \n" + message);
    }
}

class UDPProtocolHandler implements ProtocolHandler {

    @Override
    public void sendMessage(String message) {
        System.out.println("UDP Protocol Handler sending message : \n" + message);
    }
}

class ProtocolHandlerFactory {
    public static ProtocolHandler getProtocolHandler(String protocol) {
        if ("TCP".equalsIgnoreCase(protocol)) {
            return new TCPProtocolHandler();
        } else if ("UDP".equalsIgnoreCase(protocol)) {
            return new UDPProtocolHandler();
        }
        return null;
    }
}

public class SolidEx5 {


    public static void main(String[] args) {
        MyMessenger messenger = new MyMessenger("tcp");
        messenger.send("aniket", "submit your DSA assignment");
    }
}
