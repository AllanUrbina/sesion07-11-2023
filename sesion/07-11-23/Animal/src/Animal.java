public class Animal {
    private String nombre;
    private double peso;
    private boolean tienepiernas;
    private boolean tieneojos;
    public Animal(String nombre,double peso, boolean tienepiernas, boolean tieneojos){
this.nombre=nombre;
this.peso=peso;

this.tienepiernas=tienepiernas;

this.tieneojos=tieneojos;


    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean isTienepiernas() {
        return tienepiernas;
    }
    public void setTienepiernas(boolean tienepiernas) {
        this.tienepiernas = tienepiernas;
    }
    public boolean isTieneojos() {
        return tieneojos;
    }
    public void setTieneojos(boolean tieneojos) {
        this.tieneojos = tieneojos;
    }
    

//Metodo funcional
    public void comer() {
       System.out.println("La jacqueline esta comiendo");
    }
    public void mover() {
       System.out.println("El jacqueline se esta moviendo");
    }
    public String mostrarNombre() {
        return nombre;
    }
}
