package myLib.input;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import myLib.others.parser;
import myLib.output.console;

public class Reader {
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);

    // Method to read String line
    public String scanLine() {
        try {
            String input = br.readLine();
            return input;
        } catch (Exception err) {
            System.out.println(err);
        }
        return null;
    }

    // Method to read Integer
    public int scanInt() {
        try {
            String str = br.readLine();
            int input = parser.parseInteger(str);
            return input;
        } catch (Exception err) {
            console.println(err);
        }
        return -1; // -1 is the error code
    }

    // Method to read Long
    public long scanLong() {
        long input = (long)scanInt();
        return input;
    }

    // Method to read Byte
    public byte scanByte() {
        byte input = (byte)scanInt();
        return input;
    }

    // Method to read Short
    public short scanShort() {
        short input = (short)scanInt();
        return input;
    }

    // Method to read Float
    public float scanFloat() {
        String str = scanLine();
        Float input = Float.valueOf(str).floatValue();
        return input;
    }

    // Method to read Double
    public double scanDouble() {
        String str = scanLine();
        double input = Double.parseDouble(str);
        return input;
    }

    // Method to read String line (WITH MESSAGE)
    public String scanLine(String msg) {
        try {
            console.print(msg);
            String input = br.readLine();
            return input;
        } catch (Exception err) {
            System.out.println(err);
        }
        return null;
    }

    // Method to read Integer (WITH MESSAGE)
    public int scanInt(String msg) {
        try {
            console.print(msg);
            String str = br.readLine();
            int input = parser.parseInteger(str);
            return input;
        } catch (Exception err) {
            console.println(err);
        }
        return -1; // -1 is the error code
    }

    // Method to read Long (WITH MESSAGE)
    public long scanLong(String msg) {
        long input = (long)scanInt(msg);
        return input;
    }

    // Method to read Byte (WITH MESSAGE)
    public byte scanByte(String msg) {
        byte input = (byte)scanInt(msg);
        return input;
    }

    // Method to read Short (WITH MESSAGE)
    public short scanShort(String msg) {
        short input = (short)scanInt(msg);
        return input;
    }

    // Method to read Float
    public float scanFloat(String msg) {
        String str = scanLine(msg);
        Float input = Float.valueOf(str).floatValue();
        return input;
    }

    // Method to read Double
    public double scanDouble(String msg) {
        String str = scanLine(msg);
        double input = Double.parseDouble(str);
        return input;
    }
}
