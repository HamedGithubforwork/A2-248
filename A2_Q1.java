import java.util.Scanner; //imports the scanner class

public class A2_Q1 {

    public static void main(String[] args) {

        // Assignment {2}

        // Written by: { Hamed Vasheghani farahani 40246686}

        // For COMP 248 Section {COMP 248 R 2232} – Fall 2023

        // --------------------------------------------------------

        // Algorithm BMI calculator

        // this program is designed to calculate someones bmi and give them health advice if they do so.

        // it does this by asking for their weight and height. which it will use to calculate their bmi with

        //based on this bmi it will mark them as being on a specific category of bmi

        // if they want a response and respond with y , Y or yes they will get advice baseds on the category they are in

        System.out.println("-------****-------****-------****-------****-----****-----"); // start of the welcoming message

        System.out.println("Welcome to BMI Calculator");                                 // middle of the Welcoming message

        System.out.println("-------****-------****-------****-------****-----****-----\n"); // end of the welcoming message

        Scanner scan = new Scanner(System.in); //creation of a scanner object that records keyboard input

        boolean overWeight,underWeight,normalWeight,obesity; //boolean values to mark which category the user will be in

        // categories will be seen as false initially till otherwise

        overWeight=false;  //sets overweight to false

        underWeight=false; //sets underweight to false

        normalWeight=false; // sets normal weigh to false

        obesity=false; // sets obesity to false

        System.out.println("Enter weight (in kilograms): "); //prints instruction for user to enter weight in kg

        double weight= scan.nextDouble(); //records input for weight

        System.out.println("Enter height (in meters): "); //prints instruction for user to enter height in m

        double height= scan.nextDouble(); // records input for height

        double bmi= weight/(height*height); //calculates bmi **** remark that since its floating point calculation, it causes precision error

        System.out.format("BMI: %.2f\n",bmi); //prints the bmi  to 2nd decimal place

        // the following are if statements based on BMI

        // since there is a floating point calculations, there might be precision point errors at <= or >=  points

        if (bmi<18.5){                           //if statement for those under bmi 18.5

            System.out.println("Category: Underweight");  // prints out category underweight

            underWeight=true; //sets this category to be true (used for the tips if statement)

        }

        else if(bmi<=24.9&& bmi>=18.5 ){     // if statement for those between 18.5 and 24.9 bmi.

            System.out.println("Category: Normal weight");   // prints out category normal weight

            normalWeight=true; //sets this category to be true (used for the tips if statement)
        }

        else if (bmi<=29.9 && bmi>=25){  // if statement for those between 25 and 29.9 bmi.

            System.out.println("Category: Overweight "); //prints out category overweight

            overWeight=true; //sets this category to be true (used for the tips if statement)

        }

        else if (bmi>=30){ // if statement for those greater than or equal to bmi 30.  // checks if bmi greater than or equal to 30

            System.out.println("Category: Obesity "); // prints out category obesity

            obesity=true; //sets this category to be true (used for the tips if statement)

        }

        System.out.print("do you want some tips according to your BMI?"); //prints text asking for a reponse to wanting tips or not

        String response = scan.next(); // scanner to record response

        if (response.equalsIgnoreCase("y")|| response.equals("yes")){  // if response is y ignoring cases or yes then starts

            if (overWeight){ // if the user is overWeight

                System.out.println("Please watch out what you eat and do more excises!");// prints instructions for specific BMI

            }

            else if(obesity){ //if the user is obese

                System.out.println("Please contact our experts for professional help.”");// prints instructions for specific BMI

            }

            else if(underWeight){ // if the user is underweight

                System.out.println("Please eat well and do more excises.");// prints instructions for specific BMI

            }
            else if(normalWeight){ // if the user is normal weight

                System.out.println("Congratulations, you are doing fairly well. Keep on going."); // prints instructions for specific BMI

            }



        }

        else { // if they respond with anything else

            System.out.println("Nice to meet you too. Bye!");  // this text would print

        }

        System.out.println("thank you for using the body mass index calculator!"); //ending message thanking user for using program

        scan.close(); // close scanner object

    }
}