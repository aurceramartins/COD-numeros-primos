package refactorizar;

import java.util.Scanner;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar {

    public static void main(String[] args) {
        boolean esPrimo = false;
         int rubendelegadodigitos=longitudDigitos();
                int contadorDigitos = 0;
                if (rubendelegadodigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorDigitos = contador;


            if (contadorDigitos == rubendelegadodigitos) {
                if (i < 4) {
                    esPrimo = true;
                } else {
                    if (i % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                            System.out.println("El numero es primo");
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(i);
                }
                
            }
        }
    }

    private static int longitudDigitos() {
        Scanner valor=new Scanner(System.in);
        System.out.println("Dame el numero primo con el que quieres que empiece");
        int rubendelegadodigitos=valor.nextInt();
        return rubendelegadodigitos;
    }
    
    
}
