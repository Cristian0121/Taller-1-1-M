package pooclaculadora;


public class Calculadora {
    //ATRIBUTOS
    private String digito;
    private double resultado,angulo;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean potencia;
    private boolean porcentaje;
    private boolean raiz;
    private boolean seno;
    private boolean coseno;
    private boolean tangente;
    private boolean logaritmo;
    private boolean limpiar;
    public float resul;
    
    
    
    
    //CONSTRUCTOR
    public Calculadora(){
        
        digito = "";
        resultado = 0;
        angulo=0;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        potencia= false;
        porcentaje= false;
        raiz= false;
        seno= false;
        coseno= false;
        tangente= false;
        logaritmo= false;
        limpiar= false;
        resul=0;
    }
    
    //SETTER Y GETTER
    public String getDigito() { //OBTIENE EL VALOR
        return digito;
    }

    public void setDigito(String digito) { //COLOCA EL VALOR AL DIGITO
        this.digito = digito;
    }
    
    
    //METODO Y FUNCION
    public void agregarNum(int num)
    {
        setDigito(digito+num);
    }
    
    public void suma(String num)
    {
        this.resultado = Double.parseDouble(num);
        suma = true;
        setDigito("");
    }
    
     public void resta(String num)
    {
        this.resultado = Double.parseDouble(num);
        resta = true;
        setDigito("");
    }
     
      public void multiplicacion(String num)
    {
        this.resultado = Double.parseDouble(num);
        multiplicacion = true;
        setDigito("");
    }
      
       public void division(String num)
    {
        this.resultado = Double.parseDouble(num);
        division = true;
        setDigito("");
    }
       
       public void potencia(String num)
    {
        this.resultado = Double.parseDouble(num);
        potencia = true;
        setDigito("");
    }
       
       public void porcentaje(String num)
    {
        this.resultado = Double.parseDouble(num);
        porcentaje = true;
        setDigito("");
    }
       
       public void raiz(String num)
    {
        this.resultado = Double.parseDouble(num);
        raiz = true;
        setDigito("");
    }
       
       public void seno(String num)
    {
        this.resultado = Double.parseDouble(num);
        seno = true;
        setDigito("");
    }
       
       public void coseno(String num)
    {
        this.resultado = Double.parseDouble(num);
        coseno = true;
        setDigito("");
    }
       
       public void tangente(String num)
    {
        this.resultado = Double.parseDouble(num);
        tangente = true;
        setDigito("");
    }
       
       public void logaritmo(String num)
    {
        this.resultado = Double.parseDouble(num);
        logaritmo = true;
        setDigito("");
    }
       public void limpiar(String num)
    {
        
        setDigito("");
    }
      
       
       
    public double igual (String num)
    {
        if(suma == true){
            resultado=resultado + Double.parseDouble(num);
        }
        
        if(resta == true){
            resultado=resultado - Double.parseDouble(num);
        }
        
        if(multiplicacion == true){
            resultado=resultado * Double.parseDouble(num);
        }
        
        if(division == true){
 
            resultado=resultado / Double.parseDouble(num);
        }
        
        if(potencia == true){
            resultado=Math.pow(resultado, Double.parseDouble(num));
        }
        
        if(porcentaje == true){
            resultado= resultado/100;
        }
        
        if(raiz == true){
            resultado=  Math.sqrt(resultado);
        }
        
        if(seno == true){
            angulo = Math.toRadians(resultado);
            resultado=  Math.sin(angulo);
        }
        
        if(coseno == true){
            angulo = Math.toRadians(resultado);
            resultado=  Math.cos(angulo);
        }
        
        if(tangente == true){
            angulo = Math.toRadians(resultado);
            resultado=  Math.tan(angulo);
        }
        
        if(logaritmo == true){
            resultado=  Math.log10(resultado);
        }
        
        
        
              
        //RESETEAR VALORES
        suma =false;
        resta=false;
        multiplicacion= false;
        division= false;
        potencia= false;
        porcentaje= false;
        raiz= false;
        seno= false;
        coseno= false;
        tangente= false;
        logaritmo = false;
    
        //RETORNAR VALOR
        return resultado;
    }
     public float sum(float a,float b){
     
     resul=a+b;
     return resul;
 }
 public float res(float a,float b){
     
     resul=a-b;
     return resul;
 }
 public float mul(float a,float b){
     
     resul=a*b;
     return resul;
 }
 public float div(float a,float b){
     if(b==0){
         System.out.println("ERROR");
     }
     else{
     resul=a/b;
     }
     return resul;

}
  public float s(float a){
     
     resul=(float) Math.sin((double) a);
     return resul;
  }
   public float c(float a){
     
     resul=(float) Math.cos((double) a);
     return resul;
  }
      public float t(float a){
     
     resul=(float) Math.tan((double) a);
     return resul;
  }
   public float r(float a,float b){
     
     resul=(float) Math.pow(a,1/b);
     return resul;
 }
      public float p(float a,float b){
     
     resul=(float) Math.pow(a,b);
     return resul;
 }
     public float i(float a,float b){
     
     resul=a*(b/100);
     return resul;
 }
}


