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
        Greeter myInstance;

        System.out.println("INFO:  Starting HelloWorld v0.1...");

        myInstance = new Greeter();

        // TODO: Error checking.
        if (myInstance.load())
        {
            if (myInstance.run())
                System.exit(0);
            else
                System.exit(1);
        }
    }
}
