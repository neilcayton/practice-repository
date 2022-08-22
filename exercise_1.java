package exercises.practice;

import java.util.Arrays;
import java.util.Scanner;


public class exercise_1 {
    public static void main(String[] args) {


        int [] random_number = {12, 45, 62, 43, 90, 30};
        System.out.println(random_number.length);
        for (int count = 0; count < random_number.length; count++) {
            int checker = (random_number[count] % 2);
            if (checker != 0){
                System.out.println(random_number[count]+" is not an even number");
            }
            else {
                System.out.println(random_number[count]+" is an even number");

            }
        }

        System.out.println(Arrays.toString(random_number));

        Input();
    }

    public static void Input(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your Height here (m): ");
        float height = keyboard.nextFloat();
        System.out.println("Enter your weight here: ");
        float weight = keyboard.nextFloat();
        float [] list_bmi_chart =  {18.5F, 25, 30};
        float BMI = weight/(height*height);
        System.out.println("");
        if ( BMI < 18.5 ){
            System.out.println("Your BMI is:"+ BMI + " you are under-weight");
        } else if (BMI < 25) {
            System.out.println("Your BMI is:"+ BMI + " you are normal");
        }
        else if (BMI > 25){
            System.out.println("Your BMI is:"+ BMI + " you are over-weight");
        }
    }
}
