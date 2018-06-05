import java.util.Random;

public class test2 {
	
	public static void main(String[] args) {
		randomNumber();
	}

	public static String randomNumber() {
		Random random=new Random();
		StringBuilder s = new StringBuilder();
		for(int i=0;i<6;i++){
			s.append(random.nextInt(10));
		}
		return s.toString();
	}
}
