package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    
    public static double PoleKwadratu(double a){
        return Math.pow(a, 2);
    }
    
    public static double ObwodKwadratu(double a){
        return 4*a;
    }
    
    public static double PoleProstokata(double a, double b){
        return a*b;
    }
    
    public static double ObwódProstokata(double a, double b){
        return 2*a+2*b;
    }
    
    public static double PoleStozka(double a, double h){
        return (h*Math.PI*Math.pow(a, 2))/3;
    }
    
    public static double PoleWalca(double a, double b, double c){
        return 2*a*b+2*b*c+2*c*a;
    }
    
    public static double ObjetoscWalca(double r, double H){
        return Math.round(Math.PI*Math.pow(r, 2)*H);
    }
}   

