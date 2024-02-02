public class Cd extends DisposAlmacen implements Almacenamiento, Giro{

    public Cd(String nombre, String contenido) {
        super(nombre, contenido, "CD", "Marca CD");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo en CD..");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del CD..");
    }

    @Override
    public void reportarInfo() {
        System.out.println("Nombre del CD: " + nombre + ", Contenido: " + contenido + ", Tipo: " + tipoAlmacenamiento);
    }

    @Override
    public void girar() {
        System.out.println("Girando..");

    }
}
