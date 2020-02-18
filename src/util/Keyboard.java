package util;

import java.util.Scanner;

public final class Keyboard {
    private static final Scanner KBD = new Scanner( System.in );

    static boolean hasNext() { return KBD.hasNext(); }
    private static boolean hasNextBoolean() { return KBD.hasNextBoolean(); }
    private static boolean hasNextDouble() { return KBD.hasNextDouble(); }
    private static boolean hasNextInt() { return KBD.hasNextInt(); }
    private static boolean hasNextLine() { return KBD.hasNextLine(); }
    private static boolean hasNextLong() { return KBD.hasNextLong(); }
    private static String next() { return KBD.next(); }

    public static char nextChar() {
        return KBD.next().charAt(0);
    }

    public static boolean nextBoolean() {

        while (!hasNextBoolean()) {
            System.out.print("Incorrect format for boolean: please try again: ");
            KBD.next();
        }
        return KBD.nextBoolean();
    }

    public static double nextDouble() {

        while (!hasNextDouble()) {
            System.out.print("Incorrect format for double: please try again: ");
            KBD.next();
        }

        return KBD.nextDouble();
    }

    public static int nextInt() {

        while (!KBD.hasNextInt()) {
            System.out.print("Incorrect format for int: please try again: ");
            KBD.next();
        }

        return KBD.nextInt();
    }

    public static String nextLine() { return KBD.next() + KBD.nextLine(); }

    public static long nextLong() {

        while (hasNextLong()) {
            System.out.print("Incorrect format for long: please try again: ");
            KBD.next();
        }
        return KBD.nextLong();

    }

    public static void println(Object o) {
        System.out.println(o);
    }

    public static void print(Object o) {
        System.out.print(o);
    }

}
