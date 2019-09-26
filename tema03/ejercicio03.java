import java.util.Scanner;

public class ejercicio03{
  public static void main(String[] args){
  Scanner s = new Scanner (System.in);
  
  double euros;
  
    System.out.println("Dime la cantidad de pesetas que quieres que convierta a euros");
    
  int pesetas = s.nextInt();
   
   euros = pesetas/166.386;
   
   System.out.printf("La conversión de pesetas a euros es: %.2f€", euros);
   
  }
}
