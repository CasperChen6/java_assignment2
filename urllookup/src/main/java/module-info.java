module com.example.urllookup {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires com.google.gson;
    opens com.example.urllookup.model to com.google.gson;
    requires java.net.http;
    requires java.sql;

    opens com.example.urllookup to javafx.fxml;
    exports com.example.urllookup;
    exports com.example.urllookup.model;
}