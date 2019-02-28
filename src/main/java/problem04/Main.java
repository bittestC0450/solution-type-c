package problem04;

public class Main {
	
	private static String[] question = new String[18];
	
	public static void main(String[] args) {
		
		for(int i =0; i<question.length; i++) {
			if(i==0) {
				question[i] = 9+"x"+((int)(Math.random()*9)+1);
			}else if(10<=i) {
				question[i] = (i-9)+"x"+((int)(Math.random()*9)+1);
			}else {
				question[i] = i+"x"+((int)(Math.random()*9)+1);
			}
		}
		for(String data:question) {
			System.out.println(data);
		}
		
		
	}
	
}