import java.util.Scanner;

public class ejercicio01{   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
     
      String dia;
      
      System.out.println("Introduce (solo con minúscula) el dia de la semana, solo de lunes a viernes: ");

      dia = s.next();

      switch (dia) {
        case "lunes":
            System.out.println("A primera hora se imparte Entorno de desarrollo ");
          break;

        case "martes":
            System.out.println("A primera hora se imparte Programación ");
          break;

        case "miercoles":
            System.out.println("A primera hora se imparte Programación ");
          break; 
        
        case "jueves":
            System.out.println("A primera hora se imparte Programación ");
          break;
        
        case "viernes":
            System.out.println("A primera hora se imparte Formación y orientación laboral");
          break;
          
        default:
            System.out.println("No es un día de la semana");
          break;
      }
    }
}

