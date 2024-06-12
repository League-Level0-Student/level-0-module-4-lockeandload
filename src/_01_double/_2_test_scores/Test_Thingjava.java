package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_Thingjava {
	public static void main(String[] args) {
String score = "";
		String testscore = JOptionPane.showInputDialog("what you get on your test?");
		double testscoredouble = Double.parseDouble(testscore);
		System.out.println(testscoredouble);
	if(testscoredouble >= 97){
score = "A+";
	}
	if(testscoredouble >= 95 && testscoredouble < 97){
		score = "A";
			}
	if(testscoredouble >= 92 && testscoredouble < 95){
		score = "A-";
			}
	if(testscoredouble >= 87 && testscoredouble < 82){
		score = "B+";
			}
	if(testscoredouble >= 85 && testscoredouble < 87){
		score = "B";
			}
	if(testscoredouble >= 82 && testscoredouble < 85){
		score = "B-";
			}
	if(testscoredouble >= 77 && testscoredouble < 82){
		score = "C+";
			}
	if(testscoredouble >= 75 && testscoredouble < 77){
		score = "C";
			}
	if(testscoredouble >= 72 && testscoredouble < 75){
		score = "C-";
			}
	if(testscoredouble >= 67 && testscoredouble < 72){
		score = "D+";
			}
	if(testscoredouble >= 65 && testscoredouble < 67){
		score = "D";
			}
	if(testscoredouble >= 62 && testscoredouble < 65){
		score = "D-";
			}
	if(testscoredouble >= 50 && testscoredouble < 62){
		score = "F";
			}
if(testscoredouble <= 100) {	
 JOptionPane.showMessageDialog(null, "'you got " + testscoredouble + " as your grade, in letter form you got " + score);
}else {
	JOptionPane.showMessageDialog(null, "'you got " + testscoredouble + " as your grade, in letter form you got " + score + " YOU DID EXTRA CREDIT?!?!?");
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
