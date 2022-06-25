package colorava;

//By MIMYC

public class c
{
    // Foreground colors:

    public final static String black = "\u001B[30m";
    public final static String red = "\u001B[31m";
    public final static String green = "\u001B[32m";
    public final static String yellow = "\u001B[33m";
    public final static String blue = "\u001B[34m";
    public final static String purple = "\u001B[35m";
    public final static String cyan = "\u001B[36m";
    public final static String white = "\u001B[37m";

    //Background colors:
    public final static String bgblack = "\u001B[40m";
    public final static String bgred = "\u001B[41m";
    public final static String bggreen = "\u001B[42m";
    public final static String bgyellow = "\u001B[43m";
    public final static String bgblue = "\u001B[44m";
    public final static String bgpurple = "\u001B[45m";
    public final static String bgcyan = "\u001B[46m";
    public final static String bgwhite = "\u001B[47m";

    //The reset statement
    public final static String reset = "\u001B[0m";

    public static void test()
    {
        System.out.println(black + "Black");
        System.out.println(red + "Red");
        System.out.println(green + "Green");
        System.out.println(yellow + "Yellow");
        System.out.println(blue + "Blue");
        System.out.println(purple + "Purple");
        System.out.println(cyan + "Cyan");
        System.out.println(white + "White");
    }
}