/**
 * @author Dwight Van der Velpen
 */
public class Datum {
    private int dag;
    private int maand;
    private int jaar;
    
    public Datum(int dag, int maand, int jaar){
        this.jaar = jaar;
        this.maand = maand;
        this.dag = dag;
        if(!isGeldig())throw new IllegalArgumentException("Invalid date!");
    }
    
    private boolean isGeldig(){
        if(maand > 12 || maand < 1) return false;
        if(dag > geefAantalDagenInMaand() || dag < 1) return false;
        return true;
    }
    
    public boolean isSchrikkeljaar(){
        return 366 == geefAantalDagenInJaar(jaar);
    }
    
    public int geefWeekVanJaar(){
        int dvw = 0;
        for (int i = 1900; i < jaar; i++) {
            dvw += geefAantalDagenInJaar();
            dvw %= 7;
        }        
        dvw += geefDagVanJaar();
        return (dvw/7) + 1;
    }
    
    public int geefDagVanWeek(){
        int dvw = 0;
        for (int i = 1900; i < jaar; i++) {
            dvw += geefAantalDagenInJaar();
            dvw %= 7;
        }
        dvw += geefDagVanJaar();
        dvw %= 7;
        return dvw;
    }
    
    public int geefDagVanJaar(){
        int dagTeller = 0;
        for (int i = 1; i < maand; i++) {
            dagTeller += geefAantalDagenInMaand(i,jaar);
        }
        dagTeller += dag;
        return dagTeller;
    }
    
    public int geefAantalDagenInJaar(){
        return geefAantalDagenInJaar(jaar);
    }
    
    private static int geefAantalDagenInJaar(int jaar){
        // Deelbaar door 4
        boolean schrikkel = (jaar % 4 == 0);
        
        // Maar niet ook deelbaar door honderd
        schrikkel = schrikkel && (jaar % 100 != 0);
        
        // Behalve als meervoud van 400
        schrikkel = schrikkel || (jaar % 400 == 0);
        
        return (schrikkel)? 366 : 365;
    }
    
    private static int geefAantalDagenInMaand(int maand, int jaar){
        switch(maand){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
            default:
                boolean schrikkel = geefAantalDagenInJaar(jaar) == 366;
                if(schrikkel) return 29;
                return 28;
        }
    }
    
    private int geefAantalDagenInMaand(){
        switch(maand){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
            default:
                boolean schrikkel = isSchrikkeljaar();
                if(schrikkel) return 29;
                return 28;
        }
    }
}
