/*

######################################################################
#
# File: Main.java
#
# Copyright (c) 2017, Adam W. Dace.  All Rights Reserved.
# Please see the accompanying LICENSE file for license information.
#
######################################################################

*/

package com.github.consolereader;

import java.lang.*;
import com.github.consolereader.*;

class Main
{
    public static void main(String args[])
    {
        Console myInstance;

        System.out.println("INFO:  Starting Console v0.1...");

        System.out.println("INFO:  Valid Java JDK v" +
                           System.getProperty("java.version") + " on " +
                           System.getProperty("os.name") + " v" +
                           System.getProperty("os.version"));

        myInstance = new Console();

        // TODO: Error checking.
        if (myInstance.load())
            myInstance.run();
    }
}
