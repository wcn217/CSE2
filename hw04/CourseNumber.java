import java.util.Scanner;
//By Will Nagle
//This program uses scanner
//This program allows you to type in a course number and the checker, checks for validity.
public class CourseNumber{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declare scanner
        System.out.print("Enter a six digit number giving the course semester- ");//checks for user input of 6 digit number
        int courseNumber;
        if(myScanner.hasNextInt()){//checks if int
            courseNumber = myScanner.nextInt();//input
            if(courseNumber<186510||courseNumber>201440){//checks for the range
                System.out.println("This is not a valid course in the range [186510-201440]");
            }
            else{//continues if in range
            int semCheck = courseNumber%100;
            String courseSem;
            if(semCheck==10){//puts the appropriate month in a string stored to be printed at end
                courseSem = "Spring";
            }
            else if(semCheck==20){
                courseSem = "Summer 1";
            }
            else if(semCheck==30){
                courseSem = "Summer 2";
            }
            else if(semCheck==40){
                courseSem = "Fall";
            }
            else{
                System.out.println("This is not a valid course in semester "+semCheck);//prints the value of an invalid semester choice
                courseSem = "0";//changes to zero for a check to try again and close program
            }
            if (courseSem=="0")//check to close
            {
                System.out.println("Try Again!");
                return;
            }
            else{//finds the year based on subtracting the last 2 digits and then bringing the course number down 2 decimal points.
                courseNumber = courseNumber-semCheck;
                courseNumber = courseNumber/100;
                System.out.println("The course was offered in "+courseSem+" semester of "+courseNumber);;//final output
            }}
            
        
        }
        else{
            System.out.println("Not a valid int.");//checks if an Int
        }
        }
    }
