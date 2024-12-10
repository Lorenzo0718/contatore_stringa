/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_geometria;

/**
 *
 * @author ospite
 */
import java.util.Scanner;

public class forme_geometriche {
    
    public double lato;
    public double altezza;
    public double perimetro;
    public double area;
    
    Scanner input_lato = new Scanner(System.in);
    Scanner input_altezza = new Scanner(System.in);
    public double quadrato(){
        System.out.print("inserisci il lato del quadrato: ");
        
        lato = input_lato.nextDouble();
        
        System.out.print("inserisci l' altezza del quadrato: ");
        
        lato = input_altezza.nextDouble();
        
        perimetro = lato * 4;
        area = lato * lato;
        System.out.print("il perimetro del quadrato e: ");
        System.out.println(perimetro);
        System.out.print("l' area del quadrato e: ");
        System.out.println(area);
        return area;
    }
    
    public double rettangolo(){
        System.out.print("inserisci il lato del rettangolo: ");
        
        lato = input_lato.nextDouble();
        
        System.out.print("inserisci l' altezza del rettangolo: ");
        
        lato = input_altezza.nextDouble();
        
        perimetro = (lato + altezza)* 2;
        area = (lato * altezza) / 2;
        System.out.print("il perimetro del rettangolo e: ");
        System.out.println(perimetro);
        System.out.print("l' area del rettangolo e: ");
        System.out.print(area);
        return area;
    }
    
}
