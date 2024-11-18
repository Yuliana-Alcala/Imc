package Models;

public class BmiModel {

    //private static PersonModel person;

   
    public static double calculateBMI(double  weight, double height){
        //double weight = person.getWeight();
       // double height = person.getHeight();

       double bmi = weight / (Math.pow(height,2));   
       System.out.println(bmi);
       return bmi;

    }

    public static String giveResultsBMI(double bmi){
        if (bmi < 16){
            return "Severe thinness";
        }else if(bmi < 17){
            return "Moderate thinness";

        }else if(bmi < 18.5){
            return "Mild thinness";

        }else if(bmi < 25){
            return "Normal weight";

        }else if(bmi < 30){
            return "Overweight";

        }else if(bmi < 35){
            return "Mild obesity";

        }else if(bmi < 40){
            return "Moderate obesity";

        }else{
            return "Morbid obesity";

        }

    }

}
