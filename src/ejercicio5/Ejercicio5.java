package ejercicio5;

import java.util.Random;
import java.util.Scanner;



public class Ejercicio5 {    

public static void main(String[] args){       
Scanner entrada =new Scanner(System.in);
Random random= new Random();
int n,aleatorio, min=0,max=200;    
System.out.println("Digite un numero: ");
    n=entrada.nextInt();
for(int i=0;i<n;i++){
    aleatorio=random.nextInt(max-min+1)+min;
    System.out.println("El elemento "+i+" es: "+aleatorio);
}    


}
  
}