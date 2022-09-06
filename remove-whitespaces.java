public class App 
{
	public static void main(String args[]) {
        System.out.println( removeWhiteSpaces("H e l l o-W o r l d !") );
	}

    public static String removeWhiteSpaces(String in) {
        StringBuilder sb = new StringBuilder();
        char[] chars = in.toCharArray();
        for(char ch : chars) {
            if(!Character.isWhitespace(ch)) 
                sb.append(ch);
        }

        return sb.toString();
    }
}
