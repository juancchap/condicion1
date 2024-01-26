package condicion1;

import java.util.Scanner;

public class Condicion1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
        int edad;
        //pedimos la edad
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();
        //condicion si es mayor de edad o menor de edad
        if (edad > 17) 
        {
        System.out.println("Eres mayor de edad");        
        } 
        else 
        {
        System.out.println("Eres menor de edad");
        }

    }

}
