import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface A{
  int sumon(int a, int b);
        }

public class FunctionalInterface {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
      A obj=(int u, int v)->{
        int sum=0;
        sum=u+v;
        return sum;

          };
        System.out.println(obj.sumon(a,b));
      }

    }
