package Controller;

import Models.BmiModel;
import views.BmiView;

public class BmiController {

    public BmiController(){
        startProgram();
    }


    public static void startProgram(){       
        double weight = BmiView.askWeight();
        double height = BmiView.askHeight();
        getBMI(weight,height);
    }

    public static void getBMI(double weight, double height){
        double bmi = BmiModel.calculateBMI(weight,height);
        String clasification = BmiModel.giveResultsBMI(bmi);
        BmiView.showResults(bmi, clasification);

    }



}