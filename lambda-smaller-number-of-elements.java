import java.util.Arrays;

public class App 
{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num = 10;

        long a = Arrays.stream(arr).filter(n -> n < num).count();

        System.out.format("Number of elements = %d%n", a);
    }
}