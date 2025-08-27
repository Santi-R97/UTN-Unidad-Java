
import java.util.Scanner;


public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Act 2
        System.out.println("!Hola, Java!"); 

 // Act 3    
        String nombre = "santiago";
        int edad = 27;
        double altura = 1.80;
        boolean estudiante = true;
        
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nAltura: " +    altura + "\nEstudiante: " + estudiante);

 // Act 4
        Scanner input = new Scanner(System.in);
                String nombre;
                int edad;
                
                System.out.print("Ingrese su nombre: ");
                nombre = input.nextLine();
                
                System.out.print("Ingrese su edad: ");
                edad = Integer.parseInt(input.nextLine());
                
                System.out.println("Tu nombre es " + nombre);
                System.out.println("Tu edad es " + edad);

 // Act 5
            Scanner input = new Scanner(System.in);
                int n1, n2, suma, resta, multiplicacion;
                double division;
                
                System.out.print("Ingrese un numero entero: ");
                n1 = input.nextInt();
                
                System.out.print("Ingrese otro numero entero: ");
                n2 = input.nextInt();
                
                suma = n1 + n2;
                resta = n1 - n2;
                multiplicacion = n1 * n2;
                division = n1 / n2;
                
                System.out.println("La suma de los numeros es: " + suma);
                System.out.println("La resta de los numeros es: " + resta);
                System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
                System.out.println("La division de los numeros es: " + division);

 // Act 6
                Scanner input = new Scanner(System.in);
                String nombre, direccion;
                int edad;
                
                System.out.print("Ingrese su nombre y apellido: ");
                nombre = input.nextLine();
                
                System.out.print("Ingrese su edad: ");
                edad = Integer.parseInt(input.nextLine());
                
                System.out.print("Ingrese su direccion: ");
                direccion = input.nextLine();
                
                System.out.println("Nombre: " + nombre + "\nEdad: " + edad + " años" + "\nDireccion: \"" + direccion + "\"");


 // Act 7
                int x = 10; // Línea 1
                x = x + 5; // Línea 2
                System.out.println(x); // Línea 3
                
             // x = x + 5; es una instrucción, le dice al programa que haga algo, como declarar una variable, asignar un valor entre otras cosas, dentro de esta instruccion se encuentra la expresión x + 5. Las expresiones están dentro de las instrucciones y son evaluadas para que la instrucción se pueda ejecutar.
                
 // Act 8
                Scanner input = new Scanner(System.in);
                double n1, n2, division;
                
                System.out.print("Ingrese un numero entero: ");
                n1 = input.nextDouble();
                
                System.out.print("Ingrese otro numero entero: ");
                n2 = input.nextDouble();
                
                division = n1 / n2;
                
                System.out.println("El divison de los numeros es: " + division);
                
 // Act 9
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa tu nombre: ");
                String nombre = scanner.nextLine(); // ERROR
                System.out.println("Hola, " + nombre);
                
                //El error en la linea marcada del codigo es que esta pidiendo un entero usando nextInt(). Como el usuario debe ingresar un nombre tiene que usar nextLine().
                
    }

}
