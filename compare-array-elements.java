import java.util.Arrays;

public class App 
{
	public static void main(String args[]) {
        String[] arr1 = {"1","2","3","4","5"};
        String[] arr2 = {"6","7","5","9","0"};
        
        System.out.println( compare(arr1, arr2) );
	}

    public static boolean compare(String[] arr1, String[] arr2) {
        if(arr1.length != arr2.length)
            return false;

        for (String value : arr1) {
            if( Arrays.asList(arr2).contains(value) ) {
                return true;
            }
        }

        return false;
    }
}