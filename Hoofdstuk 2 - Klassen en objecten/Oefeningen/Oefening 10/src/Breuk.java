/**
 * @author Dwight Van der Velpen
 */
public class Breuk {
    private int teller;
    private int noemer;
    
    public int getTeller(){
        vereenvoudig();
        return teller;
    }
    
    public int getNoemer(){
        vereenvoudig();
        return noemer;
    }
    
    public Breuk(){
        teller = 1;
        noemer = 1;
    }
    
    public Breuk(int teller, int noemer){
        this.teller = teller;
        this.noemer = noemer;
        vereenvoudig();
    }
    
    public Breuk plus(Breuk ander){
        ander.vereenvoudig();
        int kgv = Helper.kgv(noemer, ander.noemer);
        int telr = ((teller *kgv)/noemer) + ((ander.teller *kgv)/ander.noemer);
        return new Breuk(telr,kgv);
    }
    
    public Breuk min(Breuk ander){
        ander.vereenvoudig();
        int kgv = Helper.kgv(noemer, ander.noemer);
        int telr = ((teller *kgv)/noemer) - ((ander.teller *kgv)/ander.noemer);
        return new Breuk(telr,kgv);
    }
    
    public Breuk maal(Breuk ander){
        ander.vereenvoudig();
        int noem = noemer * ander.noemer;
        int telr = teller * ander.teller;
        return new Breuk(telr,noem);
    }
    
    public Breuk deel(Breuk ander){
        ander.vereenvoudig();
        int noem = noemer * ander.teller;
        int telr = teller * ander.noemer;
        return new Breuk(telr,noem);
    }
    
    private void vereenvoudig(){        
        int ggd = Helper.ggd(teller,noemer);
        teller = teller/ggd;
        noemer = noemer/ggd;
    }
}
