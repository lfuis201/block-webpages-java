
package proyecto_final;

import controlador.Controlador;
import modelo.Modelo;
import vista.Editar;
import vista.Login;
import vista.Principal;

public class Proyecto_Final {

    public static void main(String[] args) {

        //Modelo modelo = new Modelo();
        Editar edit = new Editar();
        Principal   primero = new Principal();
        Login login = new Login();
        
        //Controlador n = new Controlador(edit, modelo);
        login.setVisible(true);

        
    }
    
}
