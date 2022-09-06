public class App 
{
  public static void main( String[] args ) {
    System.out.println(isPrime(7919)); // true
    System.out.println(isPrime(1475542)); // false
  }

  public static boolean isPrime(int in) {
    for(int i = 2; i <= in / 2; i++) {
        if(in % i == 0) {
            return false;
        }
    }

    return true;
  }
}