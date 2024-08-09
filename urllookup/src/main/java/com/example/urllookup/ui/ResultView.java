package com.example.urllookup.ui;

import com.example.urllookup.model.UrlInfo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ResultView extends VBox {
    private Button backButton;

    public ResultView(UrlInfo urlInfo) {
        setupUI(urlInfo);
    }

    private void setupUI(UrlInfo urlInfo) {
        setSpacing(10);
        setPadding(new Insets(20));

        Label titleLabel = new Label("URL Information");
        titleLabel.getStyleClass().add("title-label");

        VBox infoBox = createInfoBox(urlInfo);

        backButton = new Button("Back");
        backButton.getStyleClass().add("back-button");

        getChildren().addAll(titleLabel, infoBox, backButton);
    }

    private VBox createInfoBox(UrlInfo urlInfo) {
        VBox infoBox = new VBox(10);
        infoBox.getStyleClass().add("info-box");

        infoBox.getChildren().addAll(
                new Label("URL: " + urlInfo.getUrl()),
                new Label("Valid: " + urlInfo.isValid()),
                new Label("Country: " + urlInfo.getCountry()),
                new Label("City: " + urlInfo.getCity()),
                new Label("ISP: " + urlInfo.getIsp()),
                new Label("Timezone: " + urlInfo.getTimezone())
        );
        return infoBox;
    }

    public Button getBackButton() {
        return backButton;
    }
}