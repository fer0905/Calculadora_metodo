import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Agrega el valor de numero 1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Agrega el valor de numero 2: "));
        Operaciones opera1=new Operaciones ();
        opera1.sumar(n1,n2);
        opera1.restar(n1,n2);
        opera1.multiplicar(n1,n2);
        opera1.division(n1,n2);
        opera1.modulo(n1,n2);
        opera1.MostrarResultado();   
    }
}    