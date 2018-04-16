/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;
import java.util.Scanner;
/**
 *
 * @author Natalia
 */
public class Complex {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Wybierz działanie: ");
    System.out.println("1. Obliczanie modułu. ");
    System.out.println("2. Obliczanie liczby sprzężonej. ");
    System.out.println("3. Dodawanie liczb w postaci algebraicznej. ");
    System.out.println("4. Odejmowanie liczb w postaci algebraicznej. ");
    System.out.println("5. Mnożenie liczb w postaci algebraicznej. ");
    System.out.println("6. Dzielenie liczb w postaci algebraicznej. ");
    int wybór = scanner.nextInt();
    
    System.out.println("Podaj 1 liczbę: ");
    System.out.println("Część rzeczywista: ");
    int re = scanner.nextInt();
    System.out.println("Część urojona: ");
    int im = scanner.nextInt();
    
    System.out.println("Podaj 2 liczbę: ");
    System.out.println("Część rzeczywista: ");
    int re1 = scanner.nextInt();
    System.out.println("Część urojona: ");
    int im1 = scanner.nextInt();
    
    if(im>0)
    {
        System.out.println("Liczba 1: " +re+" + "+im+"i");
    }
    else 
    {
        System.out.println("Liczba 1: "+re+" - "+Math.abs(im)+"i");
    }
    if(im1>0)
    {
         System.out.println("Liczba 2: " +re1+" + "+im1+"i");
    }
    else 
    {
        System.out.println("Liczba 2: "+re1+" - "+Math.abs(im1)+"i");
    }
    
    switch (wybór){
        case 1:
            System.out.println("Moduł 1 liczby: ");
            System.out.println(" " +Modul(re, im));
            System.out.println("Moduł 2 liczby: ");
            System.out.println(" " +Modul(re1, im1));
            break;
        case 2:
            System.out.println("Liczba sprzężona do 1 liczby: ");
            Sprzezenie(re, im);
            System.out.println("Liczba sprzężona do 2 liczby: ");
            Sprzezenie(re1, im1);
            break;
        case 3: 
            System.out.println("Suma: ");
            Suma(re, im, re1, im1);
            break;
        case 4:
            System.out.println("Różnica: ");
            Roznica(re, im, re1, im1);
            break;
        case 5: 
            System.out.println("Iloczyn: ");
            Iloczyn(re, im, re1, im1);
            break;
        case 6:
            System.out.println("Iloraz: ");
            Iloraz(re, im, re1, im1);
            break;    
    }
    }
    public static double Modul(int re, int im){
        return Math.sqrt(re*re+im*im);
    }
    public static void Sprzezenie(int re, int im){
        System.out.println(re+""+im*(-1) + "i");
    }
    public static void Suma(int re, int im, int re1, int im1){
        double Re = re+re1;
        double Im = im+im1;
        System.out.println(Re+" "+Im+"i");      
    }
    public static void Roznica(int re, int im, int re1, int im1){
        double Re = re-re1;
        double Im = im-im1;
        System.out.println(Re+" "+Im+"i");
    }
    public static void Iloczyn(int re, int im, int re1, int im1){
        double Re = re*re1-im*im1;
        double Im = re*im1+im*re1;
        System.out.println(Re+" "+Im+"i");
    }
    public static void Iloraz(int re, int im, int re1, int im1){
        double Re = (re*re1 + im*im1)/(re1*re1+im1*im1);
        double Im = (im*re1-re*im1)/(re1*re1+im1*im1);
        System.out.println(Re+" "+Im+"i");
    }
   
}
    
   
        
        
        
    

