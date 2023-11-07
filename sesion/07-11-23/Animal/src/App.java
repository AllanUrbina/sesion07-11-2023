public class App  {
    public static void main(String[] args) throws Exception {
      Animal animal = new Animal("Dragon de komofo", 400, true, true);
      Perro yupi=new Perro("Yupi", 23.00, true, true, true, true,"Chow chow");
      animal.comer();
      yupi.comer();
      
    }
}
