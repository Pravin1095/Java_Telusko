package AbstractionFresco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] a){
        Chair obj = new Chair();
        List<String> simul = new <String>ArrayList();
        simul.add("CCRUCL");
        simul.add("CRUC");
        simul.add("CCC");
        System.out.println(obj.minChairs(simul));
    }
}
