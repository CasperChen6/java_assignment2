package com.example.urllookup;

import com.example.urllookup.model.UrlInfo;
import com.example.urllookup.service.UrlLookupService;
import com.example.urllookup.ui.MainView;
import com.example.urllookup.ui.ResultView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private UrlLookupService service;
    private Stage primaryStage;
    private Scene mainScene;
    private Scene resultScene;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.service = new UrlLookupService();

        setupMainScene();

        primaryStage.setTitle("URL Lookup App");
        primaryStage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("/images/icon.png")));
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    private void setupMainScene() {
        MainView mainView = new MainView(service);
        mainScene = new Scene(mainView, 600, 600);
        mainScene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

        mainView.getLookupButton().setOnAction(e -> {
            String url = mainView.getUrlInput().getText();
            lookupUrl(url);
        });
    }

    private void lookupUrl(String url) {
        try {
            UrlInfo urlInfo = service.lookupUrl(url);
            showResultScene(urlInfo);
        } catch (Exception e) {
            e.printStackTrace();
            // Show error dialog
        }
    }

    private void showResultScene(UrlInfo urlInfo) {
        ResultView resultView = new ResultView(urlInfo);
        resultScene = new Scene(resultView, 600, 600);
        resultScene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

        resultView.getBackButton().setOnAction(e -> primaryStage.setScene(mainScene));

        primaryStage.setScene(resultScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}