/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringa;

/**
 *
 * @author ospite
 */
import java.util.Scanner;

public class contatore_caratteri {
    public String parola;
    public int contatore = 0;

    public void Input(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci la stringa: ");
        parola = input.nextLine();
    }
    
    
    
    public int numero_caratteri(){
        for(int i=0; i< parola.length(); i++){
            contatore = contatore + 1;
        }
        System.out.println("il numero dei caratteri della stringa " + parola + " e: " + contatore );
        return contatore; 
    }
    
    
}
