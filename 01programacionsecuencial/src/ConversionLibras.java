import javax.swing.*;

/*
*escribir un programa que convierta tres numeros de
* kilogramos a libras(1 libra = 0.454)
*
*
*/
public class ConversionLibras {
    public static void main(String[] args) {
   //declaracion de constante
final double FACTOR_CONVERSION =0.454;


//declaracion de variables de tres numeros dobles a convertir
        double numero1=10.0;
        double numero2=50.0;
        double numero3=100.0;
        double c1=0.0;
        double c2=0.0;
        double c3=0.0;
        String salida ="";

//proceso de conversion
        c1 = numero1 / FACTOR_CONVERSION;
        c2 = numero2 / FACTOR_CONVERSION;
        c3 = numero3 / FACTOR_CONVERSION;

salida = numero1 + "KG"+ "en libras es:" + String.format("%.3f",c1);


        JOptionPane.showMessageDialog(null,salida);



}}