public class Vinilo extends DisposAlmacen implements Almacenamiento, Giro{

    public Vinilo(String nombre, String contenido) {
        super(nombre, contenido, "Vinilo", "Marca Vinilo");
    }

    @Override
    public void escribirDatos() {
        System.out.println("No se puede escribir");
    }

    @Override
    public void leerDatos() {
        System.out.println("No se puede leer");
    }

    @Override
    public void reportarInfo() {
        System.out.println("Información del Vinilo: " + nombre + ", Contenido: " + contenido + ", Tipo: " + tipoAlmacenamiento + ", Marca: " + getMarca());
    }

    @Override
    public void girar() {
        System.out.println("Vinilo girando...");
    }
}
