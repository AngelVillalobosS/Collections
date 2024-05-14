package collections;
import java.util.List;
import java.util.ArrayList;
public class ListaDatos {
    List<DatosPersonales> lista = new ArrayList<>();

    public  void add(DatosPersonales obj){
        lista.add(obj);
    }
    public void show(){
        for (DatosPersonales valor : lista)

            System.out.println(valor);
    }
    public void show2(){
        lista.forEach(valor -> System.out.println(valor));
    }

    public void buscar(String nombre){
        lista.forEach(valor -> {
            if (valor.getNombre().equals(nombre))
                System.out.println(valor.toString().toUpperCase());
        });
    }
}
