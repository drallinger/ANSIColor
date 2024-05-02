package com.drallinger.ansicolor;

public class ANSIColor {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static String black(String str){
        return color(ANSI_BLACK, str);
    }

    public static String red(String str){
        return color(ANSI_RED, str);
    }

    public static String green(String str){
        return color(ANSI_GREEN, str);
    }

    public static String yellow(String str){
        return color(ANSI_YELLOW, str);
    }

    public static String blue(String str){
        return color(ANSI_BLUE, str);
    }

    public static String purple(String str){
        return color(ANSI_PURPLE, str);
    }

    public static String cyan(String str){
        return color(ANSI_CYAN, str);
    }

    public static String white(String str){
        return color(ANSI_WHITE, str);
    }

    public static String blackBackground(String str){
        return color(ANSI_BLACK_BACKGROUND, str);
    }

    public static String redBackground(String str){
        return color(ANSI_RED_BACKGROUND, str);
    }

    public static String greenBackground(String str){
        return color(ANSI_GREEN_BACKGROUND, str);
    }

    public static String yellowBackground(String str){
        return color(ANSI_YELLOW_BACKGROUND, str);
    }

    public static String blueBackground(String str){
        return color(ANSI_BLUE_BACKGROUND, str);
    }

    public static String purpleBackground(String str){
        return color(ANSI_PURPLE_BACKGROUND, str);
    }

    public static String cyanBackground(String str){
        return color(ANSI_CYAN_BACKGROUND, str);
    }

    public static String whiteBackground(String str){
        return color(ANSI_WHITE_BACKGROUND, str);
    }

    private static String color(String color, String str){
        return color + str + ANSI_RESET;
    }
}
