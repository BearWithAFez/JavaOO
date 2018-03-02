/**
 * @author Dwight Van der Velpen
 */
public class Cirkel {
    private Punt middelpunt;
    private double straal;

    public Cirkel() {
        middelpunt = new Punt();
        straal = 1;
    }

    public Cirkel(Punt middelpunt, double straal) {
        this.middelpunt = middelpunt;
        this.straal = straal;
    }
    
    public double berekenOmtrek(){
        return Math.PI * 2 * straal;
    }
    
    public double berekenOppervlakte(){
        return straal * straal * Math.PI;
    }
    
    public double berekenAfstand(Punt anderpunt){
        return middelpunt.berekenAfstand(anderpunt);
    }
}
