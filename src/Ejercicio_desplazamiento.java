public class Ejercicio_desplazamiento {
    int altura_inicial = 500;
    int velocidad_inicial = 75;
    int gravedad_entera = 9;
    float gravedad_float = 9.8f;
    double n;
    //Constructores
    public Ejercicio_desplazamiento(int altura_inicial, int velocidad_inicial, int gravedad_entera, float gravedad_float, double n) {
        this.altura_inicial = altura_inicial;
        this.velocidad_inicial = velocidad_inicial;
        this.gravedad_entera = gravedad_entera;
        this.gravedad_float = gravedad_float;
        this.n = n;
    }

    public Ejercicio_desplazamiento() {

    }

    //Getters y Setters
    public int getAltura_inicial() {
        return altura_inicial;
    }

    public int getVelocidad_inicial() {
        return velocidad_inicial;
    }
    public int getGravedad_entera() {
        return gravedad_entera;
    }

    public float getGravedad_float() {
        return gravedad_float;
    }

    public double getN() {
        return n;
    }

    public void setAltura_inicial(int altura_inicial) {
        this.altura_inicial = altura_inicial;
    }

    public void setVelocidad_inicial(int velocidad_inicial) {
        this.velocidad_inicial = velocidad_inicial;
    }

    public void setGravedad_entera(int gravedad_entera) {
        this.gravedad_entera = gravedad_entera;
    }

    public void setGravedad_float(float gravedad_float) {
        this.gravedad_float = gravedad_float;
    }

    public void setN(double n) {
        this.n = n;
    }

    //Metodo para calcular desplazamiento con la gravedad siendo entero
    public double desplazamiento(){
        return altura_inicial + velocidad_inicial  * n + 0.5 * gravedad_entera * n * n;
    }

    //Metodo para calcular desplazamiento con la gravedad siendo float
    public double desplazamiento_float(){
        return altura_inicial + velocidad_inicial  * n + 0.5 * gravedad_float * n * n;
    }

    public void imprimir(){
        System.out.println("El tiempo ingresado es: "+ getN());
        System.out.println("Desplazamiento con valor de gravedad entero: "+desplazamiento());
        System.out.println("Desplazamiento con valor de gravedad float: "+desplazamiento_float());
    }

}
