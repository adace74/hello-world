/*

######################################################################
#
# File: Console.java
#
# Copyright (c) 2017, Adam W. Dace.  All Rights Reserved.
# Please see the accompanying LICENSE file for license information.
#
######################################################################

*/

package com.github.consolereader;

import java.lang.*;
import java.io.*;

class ConsoleReader
{
    // Load settings.

    public boolean load()
    {
        return true;
    }

    // Run program.

    public boolean run()
    {
        String myInput = "";

        System.out.println("Hello World!");
        System.out.println("INFO: Various information.");

        myInput = this.readLine("DCL");

        System.out.println("INFO: Recevied input: " + myInput);

        return true;
    }

    public String readLine(String PassedPrompt)
    {
        Console myConsole = null;
        String myLine = "";

        myConsole = System.console();
        if (myConsole == null)
        {
            System.out.println("ERROR: No console available.");

            System.exit(1);
        }

        // System.out.println(PassedPrompt);
        myLine = myConsole.readLine(PassedPrompt);

        return myLine;
    }
}
