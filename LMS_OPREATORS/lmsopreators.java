package LMS_OPREATORS;

public class lmsopreators {
    public static void main(String[] args) {
        int StudentID =101 ;
        String name = "shravya";
        byte age=20;
       byte quizsScores = 70;
        byte assigmentScore = 30;
     byte examScore = 70;
        double  attendence =70;

        //calucation arthimetic operation
        double totalscore= quizsScores+assigmentScore+examScore;
        double averagescore= totalscore/3;
         
        //determine student passed
        boolean isStudentPassed = averagescore >= 75;
         attendence++;

         boolean isStudentQulifiedAward = attendence>=80;
         System.out.println("Student name:"+name);
         System.out.println("TOTALSCORE:"+totalscore);
         System.out.println("AVERAGESCORE:"+averagescore);
         System.out.println("StudentPassed:"+isStudentPassed);
         System.out.println("Updatedattedence:"+attendence);
         System.out.println("StudentQulifiedAward:"+isStudentQulifiedAward);
         
         
         






    }
}
