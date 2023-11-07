public class Perro extends Animal {
    
  private boolean tienecola;
    private boolean tieneorejas;
    private String raza;

    public Perro(String nombre, double peso, boolean tienepiernas, boolean tieneojos,boolean tienecola, boolean tieneorejas, String raza) {
        super(nombre, peso, tienepiernas, tieneojos);
        this.tienecola=tienecola;
        this.tieneorejas=tieneorejas;
        this.raza=raza;

    }
  // Metodos funcionales 
  public void masticar(){
    System.out.println(super.mostrarNombre()+ "El perro esta  masticando");
  }
  @Override
  public void comer(){
    System.out.println(super.mostrarNombre() + "El perro esta comiendo");
    masticar();
  }
}
