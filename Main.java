
public class Main {
    public static void main(java.lang.String[] args) {

//        Ex.1
        long a1 = 17L / 3; //5
        double b1 = 0xABBA % 3.7; //2.2999999999978895
        byte c1 = (char) (('a' + 'z') / 2); //109
        boolean d1 = 3 == 3.0f && '0' <= 'A'; //true
        byte e1 = ~(-0b101101) + 1; //45
        boolean f1 = !(-5 % 2 == 1 || 2_147_483_647 + 1 < 0); //false

//        Ex.2
//        (a)
        int firstArgument = 24; //24 = 011000
        int secondArgument = -2038; //2038 = 011111110110 ->  100000001010
//      100000001010 (OR)
//      000000011000
//      100000011010 - 1 = 100000011001
//                         011111100110 => it's  -2022
        int resultA = firstArgument | secondArgument; //-2022


//       (b)
//      23 = 10111 => ~23 = ...(1)01000
//      300124 = 1001001010001011100,
//      1111111111111101000 (AND)
//      1001001010001011100
//      1001001010001001000 = 300104
        int resultB = (~23) & 300124;


//        (c)
//      208 = 011010000 => -208 = 100101111 + 1 = 100110000
//      19 = 10011
//      100110000 (XOR)
//      000010011
//      100100010 => 100100010 - 1 = 100100001
//                                   011011110 = 221 =>100100010 = -221
        int resultC = -208 ^ 19;


//        (d)

        int resultD = -34576 >>> 5;
//      -34576 = 11111111111111111001010010000000 => right shift -> 11111111111111111111111111110010 = -1081


//        (e)
        int resultE = -347000 >> 11;
//      347000 = 11111111111111111101001101101000 => -347000 >> 11 = 111111111111111111010> => -170


//        (f)
        int resultF = -4567 << 6;
//      -4567 = 1110111000101001 => 1110111000101001000000 = -292288


//        Ex.3

        int a = 101, b = -77, c;
        char d = 'e';
        boolean e = (a == d); //true, because ASCII  e = 101, a = 101 => true
        boolean f = (d - 3 == 'a'); //false, because 101 - 3 = 98 but ASCII code of a is 97
        c = --a; // c = 101-1=100, unary operation does from right to left and also
        boolean g = (a > b && a == b); //true && false => false
        a = ~b + 1; // 01001101 ->  10110010 + 1 = 10110011 =>~b = 01001100 = 76 => a = 76 + 1 = 77
        short h = (short) 15427L; // h = 15427

        System.out.println("a␣=␣" + a); // a = 77 : line 68
        System.out.println("b␣=␣" + b); // b = -77 : line 61
        System.out.println("c␣=␣" + c); // c = 100 : line 65
        System.out.println("d␣=␣" + d); // d = e : line 62
        System.out.println("e␣=␣" + e); // e = true : line 63
        System.out.println("f␣=␣" + f); // f = false : line 64
        System.out.println("g␣=␣" + g); // g = false : Line 66
        System.out.println("h␣=␣" + h); // h = 15427 : line 68


//        XOR SWAP
        a = a ^ b; //a = 77 = 01001101, b = -77 = 10110011; 10110011 (XOR) 01001101 -> 11111110 -> a = -2 (in two's complement)
        b = a ^ b; // a = 11111110, b = 10110011; 10110011 (XOR) 11111110 -> 01001101 -> b = 77
        a = a ^ b; // 11111110 (XOR) 01001101 -> 10110011 -> a = -77

        System.out.println("a␣=␣" + a); // a = -77 : line 83
        System.out.println("b␣=␣" + b); // b = 77 : line 82

        e = (c & (c - 1)) == 0; // 100 & (99) => 100 = 1100100, 99 = 1100011 (in binary); 1100100 & 1100011 = 1100000 != 0 => false
        System.out.println("e␣=␣" + e); // false
        g = a % (a & (-a)) != 0; // -77 % ( 10110011 & 01001101) = -77 % 00000001 = 0 => s.t. is false
        System.out.println("g␣=␣" + g); // false

        a = (1 << 3) | 1; // 1<<3 -> 1000, 1000 | 0001 -> 1001 = 9 => a = 9
        a <<= 6; // a = a << 6 -> 1001000000 = 576 => a = 576
        b = a & (-a); // a = 01001000000, -a = 10111000000;  01001000000 (AND) 10111000000 -> 00001000000 -> 64 => b = 64
        g = a % b == 0; // 576 / 64 = 9 (with reminder 0) => true

        System.out.println("a␣=␣" + a); // 576 : line 93
        System.out.println("b␣=␣" + b); // 64 : line 95
        System.out.println("g␣=␣" + g); // true : line 96



//        Ex.4
        String s = "ilqynkkqsableimmfabqhpoxsclobu";
//        (a)
        s = s.replaceAll("ab", "");

//        (b)
        int stringLength = s.length();
        s = s.substring(1, stringLength - 1);

//        (c)
        String originalS = s;
        for (int i = 0; i < 3; i++) {
            s += originalS;
        }
//        (d)
        int halfLength = s.length() / 2;
        s = s.substring(0, halfLength).toUpperCase() + s.substring(halfLength);

        System.out.println(s);
    }
}