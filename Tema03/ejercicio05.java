import java.util.Scanner;

public class ejercicio05{
  public static void main(String[] args){
  Scanner s = new Scanner (System.in);
  
  float resultado;
  
    System.out.println("Introduce la base y la altura del rectangulo para hallar el area");
    
   float base = s.nextFloat();
   float altura = s.nextFloat();
   
   resultado = base * altura;
   
   System.out.printf("El area del rectangulo es: %.2f",resultado);
  
  }
}
