/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

/**
 *
 * @author Bryan
 */
public class Deber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se declara e inicializa la variable que almacenara la suma de todos los totales de ventas
        double ventasTotal = 0;
        //Declaracion de arreglos:
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        //Inicializacion de arreglos
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        //Se crea el formateo de cadenas que contendra los encabezados
        String cadena = String.format("\nReporte:\n");
        //Con este for se almacenan en el format los meses dados
        for (int i = 0; i < meses.length; i++) {

            cadena = String.format("%s\t\t%s", cadena, meses[i]);

        }
        //Se alamcena el resto del encabezado
        cadena = String.format("%s\tTotal\t\tPromedio\n", cadena);
        //en este for se calculan los promedios y totales de ventas, ademas se alacenan en el string.format todos los valores
        for (int i = 0; i < sucursales.length; i++) {
            
            venta_total_sucursal[i] = ventas_mes_1[i] + ventas_mes_2[i] + ventas_mes_3[i]; 
            venta_promedio_sucursal[i] = venta_total_sucursal[i] / meses.length;
            ventasTotal = ventasTotal + venta_total_sucursal[i];
            //Aqui sumamos +1 al contador 'i' para que así el numero de sucursales se presente desde el 1 en adelante
            cadena = String.format("%ssucursal %d\t%.2f\t\t%.2f\t\t%.2f\t\t%.1f\t\t%.2f\n", cadena, i+1, ventas_mes_1[i], ventas_mes_2[i], ventas_mes_3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]);

        }
        //Se ingresa el valor final al format
        cadena = String.format("%s\n\nTotales de ventas de todas la sucursales es: %.2f\n",cadena, ventasTotal);
        System.out.printf(cadena);//Se presenta la solucion

    }//Fin del main

}//fin de la clase
