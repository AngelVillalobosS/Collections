import collections.DatosPersonales;
import collections.ListaDatos;

public class Main {
    public static void main(String[] args) {
        ListaDatos milista = new ListaDatos();

        DatosPersonales obj1 = new DatosPersonales("Miguel", "Flores");
        milista.add(obj1);
        milista.add(new DatosPersonales("Angel", "Villalobos"));
        milista.add(new DatosPersonales("Gerardo", "Saucedo"));
        milista.add(new DatosPersonales("Mireya", "Castro"));
        milista.add(new DatosPersonales("Alberto", "Sosa"));

        milista.buscar("Mireya");
    }
}
