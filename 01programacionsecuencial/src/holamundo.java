import javax.swing.*;

public class holamundo
{
    public static void main(String[] args) {
//        System.out.println("hola mundo");
////        double e1= 2.0+5*3.0/2.0+5*(2+2);
//        System.out.println(e1);
        //declaracion de variables
        double r= 0 , r2 = 0, r3 = 0 , r4 = 0  , r5 = 0;

        double a = 0.0 , y= 0.0 , z = 0.0 , x = 0.0 , b = 0.0;

                String salida = "";
//        a =Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de a : "));
//        y = Double.parseDouble(JOptionPane.showInputDialog("ingresa el valor de y : "));
//        z = Double.parseDouble(JOptionPane.showInputDialog("ingresa el valor de z : "));
//        x = Double.parseDouble(JOptionPane.showInputDialog("ingresa el valor de x "));
//        b = Double.parseDouble(JOptionPane.showInputDialog("ingresa el valor de b "));

        r = Math.pow(a + Math.pow(y, z+1) / (x-1) , 2);
        r2 = Math.pow(Math.sqrt(Math.pow(a-b,2)) /(4*x) ,z-1);
        r3 = 1.0 / Math.sqrt(Math.pow(x,2)- (4  * x));
        r4 = Math.pow(a+Math.pow(y, z +1),2);
        r5 = (y-3) / Math.pow(x,3);

        salida = "el resultado de la expresion 1 es" + r;
        salida = "el resultado de la expresion 2 es" + r2;
        salida = "el resultado de la expresion 3 es " + r3;
        salida  = "el resultado de la expresion 3 es" + r4;
        salida = "el resultado de la expresion 4 es " + r4;
        salida = "el resultado de la expresion 4 es" + r5;






        JOptionPane.showMessageDialog(null,"el resultado de la expresion 1:" + r );




    }

}
