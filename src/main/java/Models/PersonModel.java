package Models;

public class PersonModel {

    public double weight;
    public double height;


    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public PersonModel(double weight, double height){
        this.weight = weight;
        this.height = height; 
    }
    


}
