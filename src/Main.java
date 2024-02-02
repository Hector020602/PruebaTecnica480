public class Main {
    public static void main(String[] args) {

        Cd cd = new Cd("CD1", "Contenido del CD");
        DiscoDuro discoDuro = new DiscoDuro("DISK1", "Contenido del DISK");
        Vinilo vinilo = new Vinilo("Vinilo1", "Contenido del Vinilo");
        BlueRay blueRay = new BlueRay("BlueRay1", "Contenido del BlueRay");

        System.out.println("Funciones del CD:");
        cd.girar();
        cd.escribirDatos();
        cd.leerDatos();
        cd.reportarInfo();

        System.out.println("\nFunciones del Disco Duro:");
        discoDuro.girar();
        discoDuro.escribirDatos();
        discoDuro.leerDatos();
        discoDuro.reportarInfo();

        System.out.println("\nFunciones del Vinilo:");
        vinilo.girar();
        vinilo.escribirDatos();
        vinilo.leerDatos();
        vinilo.reportarInfo();

        System.out.println("\nFunciones del BlueRay");
        blueRay.girar();
        blueRay.escribirDatos();
        blueRay.leerDatos();
        blueRay.reportarInfo();
    }
}