
package cafetera;


public class Funciones {
    
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Funciones(){
        capacidadMaxima = 0;
        cantidadActual = 0;
    }
    
    public  Funciones(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public int getcapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public int getcapacidadActual(){
        return cantidadActual;
    }
    
    public void setcapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void setcantidadActual(int cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Llenado satisfactoriamente");
    }
    
    public void servirTaza(int c){
        this.cantidadActual= cantidadActual-c;
        if(this.cantidadActual<0){
            System.out.println("Ya no hay cafe!! por favor llene la cafetera");
            System.out.println("falto: "+this.cantidadActual*-1+"ml");
            this.cantidadActual=0;
        }else{
            System.out.println("Llenado satisfactoriamente");
        }
    }
    
    public void agregarCafe(int c){
        int res;
        this.cantidadActual=this.cantidadActual+c;
        if(this.cantidadActual>this.capacidadMaxima){
            System.out.println("La cafetera se lleno al maximo");
            res=this.cantidadActual-this.capacidadMaxima;
            System.out.println("sobraron: "+res+"ml");
            this.cantidadActual=this.capacidadMaxima;
        }else{
            System.out.println("La cafetera se lleno satisfactoriamente");
        }
    }
    
    public void vaciarCafetera(){
        if(this.cantidadActual==0){
            System.out.println("La cafetera ya estaba vacia");
        }else{
            this.cantidadActual=0;
            System.out.println("Vaciado satisfactoriamente");
        }
    }
    public String toStrig(){
        return " ";
    }
}
