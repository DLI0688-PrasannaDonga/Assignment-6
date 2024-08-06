import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> list= Arrays.asList("Appapp", "okokok", "Cure", "Devil");
        System.out.println("Enter the substring");
        String str=sc.nextLine();
       list.stream().filter(n->n.length()>5 && n.contains(str)).forEach(System.out::println);





    }
}
