

import java.util.Scanner;

public class Student {
    private String title;                    //String variable declared as private to store title value
    private String FirstName;                // String variable declared as private to store First name value
    private String LastName;                 // String variable declared as private to store last name value
    private long StudentID;                  // long variable declared as private to store student ID value
    private int date;                        //int variable declared as private to store date value
    private int month;                       //int variable declared as private to store month value
    private int year;                        //int variable declared as private to store year value
    private double F_AssignMark;                //int variable declared as private to store first assignment mark
    private double S_AssignMark;                //int variable declared as private to store second assignment mark
    private double praticalMark;                //int variable declared as private to store pratical mark
    private double FinalExamMark;               //int variable declared as private to store final exam mark
    
    public Student() //default constructor
    {
        
    }
    
    
    public Student (String title,String F_Name,String LName, long ID, int dd, int mm, int yy,int FirstAssign, int SAssign, int Pratical, int finalMark)
    {
        this.title = title;
        this.FirstName = F_Name;
        this.LastName = LName;
        this.StudentID = ID;
        this.F_AssignMark = FirstAssign;
        this.S_AssignMark = SAssign;
        this.praticalMark = Pratical;
        this.FinalExamMark = finalMark;
    }
     
    
    public void setInputData()// method to input data from the keyboard
    {
        System.out.print("Enter title : ");// Message to ask user for input
        setTitle(title);// invoking setTitle method to check condition for title input
        System.out.print("First name : ");// Display Message to ask user for input
        setFirstName(FirstName);// invoking setTitle to check condition for first name input
        System.out.print("Last name : ");// Message to ask user for input
        setLastName (LastName);// invoking setLastName method to check condition for last name input
        System.out.print("Student ID : ");// Message to ask user for input
        setID (StudentID);  // invoking setID method to check condition for title input
        System.out.println("Birthday in date/month/year : ");// Message to ask user for input
        setBirthday(date,month,year);// invoking the setBirthday to check condition for date,month and year
        System.out.print("Enter the first assignment mark : ");// Message to ask user for input
        setFirstAssignMark(F_AssignMark);// invoking the setFirstAssignMark to check condition for first assignment mark
        System.out.print("Enter the second assignment mark : ");// Message to ask user for input
        setSecondAssignMark(S_AssignMark);//invoking the setSecondAssignMark to check condition for the second assignment mark
        System.out.print("Enter the pratical mark : ");// Message to ask user for input
        setPratical(praticalMark);// invoking the setPractical to check condition for the pratical mark
        System.out.print("Enter the final exam mark : ");// Message to ask user for input
        setFinal(FinalExamMark);//invoking the setFinal to check condition for the final mark
    }
    
    
    public void setTitle (String nametitle)// set method to get the title
    {
        Scanner keyboard = new Scanner (System.in);   
        nametitle = keyboard.nextLine();// get the input from keyboard
        boolean check=false;// initialise the check as false
        while(check!=true)// condition loop to stop when check is true
        {
            if(nametitle.equalsIgnoreCase("Mrs" )||nametitle.equalsIgnoreCase("Ms") || nametitle.equalsIgnoreCase("Miss")|| nametitle.equalsIgnoreCase("Mr")) // process only if the title is equal with one of them 
            {
                check = true; // return true when the condition is correct
                this.title = nametitle;// assign the title
            }
            else
            {
                check = false; // return false when the condition is false
                System.out.print("Invalid title: please enter title again :"); // message output
                nametitle = keyboard.nextLine();// get another title again
                this.title = nametitle;//assign the new value if the condition is correct
            }
        }
    }
    
    
    public void setFirstName (String F_Name)// set method to get the first name
    {
        Scanner keyboard = new Scanner (System.in);
        F_Name = keyboard.nextLine();// variable to hold the input
        this.FirstName = F_Name;// assign with the variable
    }
    
    
    public void setLastName (String L_Name) // set method to get the last name
    {
        Scanner keyboard = new Scanner (System.in);
        L_Name = keyboard.nextLine();// variable to hold the input
        this.LastName = L_Name;// assign  with the input variable 
    }
    
    
    public void setBirthday (int date,int month, int year) // set method to get the birthday
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("DD:");//message
        date = keyboard.nextInt();// variable to hold the input
        System.out.print("MM:");//message
        month = keyboard.nextInt();// variable to hold the input
        System.out.print("YY:");// message
        year = keyboard.nextInt();// variable to hold the input
        boolean check=false; // set the check as false
        while(check!=true) // loop until the condition becomes true
        {
            if((date>0 && date<=31)&&(month>0&&month<=12)&&(year>0)) // check whether the date and month matches within the range
            {
                check = true; // return true when the condition is true
                this.date = date; // assign with the variable input
                this.month = month;// assign with the variable input
                this.year = year;// assign with the variable input
            }
            else
            {
                check = false; // return false when the condition is false
                System.out.println("Invalid day/month/year input: please re-enter again");//message
                System.out.print("DD :");//message
                date = keyboard.nextInt();//get the new input
                System.out.print("MM :");
                month = keyboard.nextInt();//get the new input
                System.out.print("YY :");
                year = keyboard.nextInt();//get the new input
                this.date = date; //assign the new value if the condition is correct
                this.month = month;//assign the new value if the condition is correct
                this.year = year;//assign the new value if the condition is correct
            }
        }
    }
    
    
    public void setID (long ID) // set method to get ID 
    {
        Scanner keyboard = new Scanner(System.in); // scanner
        ID = keyboard.nextLong(); // hold the input with variable
        boolean check=false; // initialise the check as false
        while(check!=true)// loop until the check is true
        {
            if (ID>0) // condition to check not to have negative input
            {
                check = true; // return true when the condition is correct
                this.StudentID = ID; // assign the variable
            }
            else
            {
                check =false; // return false when the condition is wrong
                System.out.println("Invaild input- must be positive");//message
                System.out.print("please enter the student ID agian :");//message
                ID = keyboard.nextLong();// accept for new input
                this.StudentID = ID;// new input will assign when the check is true
            }
        }
    }
    
    
    public void setFirstAssignMark (double FAssignMark) // set method to get the first assignment mark
    {
        Scanner keyboard = new Scanner(System.in);
        FAssignMark = keyboard.nextDouble();// hold the input with variable
        boolean result=false;// initialise the result as false
        while(result!=true)// loop until the result is true
        if(FAssignMark>=0 && FAssignMark<=100)// condition to check not to have more than 100 and have to negative input
        {
            result = true;// return true when the condition is correct
            this.F_AssignMark = FAssignMark;// assign with the variable
        }
        else
        {
            result = false;// return false when the condition is wrong
            System.out.println("Invaild input- must be between 0-100");//message
            System.out.print("Please enter the first assignment marks again :");//message
            FAssignMark = keyboard.nextDouble();// accept for new input
            this.F_AssignMark = FAssignMark;// new input will assign when the check is true
        }
    }
    
    
    public void setSecondAssignMark (double S_Mark)// set method to get the second assignment mark
    {
        Scanner keyboard = new Scanner(System.in);
        S_Mark = keyboard.nextDouble();// hold the input with variable
        boolean result=false;// initialise the result as false
        while(result!=true)// loop until the result becomes true
        if(S_Mark>=0 && S_Mark<=100)// condition to check not to have more than 100 and not to have negative input
        {
            result = true;   // return true when the condition is correct
            this.S_AssignMark = S_Mark;// assign with the variable
        }
        else
        {
            result = false;  // return true when the condition is correct
            System.out.println("Invaild input- must be between 0-100");//message
            System.out.print("Please enter the second assignment marks again :");//message
            S_Mark = keyboard.nextDouble();// accept for new input
            this.S_AssignMark = S_Mark;// new input will assign when the result return true
        }
    }
    
    
    public void setPratical(double Praticalmark) // set method to get the practical marks
    {
        Scanner keyboard = new Scanner(System.in);
        Praticalmark = keyboard.nextDouble();// hold the input with variable
        boolean result = false;// initialise the result as false
        while(result!=true)// loop until the result becomes true
        if(Praticalmark>=0 && Praticalmark<=10)// condition to check not to have more than 10 and not to have  negative input
        {
            result = true;// return true when the condition is correct
            this.praticalMark = Praticalmark;// assign with the variable
        }
        else
        {
            result = false;// return true when the condition is correct
            System.out.println("Invaild input - must be between 0-10");//message
            System.out.print("Please enter the pratical marks again :");//message
            Praticalmark = keyboard.nextDouble();
            this.praticalMark = Praticalmark;// new input will assign when the result return true
        }
    }
    
    
    
    public void setFinal(double finalmark)// set method to get the final marks
    {
         Scanner keyboard = new Scanner(System.in);
        finalmark = keyboard.nextDouble();// // hold the input with variable
        boolean condition = false;// initialise the condition as false
        while(condition!=true)// loop until the condition becomes true
        if(finalmark>=0 && finalmark<=100)// condition to check not to have more than 100 and not to have negative input
        {
            condition = true;// return true when the condition is correct
            this.FinalExamMark = finalmark;// assign with the variable
        }
        else
        {
            condition = false;// return true when the condition is correct
            System.out.println("Invaild input- must be between 0-100");//message
            System.out.print("Please enter the final marks again :");//message
            finalmark = keyboard.nextDouble();// to get the new input
            this.FinalExamMark = finalmark;// new input will assign when the result return true
        }
    }
    
    
    public String getName ()// get method to call the name
    {
        return (title+" "+FirstName+" "+LastName); // return title, first name and last name as Name
    }
    
    
    public String getTitle() // a get method to call title 
    {
        return title; //return title
    }
    
    
    public String getFirstName()// a get method to call first name 
    {
        return FirstName; // return first name
    }
    
    
    public String getLastName()// a get method to call last name 
    {
        return LastName; // return last name
    }
   
    public Long getStd_ID()// a get method to call student ID 
    {
        return StudentID; // return student ID
    }
    
    
    public String getBirthday()// a get method to call Birthday 
    {
        return (date+"/"+month+"/"+year); // return date, month and year
    }
    
    
    public double getFirstAssignmentMark()// a get method to call first assignment marks 
    {
        return F_AssignMark; // return first assignment 
    }
    
    
    public double getSecondAssignmentMark()// a get method to call second assignment marks 
    {
        return S_AssignMark; // return second assignment 
    }
    
    
    public double getPraticalMark()// a get method to call pratical mark 
    {
        return praticalMark; //  return pratical mark
    }
    
    
    public double getFinalMark()// a get method to call final mark 
    {
        return FinalExamMark; // return final exam marks
    }
    
    
    public void outputdetail () // a method to print all student object information
    {
        System.out.println("Name: "+title+" "+FirstName+" "+LastName);
        System.out.println("StudentID:"+StudentID);
        System.out.println("Birthday:"+date+"/ "+month+"/"+year);
        System.out.println("First Assignment marks:"+F_AssignMark);
        System.out.println("Second Assignment marks:"+S_AssignMark);
        System.out.println("Pratical marks:"+praticalMark);
        System.out.println("Final Exam Marks:"+FinalExamMark);
    }
    
    public boolean equals(Student program2)
    {
        if(title.equals(program2.title)&&FirstName.equals(program2.FirstName)&&LastName.equals(program2.LastName) && StudentID==program2.StudentID && date==program2.date)
        {
            return true; // return true if following condition are same
        }
        else
        {
            return false; // return false
        }
    } 
    
    
    public void OverallMark()   // a method to calculate the Overall marks
    {
        double FirstAssignmentPercent = (20.0/100)*F_AssignMark; // calculating the first assignment percent
        double SecondAssignmentPercent= (20.0/100)*S_AssignMark; // calculating  the second assignment percent
        double PracticalPercent = praticalMark; // calculating the partical percent 
        double FinalExamPercent = (50.0/100)*FinalExamMark;  // calculating the final exam percent
        double Overall = FirstAssignmentPercent+SecondAssignmentPercent+PracticalPercent+FinalExamPercent; // calculating overall mark
    }
    
    
    public double Overall () // a method to return overall marks as double 
    {
        double FirstAssignmentPercent = (20.0/100)*F_AssignMark;
        double SecondAssignmentPercent= (20.0/100)*S_AssignMark;
        double PracticalPercent = praticalMark;
        double FinalExamPercent = (50.0/100)*FinalExamMark;
        double Overall = FirstAssignmentPercent+SecondAssignmentPercent+PracticalPercent+FinalExamPercent;
        return Overall;// return overall mark
    }
    
    
    public void grade() // a method to return grade
    {
        String grade = "";
        if(Overall()>=80)
        {
            grade = "HD"; // assign HD if the overall mark is more than 80 or equal
        }
        else if (Overall() >=70)
        {
            grade = "D"; // assign D if the overall mark is more than 70 or equal
        }
        else if (Overall() >=60)
        {
            grade = "C"; // assign the C if the overall mark is more than 60 or equal
        }
        else if (Overall() >=50)
        {
            grade = "P"; // assign the P if the overall mark is more than 50 or equal
        }
        else
        {
            grade = "N"; // assign the N if the overall marks is less than 50
        }
       System.out.println("Grade :"+grade);
    }
}
