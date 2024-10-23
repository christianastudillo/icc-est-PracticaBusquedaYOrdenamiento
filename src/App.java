import javax.naming.directory.SearchControls;
import controllers.Controller;
import controllers.SortingMethods;
import views.View;
public class App {
    public static void main(String[] args) throws Exception {
        //CREAR LA VISTA
        View vista = new View();  
        //CREAR LAS CLASES CON LOS METODOS DE ORDENAMIENTO Y BUSQUEDA
        SortingMethods sortingMethods = new SortingMethods();
        SearchControls searchControls = new SearchControls();
        //CREAR EL CONTROLADOR
        Controller controller = new Controller(vista, sortingMethods, null);
        //
        controller.start();
    }
}
