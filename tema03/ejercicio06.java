import java.util.Scanner;

public class ejercicio06{
  public static void main(String[] args){
  Scanner s = new Scanner (System.in);
  
  float resultado;
  
    System.out.println("Introduce la base y la altura del triangulo para hallar el area");
    
   float base = s.nextFloat();
   float altura = s.nextFloat();
   
   resultado = (base * altura)/2;
   
   System.out.printf("El area del triangulo es: %.2f",resultado);
  
  }
}
