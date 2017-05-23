<!--

######################################################################
#
# File: INSTALL.md
#
# Copyright (c) 2017, Adam W. Dace.  All Rights Reserved.
# Please see the accompanying LICENSE file for license information.
#
######################################################################

-->

# Console Reader
## Description
An attempt to create a lightweight Java library for receiving and processing
console input.

## Other Projects
In researching whether I should write this library, I did find a number of
other projects that provide similar functionality.  This file documents
those findings.

# JLine
Website: http://jline.sourceforge.net/

Description: While this sounds like a pretty neat API, it does use JNI
and I'm trying to avoid that.

# laterna
Website: https://github.com/mabe02/lanterna

Description: This also seems like a pretty amazing library.  However, it's
more oriented towards curses-style development and that's a bit more than
I need.

# Spring shell
Website: http://projects.spring.io/spring-shell/

Description: This comes about as close as I could want to a complete API
for what I want to accomplish.  That said, it doesn't seem to be under
active development and the issues list looked a bit too much for me.
I'd love to use this API, I just don't want to be stuck maintaining it.  :)
