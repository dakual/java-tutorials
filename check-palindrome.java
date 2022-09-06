public class App 
{
	public static void main(String args[]) {
    System.out.println( checkPalindrome("kazak") );
	}

  public static boolean checkPalindrome(String in) {
    int len = in.length();
    for(int i = 0; i < len/2; i++) {
      if(in.charAt(i) != in.charAt(len-i-1)) {
        return false;
      }
    }

    return true;
  }
}
