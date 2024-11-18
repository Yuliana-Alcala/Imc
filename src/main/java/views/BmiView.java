package views;

import java.util.Scanner;

public class BmiView {
    
    private Scanner scanner = new Scanner(System.in);

    public double askWeight(){
        System.out.println("Enter you weight in kilograms: ");    
        return scanner.nextDouble();
    }

    public double askHeight(){
        System.out.println("Enter you height in meters: ");    
        return scanner.nextDouble();
    }

    public void ShowResults(double bmi, String clasificaString){
        System.out.printf("Your BMI is: %.2f\n\n",bmi);
        System.out.println("Your BMI is: "+ clasificaString);
    }

}
