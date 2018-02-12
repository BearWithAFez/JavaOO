/**
 * @author Dwight
 */
public class Console {    
    public void testBoom(){
        // init
        Boom boompje = new Boom(275);
        System.out.println(boompje.toString());
        
        // groei
        for (int i = 0; i < 12; i++) {
            boompje.groei();
            System.out.println(boompje.toString());
        }        
        
        // snoei
        for (int i = 0; i < 12; i++) {
            boompje.snoei();
            System.out.println(boompje.toString());
        }
    }
}
