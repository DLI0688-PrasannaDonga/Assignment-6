import java.awt.*;
import java.util.Scanner;
interface Radius{
    void radius(int s);
}
public class FunctionInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        double res;
        double pi=3.141;
        Radius ri=(s)-> {
            System.out.println(  pi*s*s);

        };
        ri.radius(r);



    }
}
