/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Answer;
import model.Calculator;

/**
 *
 * @author Laptop2
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button Buttn7;
    private Calculator calculator;
    @FXML
    private Button Buttn8;
    @FXML
    private Button Buttn9;
    @FXML
    private Button Buttn4;
    @FXML
    private Button Buttn5;
    @FXML
    private Button Buttn6;
    @FXML
    private Button Buttn1;
    @FXML
    private Button Buttn2;
    @FXML
    private Button Buttn3;
    @FXML
    private Button ButtnCountUp;
    @FXML
    private Button ButtnDivide;
    @FXML
    private Button Buttn0;
    @FXML
    private Button ButtnAbstract;
    @FXML
    private Button ButtnMultiply;
    @FXML
    private Button ButtnAnswer;
    @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calculator = new Calculator();
    }    

    @FXML
    private void SevenClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(7);
        label.setText(answer.toString());
        
    }

    @FXML
    private void EightClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(8);
        label.setText(answer.toString());
    }

    @FXML
    private void NinceClicked(ActionEvent event) {
       Answer answer = calculator.setNumber(9);
       label.setText(answer.toString());
    }

    @FXML
    private void FourClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(4);
        label.setText(answer.toString());
    }

    @FXML
    private void FiveClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(5);
        label.setText(answer.toString());
    }

    @FXML
    private void SixClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(6);
        label.setText(answer.toString());
    }

    @FXML
    private void OneClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(1);
        label.setText(answer.toString());
    }

    @FXML
    private void TwoClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(2);
        label.setText(answer.toString());
    }

    @FXML
    private void ThreeClicked(ActionEvent event) {
        Answer answer = calculator.setNumber(3);
        label.setText(answer.toString());
    }
    
    @FXML
    private void ZeroClicked(ActionEvent event) {
       Answer answer = calculator.setNumber(0);
       label.setText(answer.toString());
    }

    @FXML
    private void CountClicked(ActionEvent event) {
       Answer answer = calculator.count();
       label.setText(answer.toString());
    }

    @FXML
    private void DivideClicked(ActionEvent event) {
        Answer answer =calculator.divide();
        label.setText(answer.toString());
    }

    @FXML
    private void AbstractClicked(ActionEvent event) {
        Answer answer =calculator.deduct();
        label.setText(answer.toString());
    }

    @FXML
    private void MultiplyClicked(ActionEvent event) {
        Answer answer =calculator.multiply();
        label.setText(answer.toString());
    }

    @FXML
    private void AnswerClicked(ActionEvent event) {
        Answer answer = calculator.answer();
        label.setText(answer.toString());
    }

  
    
    
}
