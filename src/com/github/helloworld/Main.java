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

package com.github.helloworld;

import java.lang.*;
import com.github.helloworld.*;

class Main
{
    public static void main(String args[])
    {
        ConsoleReader myInstance;

        System.out.println("INFO:  Starting HelloWorld v0.1...");

        myInstance = new Greeter();

        // TODO: Error checking.
        if (myInstance.load())
        {
            if (myInstance.run())
                exit(0);
            else
                exit(1);
        }
    }
}
