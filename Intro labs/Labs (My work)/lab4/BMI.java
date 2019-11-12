public class BMI {
    public static void main (String[] args){
    
        double weight_in_pounds;
        double height_in_inches;
        double weight_in_KG;
        double height_in_CM;
        double BMI;
        
        weight_in_KG = ((Math.random()*50)+50);
        height_in_CM = ((Math.random()*100)+90);
        
        weight_in_pounds = weight_in_KG * 2.20462;
        height_in_inches = height_in_CM / 39.3701;
        
        BMI = weight_in_pounds/(height_in_inches*height_in_inches);
        
        System.out.println ("your height is " + height_in_CM);
        System.out.println ("your weight is " + weight_in_pounds);
        System.out.println ("your BMI is " + BMI);
        
    }
}