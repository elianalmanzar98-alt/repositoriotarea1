
public static void main(String[]args){





//EJERCICIO 1

public class Estudiante{
    String nombre = "Felipe Elian Diaz"
    int matricula = "23-17"
    String carrera = "Ing. en Sistemas"
}

//EJERCICIO 1.2
//Programa sencillo
public static HolaJuanPerez{
/*Imprimira Hola Juan Perez */
    System.out.println("Hola Juan Perez");
/**Imprimira Aprendiendo lo basico en Java */
    System.out.println("Aprendiendo lo basico en Java");
}


//EJERCICIO 1.3
//ejercicio para corregir 
public class Ejercicio {
    public static void main(String[] args) {
        System.out.println("Hola")
        system.out.println("Mundo");
        int numero = "10";
    }
}

//ejercicio corregido
public class Ejercicio {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Mundo");
        int numero = 10;
    }
}



//EJERCICIO 1.4

public class Area(){
    int base = 5;
    int altura = 1
    int area;

    area = base * altura;
    System.out.println("Area es igual" + area);
}

//Ejercicio 1.5 

Public class InformacionPersonal(){

    System.out.println("Universidad Catolica Nordestana");
    System.out.println("Sexto Semestre");
    System.out.println("Programacion 1");
    System.out.println("Nunca te rindas, el que pervera alcanza");
}

//cap 2 

//Ejercicio 2.1

public class Definirvariables(){

    byte = 8;
    short=98;
    int =25;
    float=18.9l;
    long= 111E;
    double= 2.55;
    char= "E";
    boolean= verdadero;
   
    System.out.println(byte);
    System.out.println(short);
    System.out.println(int);
    System.out.println(float);
    System.out.println(long);
    System.out.println(double);
    System.out.println(char);
    System.out.println(boolean);
}

//Ejercicio 2.2

import java.util.Scanner;


public class CalculadoraBasica(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite su primer numero:  ");
    int num1 = sc.nextInt();
    System.out.println("Digite su seegundo numero:  ");
    int num2 = sc.nextInt();


    int suma;
    int multiplicacion;
    int resta;
    float division;
    float modulo;

    suma = num1 + num2;
    multiplicacion = num1 * num2;
    resta = num1 - num2
    division = num1/num2;
    modulo = num1 % num2;


    System.out.println("Resultado suma: " + suma);
    System.out.println("Resultado multiplicacion: " + multiplicacion);
    System.out.println("Resultado resta; " + resta);
    System.out.println("Resultado division; " + division);
    System.out.println("Resultaddo Modulo; " + modulo);

}


//EJERCICIO 2.3

import java.util.Scanner;

public class Conversion {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 Celsius a Fahrenheit");

        System.out.println("2 Fahrenheit a Celsius");
        
        System.out.println("Elija (1 o 2): ");

        int opcion = scanner.nextInt();



        if (opcion == 1) {

            System.out.println(" temperatura en Celsius: ");

            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println("%.2f grados Celsius son %.2f grados Fahrenheit.%n", celsius, fahrenheit);
            
        } else if (opcion == 2) {
            
            System.out.println(" temperatura en Fahrenheit: ");

            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5/9;

            System.out.println("%.2f grados son %.2f grados Celsius.%n", fahrenheit, celsius);
            
        } else {
            System.out.println("Opcion no valida");
        }
    }



    //EJERCICIO 2.4

    public class areacirculocons(){

       public class areacirculocons(){

        final double PI = 3.14159

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita el radio:  ");

        double radio = teclado.nextDouble();
        
        double are = PI * radio * radio;

        double perimetro = 2 * PI * radio


    }


    //EJERCICIO 2.5




    //EJERCICIO 3.1

    import java.util.Scanner;

    public class Calificaciones(){
        Scanner Scanner= mew Scanner(System.in);

        System.out.println("Digite su calificacion (0-100):  ");

        int calificaciones = lector.nextInt();

        char letra ;


        if (calificacion >= 90) {
            letra = "A";

        else if (calificacion >=80)
             letra ="B";

        else if (calificacion >=70)
            letra = "C";

        else if (calificacion >=60)
            letra = "D"
        else letra= "F";

        if calificacion >= 70 
        System.out.println("Aprobado");
        else 
            System.out.println("No aprobado");
    }

    //Ejercicio 3.2

    Public class menucalculadora(){
        System.out.println("1  dividir";)
        System.out.println("1   salir";)
        Scanner opcion = new scanner.nextInt();



        witch(opcion) (
case 1:

  System.out.println("Digitar el primer numero: ");
  double nul= scanner.nextInt("Digitar el segundo: ");
  Systemsten.out.println ()
  double nu2 = scanner.nextInt();
  System.out.println("El resultado es: " + (num1 + num2));
 break;

case 2:
  System.out. println("Digitar el primer numero: ");
  double nu1 = scanner.nextInt();
  System.out.println("Digitar el segundo: ");
  double nu2 = scanner.nextInt();
  System.out. println("El resultado es: " + (nu1 - nu2));
case 3:
  System.out.println("Digitar el primer numero: ");
  doble nu1 = scanner.nextInt();
  System.out.println("Digitar el segundo: ");
  double nu=scanner.nextInt();
  System.out.println("El resultado es: " + (nu1 * nu2));
case 4:
  System.out println("Digitar el primer numero: ");
  double nul = scanner.nextInt();
  System.out.println("Digitar el segundo : ");
  doble nu2 = scanner.nextInt();
  System.out.println("El resultado es: " + (nu1 / nu2))
 }



} 

    }
}

