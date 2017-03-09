import java.util.Arrays;

public class DriversExam {

	private String[] correct = {"B","D","A","A","C","A","B","A","C","D","B","C","D","A","D","C","C","B","D","A"};
	private double totalCorrect;
	private double totalIncorrect;
	private String missed;
	private static int num = 1;
	
	public DriversExam(String[] userAnswers){
		for(int i = 0; i < correct.length;i++){
			if(userAnswers[i].equals(correct[i])){
				setTotalCorrect();
			}else{
			setTotalIncorrect();
			setMissed(i);
		}
	}
	}
	
	public boolean Pass(){
		if(totalCorrect >= 15){
			return true;
		}else{
			return false;
		}
	}
	
	public String getMissed() {
		return missed;
	}

	
	public void setMissed(int wrong ) {
		if(num == 1){
			missed = " " + (wrong + 1);
			num++;
		}else{
			missed += " " + (wrong + 1);
		}
	}

	
	public double getTotalCorrect() {
		return totalCorrect;
	}

	public void setTotalCorrect() {
		totalCorrect++;
	}

	
	public double getTotalIncorrect() {
		return totalIncorrect;
	}

	
	public void setTotalIncorrect() {
		totalIncorrect++;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DriversExam other = (DriversExam) obj;
		if (!Arrays.equals(correct, other.correct))
			return false;
		return true;
	}

}
