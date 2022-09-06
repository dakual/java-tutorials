public class App 
{
    public static void main( String[] args ) {
        String str = "Hello World!";
        String rst = reverse(str);
        System.out.println( rst );
    }

    public static String reverse(String in) {
        StringBuilder sb = new StringBuilder();
        char[] chars = in.toCharArray();
        
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }
}
