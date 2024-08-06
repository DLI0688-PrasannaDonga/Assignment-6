import java.util.Arrays;
import java.util.List;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Hello","hi", "bye","hru");
        list.stream().map(l->l.toUpperCase()).forEach(System.out::println);
    }
}
