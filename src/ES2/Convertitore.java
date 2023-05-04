package ES2;

public class Convertitore {
	   public static String converti(int num) {
	        String result = "";
	        
	        switch(num) {
	            case 0:
	                result = "Zero";
	                break;
	            case 1:
	                result = "Uno";
	                break;
	            case 2:
	                result = "Due";
	                break;
	            case 3:
	                result = "Tre";
	                break;
	            default:
	                result = "Valore non valido";
	                break;
	        }
	        
	        return result;
	    }
	}

