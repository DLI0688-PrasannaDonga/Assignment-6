import java.util.Scanner;
import java.util.function.BiFunction;
public class BiFunctional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        BiFunction<String ,String, String> bf=(s1,s2)->(s1+" "+s2);
        System.out.println(bf.apply(str1,str2));
    }
}
