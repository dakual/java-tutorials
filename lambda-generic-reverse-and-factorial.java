public class App 
{
	public static void main(String args[]) {
        GenericInterface<String> ref = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i); 
            }

            return result;
        };

        System.out.println( "Lambda reversed = " + ref.func("Merhaba") );

        GenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println( "Lambda factorial of 5 = " + factorial.func(5) );
	}
}

interface GenericInterface<T> {
    T func(T n);
}