package myLib.output;

public class console {
    
    // Class for all printing methods

    private console(){} // making the constructor private
    // Newline - String
    public static void println(String msg) {
        System.out.println(msg);
    }

    // Newline - Character
    public static void println(char ch) {
        System.out.println(ch);
    }

    // Newline - Integer
    public static void println(int num) {
        System.out.println(num);
    }

    // Newline - Double
    public static void println(double d) {
        System.out.println(d);
    }

    // Newline - Float
    public static void println(float f) {
        System.out.println(f);
    }

    // Newline - Boolean
    public static void println(boolean b) {
        System.out.println(b);
    }

// ================================================

    // Sameline - String
    public static void print(String msg) {
        System.out.print(msg);
    }

    // Sameline - Character
    public static void print(char ch) {
        System.out.print(ch);
    }

    // Sameline - Integer
    public static void print(int num) {
        System.out.print(num);
    }

    // Sameline - Double
    public static void print(double d) {
        System.out.print(d);
    }

    // Sameline - Float
    public static void print(float f) {
        System.out.print(f);
    }

    // Sameline - Boolean
    public static void print(boolean b) {
        System.out.print(b);
    }

// ================================================

    // Printing arrays

    // Newline - String array
    public static void println(String str[]) {
        for (String s:str) {
            println(s);
        }
    }

    // Newline - Integer array
    public static void println(int number[]) {
        for (int i:number) {
            println(i);
        }
    }

    // Newline - Character array
    public static void println(char characters[]) {
        for (char ch:characters) {
            println(ch);
        }
    }

    // Newline - Double array
    public static void println(double darr[]) {
        for (double d:darr) {
            println(d);
        }
    }

    // Newline - Float array
    public static void println(float fa[]) {
        for (float f:fa) {
            println(f);
        }
    }

    // Newline - boolean array
    public static void println(boolean ba[]) {
        for (boolean b:ba) {
            println(b);
        }
    }

    // String array
    public static void print(String str[]) {
        for (String s:str) {
            print(s + " ");
        }
    }

    // Integer array
    public static void print(int number[]) {
        for (int i:number) {
            print(i + " ");
        }
    }

    // Character array
    public static void print(char characters[]) {
        for (char ch:characters) {
            print(ch + " ");
        }
    }

    // Double array
    public static void print(double darr[]) {
        for (double d:darr) {
            print(d + " ");
        }
    }

    // Float array
    public static void print(float fa[]) {
        for (float f:fa) {
            print(f + " ");
        }
    }

    // Boolean array
    public static void print(boolean ba[]) {
        for (boolean b:ba) {
            print(b);
        }
    }

// ================================================
    
    // Excetptions
    public static void println(Exception e) {
        System.out.println(e);
    }

    public static void print(Exception e) {
        System.out.print(e);
    }
}
