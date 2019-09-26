import java.util.Scanner;

public class ejercicio04 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
     
      int horastrabajadas,horasextras;
      int salario;

      
      System.out.print("Introduce la hora del dia, obviando los minutos: ");

      horastrabajadas = s.nextInt();

      if (horastrabajadas<=40){

        salario = horastrabajadas*12;

        System.out.println(" El salario total, sin horas extras es " +salario+"€");

      } else {
        
        horasextras = horastrabajadas - 40;
        salario = horastrabajadas*12;

        salario = (salario + (horasextras*16));
        
        System.out.println(" El salario total, sumando horas extras es " +salario+"€");

      }
    }
  }
