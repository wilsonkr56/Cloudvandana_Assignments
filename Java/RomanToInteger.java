import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase(); 

        int result = romanToInteger(roman);

        System.out.println("Integer equivalent: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
           
            int currentVal = getRomanValue(s.charAt(i));

            if (i < s.length() - 1) {
                int nextVal = getRomanValue(s.charAt(i + 1));
                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static int getRomanValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
