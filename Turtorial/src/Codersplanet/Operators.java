package Codersplanet;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operator

        int a = 10;

        // Addition

        int b = 6 +a;
        System.out.println(b);
        // Subtraction
        int c = 6 -a;
        System.out.println(c);
        // Multiplication
        int d = 3 *a;
        System.out.println(d);
        // Division
        int e = 12 /a;
        System.out.println(e);
        // Modulo
        float f = 4%a;
        System.out.println(f);
        // Prefix Increment
        int g = 5;
        int h = ++g;  // g is incremented to 6, then h is assigned the value of 6
        System.out.println("a: " + g);  // Output: g: 6
        System.out.println("b: " + h);  // Output: h: 6
        // Suffix Increment
        int i = 5;
        int j = i++;  // j is assigned the value of 5, then i is incremented to 6
        System.out.println("a: " + i);  // Output: i: 6
        System.out.println("b: " + j);  // Output: j: 5
        // Prefix Decrement
        int k = 5;
        int l = --k;  // l is decremented to 4, then k is assigned the value of 4
        System.out.println("a: " + k);  // Output: k: 4
        System.out.println("b: " + l);  // Output: l: 4
        // Suffix Decrement
        int m = 5;
        int n = m--;  // n is assigned the value of 5, then m is decremented to 4
        System.out.println("a: " + m);  // Output: m: 4
        System.out.println("b: " + n);  // Output: n: 5

        // Assignment Operators
        int o = 6;
        int p = o += 7;
        System.out.println("a: " + o);

        // Comparison Operators
        int q = 6;
        System.out.println(q==6);
        System.out.println(4<2);
        System.out.println(3>4);
        System.out.println(4>=3);
        System.out.println(4<=6);

        // Logical Operators
        System.out.println(4>3 && 5<4);
        System.out.println(4>3 || 5<4);

        // Bitwise Operators
        System.out.println(4&5);
        System.out.println(4|5);
        System.out.println("Made By Rexy");




    }
}
