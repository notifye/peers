/*
    This file is part of Peers.

    Peers is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Peers is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
    
    Copyright 2007 Yohann Martineau 
*/

package net.sourceforge.peers.sdp;

public class RFC4566 {

    public static final char VERSION = '0';
    
    public static final char TYPE_VERSION    = 'v';
    public static final char TYPE_ORIGIN     = 'o';
    public static final char TYPE_SUBJECT    = 's';
    public static final char TYPE_INFO       = 'i';
    public static final char TYPE_URI        = 'u';
    public static final char TYPE_EMAIL      = 'e';
    public static final char TYPE_PHONE      = 'p';
    public static final char TYPE_CONNECTION = 'c';
    public static final char TYPE_BANDWITH   = 'b';
    public static final char TYPE_TIME       = 't';
    public static final char TYPE_REPEAT     = 'r';
    public static final char TYPE_ZONE       = 'z';
    public static final char TYPE_KEY        = 'k';
    public static final char TYPE_ATTRIBUTE  = 'a';
    public static final char TYPE_MEDIA      = 'm';
    
    public static final char SEPARATOR = '=';
    public static final char ATTR_SEPARATOR = ':';
}