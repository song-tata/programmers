package programers;

public class AgePrint {
	public static final int THISYEAR = 2022;
	
	public static int solution(int age) {
        
        
        return THISYEAR - (age-1);
    }
	
	public static void main(String[] args) {
		int a =  29;
		
		int b = solution(a);
		System.out.println(b);
	}

}
