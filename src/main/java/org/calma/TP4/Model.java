package org.calma.TP4;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<String> answers = new ArrayList<>();

    public Model() {
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Boolean verifEssai(String essai,Integer round){
        String reponse = answers.get(round);

        if (essai.equals(reponse)){
            System.out.println("Bravo");
            return true;
        } else {
            System.out.println("Mauvaise réponse");
            return false;
        }
    }
}
