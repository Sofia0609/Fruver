/*ANALISIS
* Descripcion: El usuario ingresa la cantidad de frutas que va a llevar. Con eso hacemos, sumamos cada producto, y lo multiplicamos por el precio, para tener el subtotal
* Luego sumamos, para llegar al total de la compra, aplicamos un 10% de descuento, multiplicando el total con 0.10, y por ultimo restamos ese valor para encontrar el total
* Entradas: 2 entradas int
* Salidas: 5 salidas double
* Ejemplo: 
*/

import java.util.Scanner;

public class Fruteria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        final int PRECIO_MANZANA=1000;
        final int PRECIO_BANANO=800;
        int manzana, banano;

        System.out.println("Cuantas manzanas va a llevar?: ");
        manzana = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Cuantos bananos va a llevar?: ");
        banano = entrada.nextInt();
        entrada.nextLine();

        double subtotalmanzana, subtotalbanano, total, descuento, totalfinal;
        subtotalmanzana = submanzana(manzana, PRECIO_MANZANA);
        subtotalbanano = subanano(banano, PRECIO_BANANO);


        System.out.println("El subtotal de la cantidad de las manzanas es: " + subtotalmanzana);
        System.out.println("El subtotal de la cantidad de las banano es: " + subtotalbanano);
    }

    public static int submanzana(int manzana, int preciomanzana) { 
        return manzana*preciomanzana;
    } 

    public static int subanano(int banano, int preciobanano) {
        return banano*preciobanano;
    }

}