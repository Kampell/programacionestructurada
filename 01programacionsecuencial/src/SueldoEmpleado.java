import javax.swing.*;

/**
 * Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
 * siguientes características
 * a. Se debe almacenar el nombre del empleado
 * b. Las horas trabajadas que deben ser horas sin parte fraccionaria
 * c. Cuota por hora
 * d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
 */

public class SueldoEmpleado {
    public static void main(String[] args) {
        //declaracion de variables
        String nombres = "";
        int Ht = 0;
        double cuotaHora = 0.0;
        double sueldo = 0.0;

        //Entrada de valores

        nombres = JOptionPane.showInputDialog("introduce el nombre del trabajador");
        cuotaHora = Double.parseDouble(JOptionPane.showInputDialog("introduce la cuota por hora"));
        Ht = Integer.parseInt(JOptionPane.showInputDialog("introduce las horas trabajadas"));

//calculo del sueldo
        sueldo = cuotaHora+Ht;

        JOptionPane.showMessageDialog(null,"el empleado " + nombres + " con horas trabajadas con  " + Ht + "horas trabajadas con una cuota de:  " + cuotaHora + "      tiene un sueldo de :   " + String.format("%.2f",sueldo));

    }
        }


