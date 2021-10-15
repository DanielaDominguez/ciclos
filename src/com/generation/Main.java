package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // código que se repite i veces
        for (int i=0; i<=10; i++) {
        }
        //-----------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        for (int i =1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }

        //------------------
        // Ciclo for

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos términos de la serie?: ");
        int count = scanner.nextInt();
        int n1=0,n2=1,n3,i;
        scanner.close();
        if (count == 0) {
            System.out.println("No hay términos suficientes para mostrar");
        } else if (count == 1) {
            System.out.println(n1);
        } else {
            System.out.print(n1+" "+n2);
            for(i=2;i<count;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
        };

        //-----------------------------
        // Ciclo while

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el número secreto: ");
        int numero = scanner.nextInt();
//        int numeroSecreto = 33;
        Random random = new Random(47);
        int numeroSecreto = random.nextInt(10);
        System.out.println(numeroSecreto);
        while (numero != numeroSecreto) {
            System.out.println("Adivina el número secreto: ");
            numero = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Felicidades adivinaste el número secreto");

        //------------------------------
        //Serie de fibonacci con while

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();
        int acarreo1=0;
        int acarreo2=1;
        int suma;
        for(int i = 1; i <=numero;i++){
            suma=acarreo1+acarreo2;
            acarreo1=acarreo2;
            acarreo2=suma;
            System.out.println("Iteracion "+i+", es "+suma);
        }
        While con prueba del numero secreto
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto");
        int numero = sc.nextInt();
        int numeroSecreto = 511;

        while(numero != numeroSecreto){
            System.out.println("Ese no es, vuelve a intentar");
            numero = sc.nextInt();
        }
        System.out.println("Al fin!, efectivamente el numero es: " +numero);

        //-------------------------------
        // Ejercicio Factorial con while

        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        int i = 2;

        while (i <= numero) {
            factorial *= i;
            i++;
        }
        scanner.close();
        System.out.println("Factorial: " + factorial);

        //------------------------------
        // Ciclo Do-While
        // prueba numero secreto

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;
        do {
            System.out.println("Adivina el número secreto: ");
            numero = scanner.nextInt();
        } while (numero != numeroSecreto);
        scanner.close();
        System.out.println("Felicidades adivinaste el número secreto");
        
    }
}
