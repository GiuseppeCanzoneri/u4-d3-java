package ES1;

public class Main {

	public static void main(String[] args) {
	
	        String str = "test";
	        int year = 1700;

	        boolean isEvenLength = StringaPariDispari.isEvenLength(str);
	        boolean isLeapYear = AnnoBisestile.isLeapYear(year);

	        System.out.println("La stringa ha lunghezza pari? " + isEvenLength);
	        System.out.println("L'anno è bisestile? " + isLeapYear);
	}

}
