import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilteringList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Amber", "Siri", "Alexa", "Chatgpt");

      list.stream()
              .filter(ch->ch.startsWith("A")).forEach(System.out::println);
    }
}
