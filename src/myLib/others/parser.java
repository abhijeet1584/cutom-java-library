package myLib.others;
import myLib.input.Reader;
import myLib.output.console;

public class parser {

    private parser(){} // making constructor private to avoid object initialisation

    public static int charToInt(char ch) {
        // Works only on a string with one character
        switch (ch) {
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
        }
        return 0;
    }

    public static int parseInteger(String num) {
        int len = num.length();
        int result = 0;
        for (int counter = 0; counter < len; counter++) {
            result = (result * 10) + charToInt(num.charAt(counter));
        }

        // To check negative number
        if (num.charAt(0) == '-')
            result *= -1;
            
        return result;
    }
}
