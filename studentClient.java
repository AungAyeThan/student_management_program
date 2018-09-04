
/*
Author : Aung Aye Than 
*/

package Assignment2.SecondTime;

import java.util.Scanner;

public class StudentClient {

    public static void main(String[] args) {
        Student program = new Student();
        Student program2 = new Student();
        Scanner keyboard = new Scanner(System.in);
        Student[] classmate;

        

        System.out.println("Please enter number of students you would like to enter:"); // print msg to ask user to input number of student they want to process
        int number = keyboard.nextInt();// input the number of student from keyboard
        classmate = new Student[number];// store the amount of student into student array 

        //menu option 
        System.out.println("Menu option for the Student");// prompt the message to ask user
        System.out.println("Please Select one below to process");
        System.out.println("1. Quit");
        System.out.println("2. Add another details for " + classmate.length + " students");
        System.out.println("3. Display information of student and print out details");
        System.out.println("4. Display Average of the student marks");
        System.out.println("5. Check how many student are more than average and less than average");
        System.out.println("6. Display Grades awarded");
        System.out.println("7. Search by ID");
        System.out.println("8. Search by Name");
        System.out.println("9. Display two students who highest marks in the class ");
        System.out.println("10. sorting array with ID");
        System.out.println("11. sorting array with Name");

        //Display information of student and print out details
        System.out.print("Input option : ");
        int userInput = keyboard.nextInt();//Input the menu option number
        System.out.println();

        boolean check = false; // initialise the check as false
        while (check != true) // loop until the check becomes true
        {
            if (userInput == 2) // condition to check 
            {
                check = true; // return true
                userInput = 2;
            } else {
                check = false; // return false
                System.out.println("Sorry: There is no data to process this option");//message
                System.out.print("Please enter Input option 2 to add data : ");// message
                userInput = keyboard.nextInt();//Input the menu option number
            }
        }
        while (userInput != 1) // proceed until userInput is 1
        {
            if (userInput == 2) {
                inputAllStudentDetail(classmate);//invoking the method to input the student detail
            } else if (userInput == 3) {
                DisplayDetail(classmate);// call the method to display all detail about student in array
            } else if (userInput == 4) {
                AverageOverallmark(classmate);// call the method to display average of all student overall marks 
            } else if (userInput == 5) {
                CompareAvgWithOverallMarks(classmate, classmate);// call the method to check how many student get more than average marks.
            } else if (userInput == 6) {
                DisplayGrade(classmate);// call the method to display grades
            } else if (userInput == 7) {
                SearchByID(classmate);// call the method to search the student id 
            } else if (userInput == 8) {
                SearchByName(classmate);// call the method to search the name 
            } else if (userInput == 9) {
                TwoHighestOverallMarks(classmate);// call the method to display two highest overall marks in all students' marks
            } else if (userInput == 10) {
                sortingByID(classmate);// call the method to sort by ID in ascending order
            } else if (userInput == 11) {
                SortingByName(classmate);// call the method to sort by name
            } else {
                System.out.println("Error:Invalid code");// error message if the input doesn't match 
            }
            System.out.println();
            System.out.println("Enter the another menu option below and press 1 to quit ");
            System.out.print("Input option :");
            userInput = keyboard.nextInt();// get the another input option number
            System.out.println();
        }
    }

    public static void inputAllStudentDetail(Student[] classmate) // method to calculate the student marks
    {
        System.out.println("Please enter " + classmate.length + " students' details.");
        for (int i = 0; i < classmate.length; i++)// loop to receive data from keyboard through every student input  
        {
            classmate[i] = new Student();// create the array of Student class
            classmate[i].setInputData();// call the setInputData() from the student class
            System.out.println();// line break
        }
    }

    public static void DisplayDetail(Student[] classmate)// method to display all the student detail including grade
    {
        System.out.println("Option No 3: Display student detail");
        for (int i = 0; i < classmate.length; i++)// loop to check the length of the array and proceed 
        {
            classmate[i].outputdetail();// call the outputdetail() method to print out all detail
            classmate[i].grade();// print out all the grade from the grade[] array.
            System.out.println();
        }
    }

    public static void AverageOverallmark(Student[] classmate)// method to check average overall mark
    {
        double sum = 0;
        for (int i = 0; i < classmate.length; i++)// loop to check the length of the array and proceed 
        {
            sum = sum + classmate[i].Overall();// sum up all the student overall marks
        }
        double average = (double) sum / classmate.length;// calculate average
        System.out.println("Average for all students are:" + average);// print out the average 
    }

