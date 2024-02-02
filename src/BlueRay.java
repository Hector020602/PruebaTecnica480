public class BlueRay extends DisposAlmacen implements Almacenamiento, Giro {

    public BlueRay(String nombre, String contenido) {
        super(nombre, contenido, "BlueRay", "Marca BlueRay");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo en BlueRay..");

    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo del BlueRay..");

    }

    @Override
    public void reportarInfo() {
        System.out.println("Información del BluRay: " + nombre + ", Contenido: " + contenido + ", Tipo: " + tipoAlmacenamiento + ", Marca: " + getMarca());

    }

    @Override
    public void girar() {
        System.out.println("BluRay girando...");

    }
}
