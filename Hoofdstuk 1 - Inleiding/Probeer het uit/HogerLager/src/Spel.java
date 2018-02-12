/*
 * The MIT License
 *
 * Copyright 2018 Dwight Van der Velpen.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * @author Dwight Van der Velpen
 */
public class Spel {
    // Constanten Spel
    static final int KLEINSTE = 0;
    static final int GROOTSTE = 100;
    static final int MAX_BEURTEN = 10;
    
    // Constanten Resultaten
    static final int ONGELDIG = -1;
    static final int CORRECT = 0;
    static final int HOGER = 1;
    static final int LAGER = 2;
    
    // Velden
    int teRadenGetal;
    int gespeeldeBeurten;
    
    // Methoden
    public void resetSpel(){
        // Zet te raden getal naar een getal tussen Kleinste en grootste
        teRadenGetal = (int) ((GROOTSTE - KLEINSTE + 1) * Math.random() + KLEINSTE);
        gespeeldeBeurten = 0;
    }
    
    public int doeGok(int gok){
        // Controleer validiteit
        if(gok < KLEINSTE || gok > GROOTSTE) return ONGELDIG;
        
        gespeeldeBeurten++;
        
        if (gok < teRadenGetal) return HOGER;        
        if (gok > teRadenGetal) return LAGER;        
        return CORRECT;
    }
    
    public int geefResterendeBeurten(){
        return MAX_BEURTEN - gespeeldeBeurten;
    }
    
    public int geefGespeeldeBeurten(){
        return gespeeldeBeurten;
    }
    
    public int geefTeRadenGetal(){
        return teRadenGetal;
    }
}
