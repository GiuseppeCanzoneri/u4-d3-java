package ES2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un intero compreso tra 0 e 3: ");
        int num = input.nextInt();
        
        String result = Convertitore.converti(num);
        System.out.println(result);
	}

}
