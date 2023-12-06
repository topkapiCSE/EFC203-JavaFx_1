package com.example.fc_10_1;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;

public class MyButon extends Button implements EventHandler{

    private int row;
    private int col;
    private boolean isClicked;

    MyButon(int row,int col){
        this.row = row;
        this.col = col;
        this.isClicked = false;
        setMaxWidth(1000);
        setMaxHeight(1000);
        setText("  ");
        setOnAction(this);
    }

    @Override
    public void handle(Event event) {
        if(isClicked){
            return;
        }
        isClicked = true;
        setText("X");
        setDisable(true);
    }

}
