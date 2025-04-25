public class Covariant {
    public static void main(String[] args) {
        B b = new B();
        b.callme();

        A a = new B();
        a.callme();

    }
}

class  A{
    String callme(){
        System.out.println("B.callme");
        return  null;
    }



}
class  B extends A{


    void  deva(){
        System.out.println("B.deva");
    }
}
