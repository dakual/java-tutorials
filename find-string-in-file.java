import java.io.File;
import java.util.Scanner;

public class App 
{
	public static void main(String args[]) {
        String file = "";
        String str  = "";

        System.out.println( findStringInFile(file, str) );
	}

    public static boolean findStringInFile(String filePath, String str) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
        
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(str)) {
                    scanner.close();
                    return true;
                }
            }
            scanner.close();           
        } catch (Exception e) {
            return false;
        }

        return false;
    }
}