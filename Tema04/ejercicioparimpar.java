import java.util.Scanner;

public class ejercicioparimpar{
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
  
      int numusu;
      
      System.out.println("Introduce un número entero");
      numusu = s.nextInt();
      
      if ((numusu % 2) == 0 ){
        
        System.out.println("El número "+numusu+" es par");  
      
      } else {
        
        System.out.println("El número "+numusu+" es impar");  

      }
  }
}
