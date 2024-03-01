import javax.swing.JOptionPane;
public class Operaciones {
//Atributos
int suma;
int resta;
int multiplicacion;
int division;
int modulo;
//Método de suma
    public void sumar(int numero1,int numero2){
        suma=numero1+numero2;
    }
//Método de resta
    public void restar(int numero1,int numero2){
        resta=numero1-numero2;
    }
//Método de multiplicación
    public void multiplicar(int numero1,int numero2){
        multiplicacion=numero1*numero2;
    }
//Método de division
    public void division(int numero1,int numero2){
        division=numero1/numero2;
    }
//Método de módulo
    public void modulo(int numero1,int numero2){
        modulo=numero1%numero2;
    }    
//Método de visualizar el resultado
public void MostrarResultado() {
    System.out.println("El resultado de la suma es: "+suma);
    System.out.println("El resultado de la resta es: "+resta);
    System.out.println("El resultado de la multiplicación es: "+multiplicacion);
    System.out.println("El resultado de la división es: "+division);
    System.out.println("El resultado del módulo es: "+modulo);
}
}    