
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwigh
 */
public class Console {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        MeerkeuzeVraag mkv = new MeerkeuzeVraag("Wat zit er op een 4 kazen pizza?", new String[]{"kaas", "screams of the damned", "bloed", "liefde"}, 0);
        int index = -1;
        
        while(!mkv.controleer(index)){
            System.out.println(mkv.getVraag());
            String[] antwoorden = mkv.getAntwoorden();
            for (int i = 0; i < antwoorden.length; i++) {
                System.out.println(i + ": " + antwoorden[i]);
            }
            System.out.println("Say the index!");
            index = in.nextInt();
            if (!mkv.controleer(index)) System.out.println("WRONG");
        }
        
        System.out.println("Well done! Shutting off.");
    }
}