    public static void SearchByID(Student[] classmate)// method to search the ID 
    {
        System.out.println("Option No 7: Search by ID");//print message about the option number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Student ID that you would like to find about");
        Long ID = keyboard.nextLong();//  ID to store the input
        long number = 0;// declare and initialising the number to get the value
        String name = "";// declare and initialising the name to get the value
        double firstAssignMark = 0;// declare and initialising the first assign mark to get the value
        double secondAssignMark = 0;// declare and initialising the second assign mark to get the value
        double PraticalMark = 0;// declare and initialising the pratical mark to get the value
        double finalMark = 0;// declare and initialising the final mark to get the value
        String Birthday = "";// declare and initialising the birthday
        boolean search = false;// declare the result as boolean 
        for (int i = 0; i < classmate.length; i++)// loop to proceed all the value in the array
        {
            if (ID == classmate[i].getStd_ID().longValue())// checking condition if the search ID is same with the student ID in the array
            {
                search = true;// return ture if the value found
                name = classmate[i].getName();// assigning the name of this student ID
                Birthday = classmate[i].getBirthday();// assigning the birthday
                number = classmate[i].getStd_ID();// assigning number
                firstAssignMark = classmate[i].getFirstAssignmentMark();// assigning the value into firstAssignMark variable
                secondAssignMark = classmate[i].getSecondAssignmentMark();// assigning the value into secondAssignMark variable 
                PraticalMark = classmate[i].getPraticalMark();// assigning the value into PraticalMark variable
                finalMark = classmate[i].getFinalMark();// assigning the value into finalMark variable
                break;// break the loop if unit found
            } else {
                search = false;// return false if the value is not found
            }
        }
        if (search == true)// print out all the value if the result return true
        {
            System.out.println("Name:" + name);
            System.out.println("Birthday:" + Birthday);
            System.out.println("Student ID:" + number);
            System.out.println("First Assignment Mark:" + firstAssignMark);
            System.out.println("Second Assignment Mark:" + secondAssignMark);
            System.out.println("Pratical Mark:" + PraticalMark);
            System.out.println("Final Mark:" + finalMark);
        } else {
            System.out.println("Sorry: there is no data about the student ID that you are searching");// print the error message
        }
    }

    public static void SearchByName(Student[] classmate) // method to search by name
    {
        System.out.println("Option No 8: Search by Name");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Student Name that you would like to find about :");
        String names = keyboard.nextLine();
        String name = "";
        long number = 0;
        double firstAssignMark = 0;// declare and initialising the firstAssignMark to get the value
        double secondAssignMark = 0;// declare and initialising the secondAssignMark to get the value
        double PraticalMark = 0;// declare and initialising the PraticalMark to get the value
        double finalMark = 0;// declare and initialising the finalMark to get the value
        String Birthday = "";// declare and initialising the Birthday to get the value
        boolean result = false;// declare and initialising the result as false 
        for (int i = 0; i < classmate.length; i++) {
            if (names.equalsIgnoreCase(classmate[i].getName())) // check the input name equal with the student name in the array
            {
                result = true;// return true if the search found
                name = classmate[i].getName();// assigning the name of this array
                Birthday = classmate[i].getBirthday();// assigning the Birthday of this array
                number = classmate[i].getStd_ID();// assigning the number of this array
                firstAssignMark = classmate[i].getFirstAssignmentMark();// assigning the firstAssignMark from this array
                secondAssignMark = classmate[i].getSecondAssignmentMark();// assigning the secondAssignMark from this array
                PraticalMark = classmate[i].getPraticalMark();// assigning the PraticalMark from this array
                finalMark = classmate[i].getFinalMark();// assigning the finalMark from this array
                break;
            } else {
                result = false; // return false if there search is not found
            }
        }
        if (result == true)// print all the detail of the array if the result returns true
        {
            System.out.println("Name:" + name);
            System.out.println("Birthday:" + Birthday);
            System.out.println("Student ID:" + number);
            System.out.println("First Assignment Mark:" + firstAssignMark);
            System.out.println("Second Assignment Mark:" + secondAssignMark);
            System.out.println("Pratical Mark:" + PraticalMark);
            System.out.println("Final Mark:" + finalMark);
        } else {
            System.out.println("Sorry: there is no data about the student Name that you are searching");// print error message    
        }
    }

    private static double Average(Student[] classmate) // private method to check average overall mark
    {
        double sum = 0;
        for (int i = 0; i < classmate.length; i++)// loop to check the length of the array and proceed 
        {
            sum = sum + classmate[i].Overall();// sum up all the student overall marks
        }
        double average = Math.round((double) sum / classmate.length);// calculate average
        return average;
    }

