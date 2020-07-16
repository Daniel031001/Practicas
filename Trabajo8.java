package Trabajo8;


import java.util.Scanner;

public class Trabajo8 {
    public static void main(String[] args) {
       
        Scanner x = new Scanner (System.in);
        double num,raiz;
        int ent;
        System.out.println("Ingrese el numero: ");
        num=x.nextInt();
        
        raiz= Math.cbrt(num);
     
        ent = (int) raiz;
        
        if(raiz-ent==0){
            System.out.println("Este numero es cubico");
        }
        
        else{
            System.out.println("Este numero no es cubico");
        } 
    }
    
}
