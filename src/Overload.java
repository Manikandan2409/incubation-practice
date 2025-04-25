import java.util.Arrays;

public class Overload {
//    long add(int a ,long b){
//        System.out.println("Overload.add int long");
//        return  a+b;
//    }

//    long add(long ...args){
//        System.out.println("Overload.add args ");
//       return Arrays.stream(args).sum();
//    }



//    long add(int a,long b){
//        return  a+b;
//    }

//    long add(long a,int b){
//        return  a+b;
//    }

   Long add(Integer a,Long b){
        return  a+b;
   }
    long add(int a,long b){
        return  a+b;
    }
    public static void main(String[] args) {
        Overload o = new Overload();
        byte b = 10;
        short s = 40;
        int i = 60;
//        System.out.println(o.add(b,9));
//        System.out.println(o.add(s,8));
        System.out.println(o.add(i,90L));
    }
}
