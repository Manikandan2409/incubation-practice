public class App {



    App(){
        System.out.println("App.App default");
    }
    public App(int i){

    }
    static  int i = 10;
    int k=10;

    {
        System.out.println("emply block" + k);

    }
    static {
        System.out.println("static block :"+i);

    }
    void  m1(){
        System.out.println("from m1");
    }
    public static void main(String[] args) {

        System.out.println("main starts");
        App app = new App();
        app.m1();

        System.out.println("demostarts" );
        Demo d = new Demo();
        d.d2();

    }
}
class Demo{
    static {
        System.out.println("Demo.static initializer");
    }

    {
        System.out.println("Demo.instance initializer");
    }
    void d2(){
        System.out.println("Demo.d2");
    }
}
