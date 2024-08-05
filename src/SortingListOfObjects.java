import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person{
    String name;
    int age;
    double salary;

    public Person(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}

public class SortingListOfObjects {
    public static void main(String[] args) {
        List<Person> list= new ArrayList<>();
        list.add(new Person("Prasanna", 21, 30000));
        list.add(new Person("Prasa", 20, 20000));
        list.add(new Person("sana", 18, 40000));
        list.add(new Person("sanna", 21,1000000));

        list.stream()
                .sorted(Comparator.comparingInt(p->p.age))
                .forEach(n-> System.out.println(n.name+" "+n.age+" "+n.salary));

    }
}
