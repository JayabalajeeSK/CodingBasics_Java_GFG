package ConversionPrograms;

public class ConversionPrograms 
{
    // 1. Binary to Octal
    public static void binaryToOctal(String binary) 
    {
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Binary to Octal: " + octal);
    }
// 1010
// 1. Binary to Octal:
// Binary to Octal: 12

    // 2. Octal to Decimal
    public static void octalToDecimal(String octal) 
    {
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Octal to Decimal: " + decimal);
    }
// 12
// 2. Octal to Decimal:
// Octal to Decimal: 10

    // 3. Decimal to Octal
    public static void decimalToOctal(int decimal) 
    {
        String octal = Integer.toOctalString(decimal);
        System.out.println("Decimal to Octal: " + octal);
    }
// 10
// 3. Decimal to Octal:
// Decimal to Octal: 12

    // 4. Hexadecimal to Decimal
    public static void hexToDecimal(String hex) 
    {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Hexadecimal to Decimal: " + decimal);
    }
// A
// 4. Hexadecimal to Decimal:
// Hexadecimal to Decimal: 10

    // 5. Decimal to Hexadecimal
    public static void decimalToHex(int decimal) 
    {
        String hex = Integer.toHexString(decimal);
        System.out.println("Decimal to Hexadecimal: " + hex.toUpperCase());
    }
// 255
// 5. Decimal to Hexadecimal:
// Decimal to Hexadecimal: FF

    // 6. Decimal to Binary
    public static void decimalToBinary(int decimal) 
    {
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal to Binary: " + binary);
    }
// 8
// 6. Decimal to Binary:
// Decimal to Binary: 1000

    // 7. Binary to Decimal
    public static void binaryToDecimal(String binary) 
    {
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: " + decimal);
    }
// 1101
// 7. Binary to Decimal:
// Binary to Decimal: 13
    // 8. Boolean to String
    public static void booleanToString(boolean boolVal) 
    {
        String str = Boolean.toString(boolVal);
        System.out.println("Boolean to String: " + str);
    }
// true
// 8. Boolean to String:
// Boolean to String: true

    // 9. String to Double
    public static void stringToDouble(String str) 
    {
        double d = Double.parseDouble(str);
        System.out.println("String to Double: " + d);
    }
// 123.456
// 9. String to Double:
// String to Double: 123.456

    // 10. Double to String
    public static void doubleToString(double val) 
    {
        String str = Double.toString(val);
        System.out.println("Double to String: " + str);
    }
// 78.9
// 10. Double to String:
// Double to String: 78.9

    // 11. String to Long
    public static void stringToLong(String str) 
    {
        long l = Long.parseLong(str);
        System.out.println("String to Long: " + l);
    }
// 9876543210
// 11. String to Long:
// String to Long: 9876543210

    // 12. Long to String
    public static void longToString(long val) 
    {
        String str = Long.toString(val);
        System.out.println("Long to String: " + str);
    }
// 9876543210L
// 12. Long to String:
// Long to String: 9876543210

    // 13. Int to Char
    public static void intToChar(int val) 
    {
        char c = (char) val;
        System.out.println("Int to Char: " + c);
    }
// 65
// 13. Int to Char:
// Int to Char: A

    // 14. Char to Int
    public static void charToInt(char c) 
    {
        int val = (int) c;
        System.out.println("Char to Int: " + val);
    }
// A
// 14. Char to Int:
// Char to Int: 65
}

    