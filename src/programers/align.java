package programers;

public class align {

	public static int solution(int[] array) {
		int answer = 0;
		int temp;
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		answer = array[array.length/2];
		return answer;
	}
	
	public static void main(String[] args) {
		int[] a = {1,0,6,-1,9};
		
		int b = solution(a);
		
		System.out.println(b);
	}
}
