import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
     
          int opcion;
        Calculadora objeto1=new Calculadora();
        boolean opc=true;
        while(opc){
        System.out.println("Menú de operaciones");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.seno");
        System.out.println("6.coseno");
        System.out.println("7.tangente");
        System.out.println("8.Raiz.n");
        System.out.println("9.potencia.n");
        System.out.println("10.porcentaje");
        System.out.println("11.salir");
        Scanner leer = new Scanner (System.in);