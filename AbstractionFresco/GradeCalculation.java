package AbstractionFresco;


abstract class Student{
      public abstract String calculateGrades();
}

class Aided extends Student {
    String scores;

    public Aided(String scores) {
        this.scores = scores;
    }

    public String calculateGrades() {
        String[] parts = scores.split("\\|");
        String[] subjects = parts[0].split(",");
        String[] ncc = parts[1].split(",");
        String[] sports = parts[2].split(",");
        double finalGrade;
        int totalCredits = 0;
        double cumulativeScore = 0.0;
        if (Integer.parseInt(ncc[0]) == 1) {
            cumulativeScore += Integer.parseInt(ncc[2]) * gradeCalc(Integer.parseInt(ncc[1]));
            totalCredits += Integer.parseInt(ncc[2]);
        }
        if (Integer.parseInt(sports[0]) == 1) {
            cumulativeScore += Integer.parseInt(sports[2]) * gradeCalc(Integer.parseInt(sports[1]));
            totalCredits += Integer.parseInt(sports[2]);
        }
        for (String s : subjects) {
            String[] eachSub = s.split(" ");
            cumulativeScore += Integer.parseInt(eachSub[1]) * gradeCalc(Integer.parseInt(eachSub[0]));
            totalCredits += Integer.parseInt(eachSub[1]);
        }

        finalGrade = cumulativeScore / totalCredits;
        String fiGrade = String.format("%.2f",finalGrade);

//        System.out.println("check " + finalGrade);
        return fiGrade;
    }

    private double gradeCalc(int marks) {
        double grade;
        if (marks >= 75 && marks <= 100) {
            grade = 9.0 + ((marks - 75) / 25.0);
        } else if (marks >= 60 && marks <= 74) {
            grade = 8.0 + ((marks - 60) / 15.0);
        } else if (marks >= 50 && marks <= 59) {
            grade = 7.0 + ((marks - 50) / 10.0);
        } else if (marks >= 40 && marks <= 49) {
            grade = 6.0 + ((marks - 40) / 10.0);
        } else {
            return 0.0;
        }
        System.out.println("grade "+Math.round(grade * 10.0) / 10.0);
        return Math.round(grade * 10.0) / 10.0;
    }
}
class SelfFinance extends Student {
    String scores;
    public SelfFinance(String scores){
        this.scores = scores;
    }
    public String calculateGrades(){
        return null;
    }

}
public class GradeCalculation {

    public static void main(String[] a){
        //"67 4,34 2,54 5,100 2|1,100,5|0,100,5"
        Student obj1 = new Aided("100 4,34 10,54 5,100 2,50 2,54 5|1,50,5|0,100,5");
        Student obj2 = new SelfFinance("100,5 100,5 100,3|1,100,5");

        System.out.println(obj1.calculateGrades());
    }
}
