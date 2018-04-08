/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Monika
 */
public class Zadanie3 {
    private int stos[];
    private int wskaźnik;

    public Zadanie3(int rozmiarStosu) {
        stos = new int[rozmiarStosu];
        wskaźnik = -1;
    }
    private boolean pop() {
        Scanner in = new Scanner(System.in);
        if(wskaźnik >= 0){
            stos[wskaźnik] = 0;
            wskaźnik--;
            System.out.println("Gotowe");
            return true;
        } 
        else{
            System.out.println("Stos jest pusty, więc nie można ściągnąć ze stosu");
            in.nextLine();
            return false;
        }
    
    }
    private boolean push(){
        Scanner in = new Scanner(System.in);

        if(wskaźnik < stos.length-1){
            wskaźnik++;            
            System.out.print("Podaj wartość która zostanie wprowadzona na stos: ");
            int wskaźnikNowaWartosc = in.nextInt();
            stos[wskaźnik] = wskaźnikNowaWartosc;
            System.out.println("Gotowe");
            return true;
        }
        else {
            System.out.println("Stos jest pełny, dodanie kolejnego elementu jest niemożliwe");
            in.nextLine();
            return false;
        }
    }
    private boolean zawartoscStosu(){
        Scanner in = new Scanner(System.in);
        if (wskaźnik != -1){
            System.out.println("\n_____");
            for (int i=0;i<=stos.length-1;i++){
                System.out.println(stos[i]);
            }
            System.out.println("____\n");
            return true;
        }
        else {
            System.out.println("Stos jest pusty");
            in.nextLine();
            return false;
        }
    }
    public void menu(){
        Scanner in = new Scanner(System.in);
        int menu = 1;
        
        while(menu != 0){
            System.out.println("1. Wkładanie \n2. Wyciąganie \n3. Zawartość stosu\n0. Koniec programu");
            menu = in.nextInt();
            
            switch(menu){
                case 1: if(push()) System.out.println("Gotowe!");
                else System.out.print("Wystąpił błąd!");
                break;
                case 2: if(pop()) System.out.println("Gotowe!");
                else System.out.print("Wystąpił błąd!");
                    break;
                case 3:
                    if(zawartoscStosu()) System.out.println("Gotowe!");
                else System.out.print("Wystąpił błąd!");
                    break;
                case 0: break;
            }
        }
    }

}