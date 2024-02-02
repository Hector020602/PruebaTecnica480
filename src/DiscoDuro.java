public class DiscoDuro extends DisposAlmacen implements Almacenamiento, Giro{
    public DiscoDuro(String nombre, String contenido) {
        super(nombre, contenido, "Disco Duro", "Marca Disco");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo en DiscoDuro..");

    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo DiscoDuro..");

    }

    @Override
    public void reportarInfo() {
        System.out.println("Info del Disco Duro: " + nombre + ", Contenido: " + contenido + ", Tipo: " + tipoAlmacenamiento);

    }

    @Override
    public void girar() {
        System.out.println("Girando..");

    }
}
