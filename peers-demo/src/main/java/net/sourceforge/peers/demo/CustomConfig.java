package net.sourceforge.peers.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import net.sourceforge.peers.Config;
import net.sourceforge.peers.media.MediaMode;
import net.sourceforge.peers.sip.syntaxencoding.SipURI;

public class CustomConfig implements Config {

    private InetAddress publicIpAddress;

    
    public InetAddress getLocalInetAddress() {
        InetAddress inetAddress;
        try {
            // if you have only one active network interface, getLocalHost()
            // should be enough
            //inetAddress = InetAddress.getLocalHost();
            // if you have several network interfaces like I do,
            // select the right one after running ipconfig or ifconfig
            inetAddress = InetAddress.getByName("192.168.1.10");
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
        return inetAddress;
    }

    
    public InetAddress getPublicInetAddress() { return publicIpAddress; }
     public String getUserPart() { return "alice"; }
     public String getDomain() { return "atlanta.com"; }
     public String getPassword() { return "secret1234"; }
    
    public MediaMode getMediaMode() { return MediaMode.captureAndPlayback; }

     public String getAuthorizationUsername() { return getUserPart(); }

    
    public void setPublicInetAddress(InetAddress inetAddress) {
        publicIpAddress = inetAddress;
    }
    
     public SipURI getOutboundProxy() { return null; }
     public int getSipPort() { return 0; }
     public boolean isMediaDebug() { return false; }
     public String getMediaFile() { return null; }
     public int getRtpPort() { return 0; }
     public void setLocalInetAddress(InetAddress inetAddress) { }
     public void setUserPart(String userPart) { }
     public void setDomain(String domain) { }
     public void setPassword(String password) { }
     public void setOutboundProxy(SipURI outboundProxy) { }
     public void setSipPort(int sipPort) { }
     public void setMediaMode(MediaMode mediaMode) { }
     public void setMediaDebug(boolean mediaDebug) { }
     public void setMediaFile(String mediaFile) { }
     public void setRtpPort(int rtpPort) { }
     public void save() { }
     public void setAuthorizationUsername(String authorizationUsername) { }
    
}
