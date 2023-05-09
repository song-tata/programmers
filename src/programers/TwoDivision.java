package programers;

public class TwoDivision {

	public static int solution(int num1, int num2) {
        int answer = 0;
  
         answer = (int)(((double) num1 / (double)num2) * 1000);
        
        return answer;
    }
	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int sol = solution(a,b);
		System.out.println(sol );
	}

}
