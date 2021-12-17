package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo;
import vista.Editar;

public class Controlador implements ActionListener {

// Aqui vamos a juntar las clases
    private Editar edit;
    private Modelo model;

    public Controlador(Editar edit) {

        this.edit = edit;
        //this.model = model;
        model = new Modelo();
        this.edit.Ingresar_valor.addActionListener(this);

    }
    


    public void actionPerformed(ActionEvent e) {

        try {
            model.blockSite(edit.Ruta_URL.getText());
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
