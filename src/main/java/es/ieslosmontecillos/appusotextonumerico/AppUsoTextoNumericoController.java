package es.ieslosmontecillos.appusotextonumerico;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import es.ieslosmontecillos.componentes_sepulvedasalvador.CampoTextoNumerico;

public class AppUsoTextoNumericoController {
    @FXML
    private Label label;
    @FXML
    private CampoTextoNumerico num;

    @FXML
    protected void onButtonClicked() {
        label.setText("Has introducido el valor: $" + num.getText());
    }
}