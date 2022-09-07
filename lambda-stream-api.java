import java.util.ArrayList;
import java.util.List;

public class App 
{
	public static void main(String args[]) {
        List<String> places = new ArrayList<>();
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        
        places.stream()
            .filter( (p) -> p.startsWith("Nepal") )
            .map( (p) -> p.toUpperCase() )
            .sorted()
            .forEach( System.out::println );
    }
}