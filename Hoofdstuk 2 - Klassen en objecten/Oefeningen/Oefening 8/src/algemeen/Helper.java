package algemeen;

/**
 * @author Dwight Van der Velpen
 */
public class Helper {
    public static int Encrypt(int input){
        // Dummy controll
        if(input > 9999 || input < 0) return input;
        // Shifty
        String number = Integer.toString(input);
        String shift = "";
        for (int i = 0; i < number.length(); i++) {
            shift += (Integer.parseInt("" + number.charAt(i)) + 7) % 10;
        }
        //Swappy
        number = "" + shift.charAt(2) + shift.charAt(3) + shift.charAt(0) + shift.charAt(1);
        return Integer.parseInt(number);
    }
    
    public static int Decrypt(int input){
        // Dummy controll
        if(input > 9999 || input < 0) return input;        
        //Swappy
        String number = Integer.toString(input);
        number = "" + number.charAt(2) + number.charAt(3) + number.charAt(0) + number.charAt(1);
        // Shifty
        String shift = "";
        for (int i = 0; i < number.length(); i++) {
            shift += (Integer.parseInt("" + number.charAt(i)) + 3) % 10;
        }
        return Integer.parseInt(shift);
    }
}
