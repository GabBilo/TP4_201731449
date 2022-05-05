package org.calma.TP4;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {

    public BorderPane view;
    public Button start;
    public Button orange;
    public Button rouge;
    public Button vert;
    public Button jaune;
    public Button bleu;
    private final Model model = new Model();
    private Integer round = 0;

    public void startGame(ActionEvent actionEvent) {
        start.setDisable(true);
        start.setVisible(false);
        model.setAnswers(this.generateAnswer());
        view.setDisable(false);
    }

    public void clickOrange(ActionEvent actionEvent) {
        System.out.println("Orange appuyer");
        model.verifEssai(orange.getId(),round);
        round++;
    }

    public void clickRouge(ActionEvent actionEvent) {
        System.out.println("Rouge appuyer");
        model.verifEssai(rouge.getId(),round);
        round++;
    }

    public void clickVert(ActionEvent actionEvent) {
        System.out.println("Vert appuyer");
        model.verifEssai(vert.getId(),round);
        round++;
    }

    public void clickJaune(ActionEvent actionEvent) {
        System.out.println("Jaune appuyer");
        model.verifEssai(jaune.getId(),round);
        round++;
    }

    public void clickBleu(ActionEvent actionEvent) {
        System.out.println("Bleu appuyer");
        model.verifEssai(bleu.getId(),round);
        round++;
    }

    public List<String> generateAnswer(){
        List<String> value  = new ArrayList<>();
        value.add("jaune");
        value.add("rouge");
        value.add("bleu");
        value.add("orange");
        value.add("vert");
        List<String> answers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 12; i++){
            String reponse = value.get(random.nextInt(value.size()));
            answers.add(reponse);
        }

        System.out.println(answers);

        return answers;
    }
}
