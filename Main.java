import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println(calc(""));
    }
        public static String calc (String input)  {
            Scanner str = new Scanner(System.in);
            String scr = str.nextLine();
            String[] mass = scr.split(" ");
            String plus = "+", minus = "-", del = "/", pr = "*";

            if (mass.length !=3) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                    System.exit(0);
                }
            }
            String a = mass[0];
            String sign = mass[1];
            String b = mass[2];

            String[] rim = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            boolean a1 = a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X");
            boolean b1 = b.equals("I") || b.equals("II") || b.equals("III") || b.equals("IV") || b.equals("V") || b.equals("VI") || b.equals("VII") || b.equals("VIII") || b.equals("IX") || b.equals("X");
            boolean a2 = a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("-7") || a.equals("8") || a.equals("9") || a.equals("10");
            boolean b2 = b.equals("1") || b.equals("2") || b.equals("3") || b.equals("4") || b.equals("5") || b.equals("6") || b.equals("7") || b.equals("8") || b.equals("9") || b.equals("10");

            int tog;

            if ((a1&&b2)||(b1&&a2)){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                    System.exit(0);
                }
            }
            if ((sign.equals(plus)) && a1 && b1) {
                tog = arabian(a) + arabian(b);
                input = rim[tog];
                return input;
            }
            if ((sign.equals(minus)) && a1 && b1) {
                tog = arabian(a) - arabian(b);
                if (tog < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("throws Exception");
                        System.exit(0);
                    }
                }
                input = rim[tog];
                return input;
            }
            if ((sign.equals(pr)) && a1 && b1) {
                tog = arabian(a) * arabian(b);
                input = rim[tog];
                return input;
            }
            if ((sign.equals(del)) && a1 && b1) {
                tog = arabian(a) / arabian(b);
                input = rim[tog];
                return input;
            }
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);
            int c;

            if (A > 10 || B > 10) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("throws Exception");
                        System.exit(0);
                    }
                }
            if (sign.equals(plus)) {
                c = A + B;
                input = String.valueOf(c);
            }
            if (sign.equals(minus)) {
                c = A - B;
                input = String.valueOf(c);
            }
            if (sign.equals(pr)) {
                c = A * B;
                input = String.valueOf(c);
            }
            if (sign.equals(del) && B != 0) {
                c = A / B;
                input = String.valueOf(c);
            }
            if (a2 && B == 0){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                    System.exit(0);
                }
            }
                return input;
        }
        static int arabian (String arab){

            if (arab.equals("I")) {
                return 1;
            }
            if (arab.equals("II")) {
                return 2;
            }
            if (arab.equals("III")) {
                return 3;
            }
            if (arab.equals("IV")) {
                return 4;
            }
            if (arab.equals("V")) {
                return 5;
            }
            if (arab.equals("VI")) {
                return 6;
            }
            if (arab.equals("VII")) {
                return 7;
            }
            if (arab.equals("VIII")) {
                return 8;
            }
            if (arab.equals("IX")) {
                return 9;
            }
            if (arab.equals("X")) {
                return 10;
            }
            return 0;
        }
    }


