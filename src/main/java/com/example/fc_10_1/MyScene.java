package com.example.fc_10_1;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

public class MyScene extends VBox {

    private HBox []row = new HBox[3];
    MyScene(){
        for (int i=0;i<3;i++){
            row[i] = new HBox();
            row[i].setSpacing(5);
        }
        setBackground(Background.fill(Paint.valueOf("yellow")));
        setSpacing(5);
        VBox.setVgrow(row[0],Priority.ALWAYS);
        VBox.setVgrow(row[1],Priority.ALWAYS);
        VBox.setVgrow(row[2],Priority.ALWAYS);
        getChildren().addAll(row);
        setPadding(new Insets(10));
    }
    public void add(int rowIndex, Node node){
        HBox.setHgrow(node, Priority.ALWAYS);
        row[rowIndex].getChildren().add(node);
    }
}
