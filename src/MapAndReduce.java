import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduce {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,6,3,9);
        Optional<Integer> fine=list.stream().filter(n->n%2==0).map(n->n*n).reduce((a, b)->{
            return (a+b);
        });

        System.out.println(fine.get());

    }
}
