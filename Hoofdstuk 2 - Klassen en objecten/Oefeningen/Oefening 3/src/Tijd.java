/**
 * @author Dwight
 */
public class Tijd {
    private int uren;
    private int minuten;

    public Tijd(int uren, int minuten) {
        this.uren = uren;
        this.minuten = minuten;
    }
    
    public int getUren(){
        return uren;
    }
    
    public int getMinuten(){
        return minuten;
    }
    
    public void telTijdBij(Tijd t){
        this.uren += t.uren;
        this.minuten += t.minuten;
        this.fix();
    }
    
    private void fix(){
        this.uren += this.minuten / 60;
        this.minuten = this.minuten % 60;
        this.uren %= 60;
    }
}
