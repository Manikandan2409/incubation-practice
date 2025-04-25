import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        String s = new String("manikandan");
        System.out.println(s);
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        ch[1]='k';
        System.out.println("Changed----");

        System.out.println(s);
        int uni =s.codePointBefore(3);
        System.out.println(Arrays.toString(ch));
        System.out.println(uni);
        String str = "A😀B";
        System.out.println(str.codePointAt(1)); // Prints Unicode code point of 😀: 128512

    }
}