    public static void CompareAvgWithOverallMarks(Student[] classmate, Student[] marks)// a method to calculate how many student's mark are more than average marks
    {
        System.out.println("option 5: checking how many student got more than average mark and how many student got less than average");
        double avg = Average(marks); // call the  private Average() method
        int overcount = 0;// set the overcount as 0
        int undercount = 0;// set the undercount as 0
        for (int i = 0; i < classmate.length; i++)// loop to proceed through every data
        {
            if (classmate[i].Overall() >= avg) {
                overcount++;// incrementation of overcount by 1 if marks in greater than average
            } else {
                undercount++;// incrementation of undercount by 1 if the marks is greater than average
            }
        }
        System.out.println("Numbers of student who are more than average is:" + overcount);//print the result        
        System.out.println("Numbers of student who are less than average is:" + undercount);//print the result        
    }

    public static void DisplayGrade(Student[] classmate)// method to display grade only
    {
        System.out.println("option 6: Grades awarded"); // display message 
        System.out.println("Distribution of grades for " + classmate.length + " students are");
        for (int i = 0; i < classmate.length; i++) {
            classmate[i].grade();// print out all the grade in the array
        }
    }

    public static void TwoHighestOverallMarks(Student[] classmate)// method to find out two highest overall marks from all the student
    {
        System.out.println("Option No 9: Display two highest overall marks");
        double highest = Integer.MIN_VALUE;// declare the variable to check the highest value.
        double secondHighest = Integer.MIN_VALUE;//declare the variable to check the second highest value
        String Firstname = "";//variable to store student name who score highest  
        String Secondname = "";//variable to store student name who score second highest  

        for (int i = 0; i < classmate.length; i++) {
            if (classmate[i].Overall() > highest) // if the overall marks is higher than the highest marks
            {
                secondHighest = highest;// assign the secondHighest with the highest value;
                highest = classmate[i].Overall(); // getting the highest marks in all students
                Firstname = classmate[i].getName(); // getthing the student name who score the highest name 
            } else if (classmate[i].Overall() > secondHighest) // or else the overall marks is higher than secondHighest mark
            {
                secondHighest = classmate[i].Overall(); // assign the marks into the secondHighest
                Secondname = classmate[i].getName(); //assign the name of person who got the second highest socre into the second name
            }
        }
        System.out.println("Name of the student who got the highest overall mark is = " + Firstname); //print message 
        System.out.println("Highest Marks = " + highest); //print message 
        System.out.println("Name of the student who got the Second highest overall mark is = " + Secondname); // print message
        System.out.println("Second highest Marks = " + secondHighest); // print message
    }

    public static void sortingByID(Student[] classmate) // method to sorting the ID by selection sort
    {
        System.out.println("Option No 10: sorting ID");  // message display
        Student number; // variable to store number 
        int LargestNumber; // variable to get store the largest number 
        for (int lowestNumber = classmate.length - 1; lowestNumber > 0; lowestNumber--) // for loop 
        {
            LargestNumber = 0;// take the largest number as 0
            for (int i = 1; i <= lowestNumber; i++) {
                if (classmate[i].getStd_ID() > classmate[LargestNumber].getStd_ID()) // sorting smallest to largest number
                {
                    LargestNumber = i; // assign the new number

                }
                number = classmate[lowestNumber]; //assign the lowest number into number variable
                classmate[lowestNumber] = classmate[LargestNumber]; // swap the lowest number with the highest number 
                classmate[LargestNumber] = number; // save the new largest number with the number variable
            }// end if
        }//end for 
        System.out.println("Sorting the Student ID into ascending order");
        for (int i = 0; i < classmate.length; i++) // loop to display the message 
        {
            System.out.println(classmate[i].getStd_ID());  // print out the numbers 
        }//end for
    }// end method

    public static void SortingByName(Student[] classmate) // method to sort the name with the bubble sort
    {
        System.out.println("Option No 11: Sorting Name with alphabatical order"); // display message 
        Student name; // variable to store the name 
        for (int i = 0; i < classmate.length; i++) //for loop to go through until i is greater the length
        {
            for (int j = 0; j < classmate.length - 1; j++) // loop to check 
            {
                if (classmate[j].getLastName().compareToIgnoreCase(classmate[j + 1].getLastName()) > 0) // sorting with the alphabatical order
                {
                    name = classmate[j];
                    classmate[j] = classmate[j + 1]; // swaping the names
                    classmate[j + 1] = name;
                }
            }
        }//end for 
        System.out.println("Sorting the Student Name into ascending order");
        for (int i = 0; i < classmate.length; i++) {
            System.out.println(classmate[i].getName());
        }//end for 
    } // end method

}


