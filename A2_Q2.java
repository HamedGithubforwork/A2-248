import java.util.Scanner; //brings the scanner class

public class A2_Q2 {

    public static void main(String[] args) {

        // Assignment {2}

        // Written by: { Hamed Vasheghani farahani 40246686}

        // For COMP 248 Section {COMP 248 R 2232} – Fall 2023

        // --------------------------------------------------------

        // Algorithm grade calculator

        //this program is intended to calculate the person's grade based on their score

        // if they input the wrong code it twice it will fail

        // however if they input a correct value once they will get a correct value back

        System.out.println("-------****-------****-------****-------****-----****-----"); // begining of welcome statement

        System.out.println("Welcome to Grade Calculator"); //middle of welcome statement

        System.out.println("-------****-------****-------****-------****-----****-----\n"); // end of welcome statement

        System.out.println("Enter the student's score (out of 100):"); //asks user to enter score out of 100

        Scanner scan= new Scanner(System.in); // brings in a scanner object

        double score; // will store the recorded score input

        int scoreBracket; // the value that will be used for the switch

        char grade; // the grade someone gets based on their score bracket

        score= scan.nextDouble(); //records score input

        if (score<0) { // if score is not a valid value

            System.out.println("The score has to be zero or above. Please try again."); //prints out stating value is invalid

            score = scan.nextDouble(); //records input again

        }

        else if (score>100) { // if score is not a valid value

            System.out.println("The score has to be below 100. Please try again."); //prints statement

            score = scan.nextDouble(); //records input again

        }


        if (score<0 || score>100){ // if score is invalid again prints fail statement

            System.out.println("It is still an invalid input. Bye!"); // prints fail statement

            System.exit(-1); // sets exit code to -1

        }



        scoreBracket = (int) (score / 10); // the grade brackets can be seen as the 2nd digit determining the bracket. ex all 70s are the value 7 is of importance and rest can be discarded

        switch (scoreBracket) { // switch where  grades 100-90 are A, 89-80 are B 79-70 are C 69-60 are D and rest are F

            case 10: // any grades between 100-90 will be A

            case 9:

                grade = 'A';

                break;

            case 8:

                grade = 'B'; // any grade between 89 and 80 is B

                break;

            case 7: // any grade between 70 and 79 is C

                grade = 'C';

                break;

            case 6: // any grade between 69 and 60 is  D

                grade = 'D';

                break;

            default: // any grade under 60 will be F

                grade = 'F';
        }

        System.out.println("The student's grade is: " + grade); //prints their grade

        System.out.println("Thank you for using the grade calculator"); // ending statement indicating program is finished

        scan.close(); //close the scanner object
    }

}