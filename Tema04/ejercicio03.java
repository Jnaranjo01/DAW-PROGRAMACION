import java.util.Scanner;

public class ejercicio03{   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
     
      int dia;
      
      System.out.println("Introduce un número del 1 al 7, que se corresponde con un día de la semana: ");

      dia = s.nextInt();

      switch (dia) {
        case 1:
            System.out.println("lunes");
          break;

        case 2:
            System.out.println("martes");
          break;

        case 3:
            System.out.println("miércoles");
          break; 
        
        case 4:
            System.out.println("jueves");
          break;
        
        case 5:
            System.out.println("Viernes");
          break;
        case 6:
            System.out.println("Sábado");
          break;
        case 7:
            System.out.println("Domingo");
          break;
        
          
        default:
            System.out.println("Ese número no corresponde a un día de la semana");
          break;
      }
    }
}
