import java.util.Scanner;
public class Calculadora {

  
    public static void main(String[] args) {
     
          int opcion;
          double resultado;
          double angulo;
          boolean opc=true;
          
        while(opc){
            
        System.out.println("\n***Menú de operaciones***\n");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Seno");
        System.out.println("6.Coseno");
        System.out.println("7.Tangente");
        System.out.println("8.Raiz.n");
        System.out.println("9.Potencia.n");
        System.out.println("10.Porcentaje");
        System.out.println("11.Salir\n");
        
        Scanner leer = new Scanner (System.in);
        opcion = leer.nextInt();

        if(opcion==1){ //SUMA
            
            System.out.println("Ingrese el dato 1");
            float a= leer.nextFloat();
            System.out.println("Ingrese el dato 2");
            float b= leer.nextFloat();
            
            resultado=a+b;
            System.out.println("\nEl resultado es: "+ resultado);
            
        }
        
        else if(opcion==2){ //RESTA
            
            System.out.println("ingrese el dato 1");
            float a= leer.nextFloat();
            System.out.println("ingrese el dato 2");
            float b= leer.nextFloat();
            
            resultado=a-b;
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
        else if(opcion==3){ //MULTIPLICACION
            
            System.out.println("ingrese el dato 1");
            float a= leer.nextFloat();
            System.out.println("ingrese el dato 2");
            float b= leer.nextFloat();
            
            resultado=a*b;
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
        
        else if(opcion==4){ //DIVISION
            
            System.out.println("ingrese el dato 1");
            float a= leer.nextFloat();;
            System.out.println("ingrese el dato 2");
            float b= leer.nextFloat();
            
            resultado=a/b;
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
        else if(opcion==5){ //SENO
            
            System.out.println("ingrese el angulo");
            float a= leer.nextFloat();
            
            angulo= Math.toRadians(a);
            resultado= Math.sin(angulo);
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
        else if(opcion==6){ //COSENO
            
            System.out.println("ingrese el angulo");
            double a= leer.nextFloat();
            
            angulo= Math.toRadians(a);
            resultado= Math.cos(angulo);
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
        else if(opcion==7){ //TANGENTE
            
            System.out.println("ingrese el angulo");
            float a= leer.nextFloat();
            
            angulo= Math.toRadians(a);
            resultado= Math.tan(angulo);
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
        else if(opcion==8){ //RAIZ
            
            System.out.println("ingrese el dato Base");
            float a= leer.nextFloat();
            System.out.println("ingrese radical");
            float b= leer.nextFloat();
            
            resultado= Math.pow(a,1/b);
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
       else if(opcion==9){ //POTENCIA
           
            System.out.println("ingrese el dato Base");
            float a= leer.nextFloat();
            System.out.println("ingrese exponente");
            float b= leer.nextFloat();
            
            resultado=Math.pow(a,b);
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
   else if(opcion==10){ //PORCENTAJE
       
            System.out.println("ingrese el dato ");
            float a= leer.nextFloat();
            System.out.println("ingrese %");
            float b= leer.nextFloat();
            
            resultado=a*(b/100);
            System.out.println("\nEl resultado es: "+resultado);
            
        }
        
         else if(opcion==11){ //SALIR
             
            opc=false;
            
        }
         
        }
}

}
        }
}

}
    
