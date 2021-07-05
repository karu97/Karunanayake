public class studentmarks {
	public static void main(String[] args) {
		int marks = 100;
        String grade;
        if (marks >=101 ) {
            grade = "Please enter only the number 1-100";
        }
        else if (marks >= 90){
            grade = "A";
        }
        else if (marks >= 80){
            grade = "B";
        }
        else if (marks >= 70){
            grade = "C";
        }
        else if (marks >= 60){
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("Grade is : " + grade);


    }
}