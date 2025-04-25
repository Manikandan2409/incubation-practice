import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShallowDeep {
    ArrayList<Integer> i ;

    ShallowDeep(ShallowDeep deep){
        this.i = deep.i;
    }
    ShallowDeep(ShallowDeep shallowDeep,int i){
        this.i = new ArrayList<>();
        for (int k : shallowDeep.i)  this.i.add(k);
    }
    ShallowDeep(){}

    public static void main(String[] args) {
        ShallowDeep d1 = new ShallowDeep();
        d1.i = new ArrayList<>(Arrays.asList(1,2,4,5));
        System.out.println(d1.i);

        ShallowDeep d2 = new ShallowDeep(d1);
        System.out.println(d2.i);

        ShallowDeep d3 = new ShallowDeep(d1,10);

        d1.i.remove(1);
        System.out.println(d1.i);
        System.out.println(d2.i);
        System.out.println(d3.i);


    }
}
