package arreglo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arreglo {

    int[] enteros = new int[10];

    int[][] enterosBi = new int[10][10];

    public static void sumarLista(int[] enteros) {
        int suma = 0;

        for (int i = 0; i < enteros.length; i++) {
            int aleat = (int) (Math.random() * 100 + 1);
            System.out.println(" " + aleat);
            enteros[i] = aleat;
        }

        for (int i = 0; i < enteros.length; i++) {

            suma += enteros[i];
        }
        double pro = suma / enteros.length;
        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " + pro);

    }

    public static void buscarMayor(int[][] enterosBi) {
        int mayor = enterosBi[0][0];

        for (int i = 0; i < enterosBi.length; i++) {
            int aleat = (int) (Math.random() * 100 + 1);
            System.out.println(" " + aleat);
            enterosBi[i][i] = aleat;
        }

        for (int i = 0; i < enterosBi.length; i++) {
            if (enterosBi[i][i] > mayor) {
                mayor = enterosBi[i][i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    public static void cuentaVocales() {
        Scanner entrada = new Scanner(System.in);

        String palabra;

        int vocal = 0;

        System.out.println("Ingrese Palabra");

        palabra = entrada.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'A')
                    || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'E')
                    || (palabra.charAt(i) == 'i') || (palabra.charAt(i) == 'I')
                    || (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'O')
                    || (palabra.charAt(i) == 'u') || (palabra.charAt(i) == 'U')) {
                vocal++;
            }
        }

        System.out.println("La Palabra tiene" + " " + vocal + " " + "vocales");

    }

    public static int contarCaracteres(String cadenaTexto, char caracter) {

        int pos = 0;
        int contador = 0;
        pos = cadenaTexto.indexOf(caracter);
        while (pos != -1) {
            contador++;
            pos = cadenaTexto.indexOf(caracter, pos + 1);
        }
        System.out.println(cadenaTexto);
        System.out.println("se encontraron" + " " + contador + " " + "veces repetidas");

        return contador;

    }

}
