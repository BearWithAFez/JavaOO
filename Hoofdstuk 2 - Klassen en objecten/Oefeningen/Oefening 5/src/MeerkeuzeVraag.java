import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dwight Van der Velpen
 */
public class MeerkeuzeVraag {
    private final String vraag;
    private String[] antwoorden;
    private int juisteIndex;

    public MeerkeuzeVraag(String vraag, String[] antwoorden, int juisteIndex) {
        this.vraag = vraag;
        this.antwoorden = antwoorden;
        this.juisteIndex = juisteIndex;
    }
    
    public boolean controleer(int antwoord){
        return antwoord == juisteIndex;
    }
    
    public String getJuisteAntwoord(){
        return antwoorden[juisteIndex];
    }
    
    public String getVraag(){
        return vraag;
    }
    
    public String[] getAntwoorden(){
        randomize();
        return antwoorden;
    }
    
    private void randomize(){
        String correctAntw = "" + antwoorden[juisteIndex];
        
        List<String> temp = Arrays.asList(antwoorden);
        Collections.shuffle(temp);
        antwoorden = temp.toArray(new String[temp.size()]);
        
        for (int ant = 0; ant < antwoorden.length; ant++) {
            if(correctAntw.equals(antwoorden[ant])){
                juisteIndex = ant;
            }
        }
    }
}
