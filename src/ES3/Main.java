package ES3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        
        do {
            System.out.print("Inserisci una stringa (o ':q' per uscire): ");
            str = input.nextLine();
            
            if(!str.equals(":q")) {
                String result = SuddividiStringa.suddividi(str);
                System.out.println(result);
            }
        } while(!str.equals(":q"));
    }
}