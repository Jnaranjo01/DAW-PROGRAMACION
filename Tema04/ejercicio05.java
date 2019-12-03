import java.util.Scanner;

public class ejercicio05 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
     
      int a,b;
      double resultado;

      System.out.println("Calculadora de ecuaciones del tipo: ax + b");
      
      System.out.println("Introduce la variable a");
      a = s.nextInt();
      
      System.out.println("Introduce la variable b ");
      b = s.nextInt();

      if ( a == 0 ){
        
        System.out.println("El valor de a no puede ser 0"); 

      } else {

        resultado = -b/a;

        System.out.printf("El resultado de la ecuación es: "+resultado);

      }
  }
}

