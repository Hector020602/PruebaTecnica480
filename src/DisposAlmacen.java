//Clase comun para CD y Disco Duro
public class DisposAlmacen {
    protected String nombre;
    protected String contenido;
    protected String tipoAlmacenamiento;

    protected final String Marca;

    public DisposAlmacen(String nombre, String contenido, String tipoDisco, String marca) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipoAlmacenamiento = tipoDisco;
        this.Marca = marca;
    }

    public String getMarca() {
        return Marca;
    }
}
