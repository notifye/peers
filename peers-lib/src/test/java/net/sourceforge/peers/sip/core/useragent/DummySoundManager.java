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
    
    Copyright 2013 Yohann Martineau 
*/
package net.sourceforge.peers.sip.core.useragent;

import net.sourceforge.peers.media.AbstractSoundManager;

public class DummySoundManager extends AbstractSoundManager {

    
    public byte[] readData() {
        return null;
    }

    
    public void init() {
    }

    
    public void close() {
    }

    
    public int writeData(byte[] buffer, int offset, int length) {
        return 0;
    }

}
