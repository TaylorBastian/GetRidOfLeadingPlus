import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	private static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sf = new Scanner(new File("src//Taylor.txt"));

		int maxIndex = -1;
		String[] text = new String[1000];
		
		
		while (sf.hasNext()) {
			maxIndex++;
			text[maxIndex] = sf.nextLine();
		}
		sf.close();
		
		
		String answer = "";
		int sum=0;
		
		for (int j = 0; j <= maxIndex; j++) {
			sc = new Scanner(text[j]);
			
			while (sc.hasNext()) {
				int i = sc.nextInt();
				if (answer.equals("")) {
					answer = answer + i;
				}
				answer = answer + " + " + i;
				sum = sum + i;
			}
			answer = answer + " = " + sum;
			
			System.out.println(answer);
		}
	}

}
