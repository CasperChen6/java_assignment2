package com.example.urllookup.ui;

import com.example.urllookup.service.UrlLookupService;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MainView extends VBox {
    private TextField urlInput;
    private Button lookupButton;
    private UrlLookupService service;

    public MainView(UrlLookupService service) {
        this.service = service;
        setupUI();
    }

    private void setupUI() {
        setSpacing(10);
        setPadding(new Insets(20));

        Label titleLabel = new Label("URL Lookup");
        titleLabel.getStyleClass().add("title-label");

        urlInput = new TextField();
        urlInput.setPromptText("Enter URL (e.g., google.com)");

        lookupButton = new Button("Lookup");
        lookupButton.getStyleClass().add("lookup-button");

        getChildren().addAll(titleLabel, urlInput, lookupButton);
    }

    public TextField getUrlInput() {
        return urlInput;
    }

    public Button getLookupButton() {
        return lookupButton;
    }
}