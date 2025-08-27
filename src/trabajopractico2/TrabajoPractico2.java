// Nombre: Rodriguez Santiago Gabriel

// Programacion ii: Trabajo Practico 2

package trabajopractico2;

import java.util.Scanner;

public class TrabajoPractico2 {
    
    static void imprimirPrecios(double[] arr, int posicion) {
        if (posicion == arr.length) return;
        System.out.println("Precio: $" + arr[posicion]);
        imprimirPrecios(arr, posicion + 1);   
}
    
    static double[] PRECIOS = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado =  precio * DESCUENTO_ESPECIAL;
        double precioTotal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioTotal);
    }
    
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static int actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
    
        String z = zona.toLowerCase();

        double precioPorKg;
        if (z.equals("nacional")) {
            precioPorKg = 5.0;
        } else if (z.equals("internacional")) {
            precioPorKg = 10.0;
        } else {
            System.out.println("Zona inválida: use Nacional o Internacional");
            precioPorKg = 0;
        }
        return peso * precioPorKg;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }
    
public static void main(String[] args) {
//  Actividad 1        
    Scanner input = new Scanner(System.in);
    int anio;
    
    System.out.println("Ingrese un año: ");
    anio = Integer.parseInt(input.nextLine());
    
    if (anio % 4 == 0 && anio % 100 != 0 || (anio % 400 == 0)) {
        System.out.println("El año " + anio + " es Bisiesto");
            
    } else { System.out.println("El año " + anio + " no es Bisiesto");
    }

//  Actividad 2
    Scanner input = new Scanner(System.in);
    int num1, num2, num3;
    
    System.out.println("Ingrese un primer numero entero: ");
    num1 = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese un segundo numero entero: ");
    num2 = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese un tercer numero entero: ");
    num3 = Integer.parseInt(input.nextLine());
    
    
    if (num1 > num2 && num1 > num3) {
        System.out.println("El mayor es: " + num1);
    }
    if (num2 > num1 && num2 > num3) {
        System.out.println("El mayor es: " + num2);
    }
    if (num3 > num1 && num3 > num2) {
        System.out.println("El mayor es: " + num3);
    }

//  Actividad 3
    Scanner input = new Scanner(System.in);
    int edad;
    
    System.out.print("Ingrese su edad: ");
    edad = Integer.parseInt(input.nextLine());
    
    if (edad < 12) {
        System.out.println("Eres un Niño");     
    }
    if (edad >= 12 && edad <= 17) {
        System.out.println("Eres un Adolescente");     
    }
    if (edad >= 18 && edad <= 59) {
        System.out.println("Eres un Adulto");     
    }
    if (edad >= 60) {
        System.out.println("Eres un Adulto mayor");     
    }

//  Actividad 4
    Scanner input = new Scanner(System.in);
    double precio;
    char categoria;
    
    System.out.print("Ingrese el precio del producto: ");
    precio = Double.parseDouble(input.nextLine());
    
    System.out.print("Ingrese la categoría del producto (A, B o C): ");
    categoria = input.nextLine().charAt(0);
    categoria = Character.toUpperCase(categoria);
    
    if (categoria == 'A') {
        System.out.println("Descuento aplicado: 10%");
        System.out.println("Precio final: " + (precio - precio * 0.10));    
    } else if (categoria == 'B') {
        System.out.println("Descuento aplicado: 15%");
        System.out.println("Precio final: " + (precio - precio * 0.15));
    } else if (categoria == 'C') {
        System.out.println("Descuento aplicado: 20%");
        System.out.println("Precio final: " + (precio - precio * 0.20));
    }

//  Actividad 5
    Scanner input = new Scanner(System.in);
    int num;
    int suma = 0;
    
    System.out.print("Ingrese un número (0 para terminar): ");
    num = Integer.parseInt(input.nextLine());
    
    while (num != 0) {        
        if (num % 2 == 0) {
            suma = suma + num;
        }
        System.out.print("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
    }
    
    System.out.println("La suma de los números pares es: " + suma);
    
//  Actividad 6
    Scanner input = new Scanner(System.in);
    int num;
    int positivos, negativos, ceros;
    
    positivos = 0;
    negativos = 0;
    ceros = 0;
    
    for (int i =1; i <= 10; i++) {
        System.out.print("Ingrese el número " + i + ": ");
        num = Integer.parseInt(input.nextLine());
        
        if (num == 0) {
          ceros =  ceros + 1;  
        }  else if (num > 0) {
            positivos = positivos + 1;
        } else { 
            negativos = negativos + 1;
        }
    }
    
    System.out.println("Resultados: \nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);

//  Actividad 7
    Scanner input = new Scanner(System.in);
    double nota;
    
    do {
        System.out.print("Ingrese una nota (0-10): ");
        nota = Double.parseDouble(input.nextLine());
        
        if (nota < 0 || nota > 10) {
            System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
        }
        
    } while (nota < 0 || nota > 10);
    
    System.out.println("Nota guardada correctamente.");

//  Actividad 8
    Scanner input = new Scanner(System.in);
  
    System.out.print("Ingrese el precio base del producto: ");
    double precioBase = Double.parseDouble(input.nextLine());
    
    System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
    double impuesto = Double.parseDouble(input.nextLine());
    
    System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
    double descuento = Double.parseDouble(input.nextLine());
    
    double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
    
    System.out.println("El precio final del producto es: " + precioFinal);

//  Actividad 9
    Scanner input = new Scanner(System.in);
    
    System.out.print("Ingrese el precio del producto: ");
    double precioProducto = Double.parseDouble(input.nextLine());
    
    System.out.print("Ingrese el peso del paquete en kg: ");
    double peso = Double.parseDouble(input.nextLine());
    
    String zona;
        while (true) {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = input.nextLine();
            String z = zona.toLowerCase();
            if (z.equals("nacional") || z.equals("internacional")) break;
            System.out.println("Zona inválida. Intente nuevamente.");
        }
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
//  Actividad 10
    Scanner input = new Scanner(System.in);
    
    System.out.print("Ingrese el stock actual del producto: ");
    int stockActual = Integer.parseInt(input.nextLine());
    
    System.out.print("Ingrese la cantidad vendida: ");
    int cantidadVendida = Integer.parseInt(input.nextLine());
    
    System.out.print("Ingrese la cantidad recibida: ");
    int cantidadRecibida = Integer.parseInt(input.nextLine());
    
    int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
    
    System.out.println("El nuevo stock del producto es: " + nuevoStock);

//  Actividad 11
    Scanner input = new Scanner(System.in);
    
    System.out.print("Ingrese el precio del producto: ");
    double precio = Double.parseDouble(input.nextLine());
    
    calcularDescuentoEspecial(precio);
        
//  Actividad 12
    double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    System.out.println("Precios originales: ");
    for (double precio : precios) {
        System.out.println("Precio: $" + precio);
    }
    
    precios[2] = 129.99;
    
    System.out.println("Precios modificados: ");
    for (double precio : precios) {
        System.out.println("Precio: $" + precio);
    }
    
//  Actividad 13
    System.out.println("Precios originales: ");
    imprimirPrecios(PRECIOS, 0);
    
    PRECIOS[2] = 129.99;
    
    System.out.println("Precios modificados: ");
    imprimirPrecios(PRECIOS, 0);
    
    
    
}
}
