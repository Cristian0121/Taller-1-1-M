
package pooclaculadora;
import java.util.Scanner;
public class PooClaculadora {

  
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
        
       
        
        
        opcion = leer.nextInt();

        if(opcion==1){
            System.out.println("ingrese el dato 1");
            
         //   float c= leer.nextFloat();
            float a= leer.nextFloat();
            System.out.println("ingrese el dato 2");
            float b= leer.nextFloat();
            
            objeto1.sum(a,b);
            System.out.println(objeto1.sum(a,b));
        }
        
        else if(opcion==2){
        System.out.println("ingrese el dato 1");
        //String c= leer.nextLine();
            float a= leer.nextFloat();
            
            System.out.println("ingrese el dato 2");
            float b= leer.nextFloat();
            
            objeto1.res(a,b);
            System.out.println(objeto1.res(a,b));
        }
        
        else if(opcion==3){
            System.out.println("ingrese el dato 1");
            //String c= leer.nextLine();
            float a= leer.nextFloat();
            
            System.out.println("ingrese el dato 2");
            float b= leer.nextFloat();
            
            objeto1.mul(a,b);
            System.out.println(objeto1.mul(a,b));
        }
        
        
        else if(opcion==4){
            System.out.println("ingrese el dato 1");
            //String c= leer.nextLine();
            float a= leer.nextFloat();;
            
            System.out.println("ingrese el dato 2");
            float b= leer.nextFloat();
            objeto1.div(a,b);
            System.out.println(objeto1.div(a,b));
        }
        
        else if(opcion==5){
            System.out.println("ingrese el dato 1");
            //String c= leer.nextLine();
            float a= leer.nextFloat();
            objeto1.s(a);
            System.out.println(objeto1.s(a));
        }else if(opcion==6){
            System.out.println("ingrese el dato 1");
            //String c= leer.nextLine();
            float a= leer.nextFloat();
            objeto1.c(a);
            System.out.println(objeto1.c(a));
        }
        else if(opcion==7){
            System.out.println("ingrese el dato 1");
            //String c= leer.nextLine();
            float a= leer.nextFloat();
            objeto1.t(a);
            System.out.println(objeto1.t(a));
        }
        else if(opcion==8){
            System.out.println("ingrese el dato Base");
            //String c= leer.nextLine();
            float a= leer.nextFloat();
            
            System.out.println("ingrese radical");
            float b= leer.nextFloat();
            
            objeto1.r(a,b);
            System.out.println(objeto1.r(a,b));
        }
       else if(opcion==9){
            System.out.println("ingrese el dato Base");
            //String c= leer.nextLine();
            float a= leer.nextFloat();
            
            System.out.println("ingrese exponente");
            float b= leer.nextFloat();
            
            objeto1.p(a,b);
            System.out.println(objeto1.p(a,b));
        }
   else if(opcion==10){
            System.out.println("ingrese el dato ");
            //String c= leer.nextLine();
            float a= leer.nextFloat();
            
            System.out.println("ingrese %");
            float b= leer.nextFloat();
            
            objeto1.i(a,b);
            System.out.println(objeto1.i(a,b));
        }
         else if(opcion==11){
            opc=false;
            
         }
        }
}

}
    

