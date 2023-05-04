package ES3;

public class SuddividiStringa {
    public static String suddividi(String str) {
        String result = "";
        
        for(int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            
            if(i != str.length() - 1) {
                result += ", ";
            }
        }
        
        return result;
    }
}

