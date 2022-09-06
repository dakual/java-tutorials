public class App 
{
	public static void main(String args[]) {
        System.out.println( findFactorial(4) );
	}

    public static long findFactorial(long number) {
        if(number == 1)
            return 1;
        else
            return (number * findFactorial(number -1));
    }
}
