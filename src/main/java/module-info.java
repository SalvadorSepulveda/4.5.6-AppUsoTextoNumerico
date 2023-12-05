module es.ieslosmontecillos.appusotextonumerico {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_salvadorsepulveda;


    opens es.ieslosmontecillos.appusotextonumerico to javafx.fxml;
    exports es.ieslosmontecillos.appusotextonumerico;
}