package com.example.clientapp.view;

import com.example.clientapp.model.DataModel;
import com.example.clientapp.viewmodel.MainViewModel;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainView {
    private VBox view;
    private Label lblMessage;
    private Label lblTimestamp;

    public MainView() {
        lblMessage = new Label("Click to fetch data");
        lblTimestamp = new Label("");

        Button btnFetch = new Button("Get Data");
        btnFetch.setOnAction(e -> {
            MainViewModel viewModel = new MainViewModel();
            DataModel data = viewModel.fetchData();
            if (data != null) {
                lblMessage.setText(data.getMessage());
                lblTimestamp.setText("Timestamp: " + data.getTimestamp());
            }
        });

        view = new VBox(10, lblMessage, lblTimestamp, btnFetch);
        view.setAlignment(Pos.CENTER);
    }

    public VBox getView() {
        return view;
    }
}
