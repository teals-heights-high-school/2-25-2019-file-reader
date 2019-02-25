import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("data.txt");
		if(file.exists() && file.canRead()) {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String currentLine = scanner.nextLine();
				System.out.println(currentLine);
			}
			scanner.close();
		}
		else {
			System.out.println("Error: cannot find file or the app doesn't have permissions to it");
		}
	}
}