
public class SuperKey {

    public static void main(String[] args) {
        Ob a = new Ob("yellow");

        a.display();

    }
}

class Oa{
    Oa(){}
    String name;

    Oa(String name){
        this.name = name;
    }

}
class Ob extends  Oa{
    String name ;
    Ob(String name){
       // super(name);
        this.name = "BLACK";
    }

    public void  display(){
        System.out.println("Ob.display :"+ name);
        System.out.println("Ob.display :" + super.name);
    }
}
