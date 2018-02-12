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
    private static final int KLEINSTE = 0;
    private static final int GROOTSTE = 500;
    private static final int MAX_BEURTEN = 10;
        
    // Velden
    private int laatstGeradenGetal;
    private int gespeeldeBeurten;
    private int huidigMinima;
    private int huidigMaxima;
    
    // Methoden
    public void resetSpel(){
        // Reset het spel en de velden
        gespeeldeBeurten = 0;
        laatstGeradenGetal = -1;
        huidigMaxima = GROOTSTE;
        huidigMinima = KLEINSTE;
    }
    
    public int doeGok(){
        // Controleer beurten
        if(gespeeldeBeurten == MAX_BEURTEN) return -1;        
        
        gespeeldeBeurten++;
        laatstGeradenGetal = (int) ((huidigMaxima - huidigMinima + 1) * Math.random() + huidigMinima);
        return laatstGeradenGetal;
    }
    
    public int geefResterendeBeurten(){
        return MAX_BEURTEN - gespeeldeBeurten;
    }
    
    public int geefGespeeldeBeurten(){
        return gespeeldeBeurten;
    }
    
    public void getPlayerResult(int result){
        switch (result){
            case -1:
                huidigMaxima = laatstGeradenGetal;
                break;
            case 1:
                huidigMinima = laatstGeradenGetal;
                break;
            default:
                break;
        }
    }
}
