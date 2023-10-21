
package prac;
import java.util.Scanner;


public class challenge2 {
    public static void  main(String[] args){
       Scanner inp=new Scanner(System.in);
        int chemistry,Maths,Physics,English,Science,Geography;
        System.out.println("Enter the marks for chemistry: ");
         chemistry=inp.nextInt();
         validateMarks(chemistry);
        System.out.println("Enter the marks for Maths:");
        Maths=inp.nextInt();
        validateMarks(Maths);
         System.out.println("Enter the marks for Science: ");
         Science=inp.nextInt();
         validateMarks(Science);
          System.out.println("Enter the marks for Geography: ");
         Geography=inp.nextInt();
         validateMarks(Geography);
          System.out.println("Enter the marks for Physics: ");
        Physics=inp.nextInt();
        validateMarks(Physics);
         System.out.println("Enter the marks for English: ");
         English=inp.nextInt();
         validateMarks(English);
         float total=chemistry+Maths+Physics+English+Science+Geography;
         float percentage=(total/600)*100;
         System.out.println("Total marks: "+total);
        
         if(percentage>91){
           
             System.out.println("Percentage: "+percentage+" Grade A+");
         }
         else if(percentage>=87 && percentage<=90){
            
             System.out.println("Percentage: "+percentage+" Grade A");
    }
         else if(percentage>=80 && percentage<=86){
             System.out.println("Percentage: "+percentage+" Grade B+");
           }
         else if(percentage>=72 && percentage<=79){
             System.out.println("Percentage: "+percentage+" Grade B");
           }
         else if(percentage>=66 && percentage<=71){
             System.out.println("Percentage: "+percentage+" Grade C+");
           }
         else if(percentage>=60 && percentage<=65){
             System.out.println("Percentage: "+percentage+" Grade C");
           }
         else if(percentage<60){
             System.out.println("Percentage: "+percentage+" Grade F");
           }
           
    }
 public static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100."); 
        }
 }
}