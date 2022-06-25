Colorava

Colorama but for Java!

If you don't know what colorama is, it's just a tool to print colored text instead of the boring white text in the console

How to:

-> Clone the repository
-> Place the colorava folder in your java project's directory
-> import the c class of colorava in the class you want to use it (import colorava.c;)
-> Profit.

Examples:

System.out.println(c.red + "Hello");
This will print the text "Hello" with red colour.

System.out.println(c.bgyellow + c.red + "Hello");
This will print the text "Hello" with red colour along with yellow background.

Supported Colours:

black
red
green
yellow
blue
purple
cyan
white

Note: To set the background colour, just add bg as a prefix eg. if you want the background as green, type "bggreen".

Make sure to use "reset" as a color when you want to revert back to the original text
