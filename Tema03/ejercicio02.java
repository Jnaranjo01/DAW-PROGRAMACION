import java.util.Scanner;

public class ejercicio02{
  public static void main(String[] args){
  Scanner s = new Scanner (System.in);
  
  double pesetas;
  
    System.out.println("Dime la cantidad de euros que quieres que convierta a pesetas");
    
  double euros = s.nextDouble();
   
  pesetas = euros*166.386;
   
  System.out.printf("La conversión de euros a pesetas es: " +pesetas);

  }
}
