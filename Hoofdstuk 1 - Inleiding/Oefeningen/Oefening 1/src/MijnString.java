/**
 * @author Dwight Van der Velpen
 */
public class MijnString {
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
