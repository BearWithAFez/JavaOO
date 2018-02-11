/**
 * Klasse voor Logica
 * @author Dwight Van der Velpen
 */
public class MijnString {

    /**
     * Methode die een string en karakter neemt, en telt hoeveelmaal het karakter in de string voorkomt.
     * @param input De String
     * @param karakter Het Karakter
     * @return Aantal maal dat het Karakter voorkwam
     */
    public int telLetter(String input, char karakter){
        // Null pointer
        if (input == null) return 0;
        
        input = input.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == karakter) count++;
        }
        
        return count;        
    }
}
