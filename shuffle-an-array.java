
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App 
{
	public static void main(String args[]) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        
        //shuffle(array);
        shuffle2(array);

        System.out.println( Arrays.toString(array) );
	}

    public static void shuffle(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
          list.add(i);
        }
      
        Collections.shuffle(list);
      
        for (int i = 0; i < list.size(); i++) {
          array[i] = list.get(i);
        }
    }

    public static void shuffle2(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
          int index = rnd.nextInt(i + 1);
          int a = array[index];
          array[index] = array[i];
          array[i] = a;
        }
    }
}