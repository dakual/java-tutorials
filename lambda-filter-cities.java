import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main(String[] args) {
        String[] arr = { "istanbul", "ankara", "izmir", "adana", "bursa", "antalya", "afyon", "mersin", "ardahan", "denizli" };
        List<String> list = Arrays.asList(arr);

        list.stream()
            .filter(x -> x.startsWith("a"))
            .map(x -> x.toUpperCase())
            .sorted()
            .forEach(System.out::println);
    }
}