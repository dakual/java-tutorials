public class App 
{
    public static void main( String[] args )
    {
        String str  = "Hello World!";
        boolean rst = checkVowels(str);
        System.out.println( rst );
    }

    public static boolean checkVowels(String in) {
        return in.toLowerCase().matches(".*[aeiıouü].*");
    }
}
