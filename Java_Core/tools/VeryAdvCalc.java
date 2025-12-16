package Java_Core.tools;
import Java_Core.tools.AdvCalc;

// Multi Level Inheritance (Extending the AdvCalc which is extending the Calc)
public class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}
