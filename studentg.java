import java.util.Scanner;

class studentg{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
       System.out.println("student grade caluculator");
       System.out.println("enter no. of subjects");
       int ns=sc.nextInt();
       int total =0;
       for(int i=0; i<ns;i++){
        System.out.println("enter the marks obtanined in"+i);
        int marks =sc.nextInt();
        total+=marks;
       }
     //percentage
     double averP=(double)total/ns;
     char grade;
     if(averP>=90){
        grade='o';

     }  
     else if(averP>=80){
        grade='A';
     }
     else if(averP>=70){
        grade='B';


     }
     else if(averP>=60){
        grade='C';
     }
     else if(averP>=50){
        grade='D';
     }
     else if(averP>=40){
        grade='E';
     }
     else{
        grade ='F';
     }
     System.out.println("TOTAL marks scorde is"+total);
     System.out.println("AVERAGW PERCENTAGE GAINED IS "+averP);
     System.out.println("grade"+grade);
    }
}