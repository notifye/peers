/*
    This file is part of Peers, a java SIP softphone.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
    Copyright 2012 Yohann Martineau 
*/

package net.sourceforge.peers;

import java.net.InetAddress;

import net.sourceforge.peers.media.MediaMode;
import net.sourceforge.peers.sip.syntaxencoding.SipURI;

public class JavaConfig implements Config {

    private InetAddress localInetAddress;
    private InetAddress publicInetAddress;
    private String userPart;
    private String domain;
    private String password;
    private SipURI outboundProxy;
    private int sipPort;
    private MediaMode mediaMode;
    private boolean mediaDebug;
    private String mediaFile;
    private int rtpPort;
    private String authorizationUsername;

    
    public void save() {
        throw new RuntimeException("not implemented");
    }

    
    public InetAddress getLocalInetAddress() {
        return localInetAddress;
    }

    
    public InetAddress getPublicInetAddress() {
        return publicInetAddress;
    }

    
    public String getUserPart() {
        return userPart;
    }

    
    public String getDomain() {
        return domain;
    }

    
    public String getPassword() {
        return password;
    }

    
    public SipURI getOutboundProxy() {
        return outboundProxy;
    }

    
    public int getSipPort() {
        return sipPort;
    }

    
    public MediaMode getMediaMode() {
        return mediaMode;
    }

    
    public boolean isMediaDebug() {
        return mediaDebug;
    }

    
    public int getRtpPort() {
        return rtpPort;
    }

    public String getAuthorizationUsername() {
        return authorizationUsername;
    }

    
    public void setLocalInetAddress(InetAddress inetAddress) {
        localInetAddress = inetAddress;
    }

    
    public void setPublicInetAddress(InetAddress inetAddress) {
        publicInetAddress = inetAddress;
    }

    
    public void setUserPart(String userPart) {
        this.userPart = userPart;
    }

    
    public void setDomain(String domain) {
        this.domain = domain;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public void setOutboundProxy(SipURI outboundProxy) {
        this.outboundProxy = outboundProxy;
    }

    
    public void setSipPort(int sipPort) {
        this.sipPort = sipPort;
    }

    
    public void setMediaMode(MediaMode mediaMode) {
        this.mediaMode = mediaMode;
    }

    
    public void setMediaDebug(boolean mediaDebug) {
        this.mediaDebug = mediaDebug;
    }

    
    public void setRtpPort(int rtpPort) {
        this.rtpPort = rtpPort;
    }

    public void setAuthorizationUsername(String authorizationUsername) {
        this.authorizationUsername = authorizationUsername;
    }

    
    public String getMediaFile() {
        return mediaFile;
    }

    
    public void setMediaFile(String mediaFile) {
        this.mediaFile = mediaFile;
    }

}
