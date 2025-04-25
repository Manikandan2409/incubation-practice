<<<<<<< HEAD
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 2;
        a= a +( a+= 3 * 4);
        System.out.println(a);
        int b = (2 + 3) * 4;
        System.out.println(a);
        System.out.println(b);
    }
}
=======
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import  java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.printf("hello world");
        int a =10;
        int c = ++a + a++ + ++a +a++;
        //11+11
        //22+13
        //35+13
        //48
        // 14
        System.out.println("c= "+c+"a="+a);

        c= ++a + ++a + a++ + --a;
        //15+16
        //31+16
        //47+16
        //63

        System.out.println("c= "+c+"a="+a);
        int b =10;
        c = b-- * a++ * b++  + a;
        //10 * 16
        //160 * 9
        // 1440 + 17
        // 1457
        System.out.println("c= "+c+"a="+a+ "b ="+ b);
        String emoji = "😀";


        byte[] utf8Bytes = emoji.getBytes(StandardCharsets.UTF_8);
        byte[] utf16Bytes = emoji.getBytes(StandardCharsets.UTF_16);

        System.out.println("UTF-8 Bytes:  " + Arrays.toString(utf8Bytes));
        System.out.println("UTF-16 Bytes: " + Arrays.toString(utf16Bytes));
        String s = new String(utf8Bytes);
        System.out.println("s8 :"+ s);
        String s16 = new String(utf16Bytes,StandardCharsets.UTF_16);
        System.out.println("s16 : "+s16);

       // String emoji = "😀";
        printEncodingDetails(emoji, StandardCharsets.UTF_8);
        printEncodingDetails(emoji, StandardCharsets.UTF_16);
        printEncodingDetails(emoji, StandardCharsets.UTF_16LE);
        printEncodingDetails(emoji, StandardCharsets.UTF_16BE);

    }


    public static void printEncodingDetails(String s, Charset charset) {
        byte[] bytes = s.getBytes(charset);
        System.out.println("Charset: " + charset.name());
        System.out.print("Hex: ");
        for (byte b : bytes) {
            System.out.printf("%02X ", b);
        }
        System.out.print("\nBinary: ");
        for (byte b : bytes) {
            System.out.print(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0') + " ");
        }
        System.out.println("\n");
    }

}
>>>>>>> 5eeb72a9eab88867cd73586953fb97bbddd400ef
