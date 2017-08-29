package algorithm2;

import java.util.Arrays;
import java.util.stream.IntStream;

/***
 * def average(list):
 * 함수를 완성해서 매개변수 list의 평균값을 return하도록 만들어 보세요.
 * 어떠한 크기의 list가 와도 평균값을 구할 수 있어야 합니다.
 * */
public class GetMean {
	public int getMean(int[] array) {
		// 스트림을 사용해서 구할 수도 있다. 
		int streamSum = IntStream.of(array).sum();
		int arraySum = (int) Arrays.stream(array).average().orElse(0);
		
		int result = 0;
		for(int i : array) {
			result = result + i; 
		}
		return result / array.length;
	}
	
	public static void main(String[] args) {
		int x[] = {3, 4, 5};
		GetMean getMean = new GetMean();
		System.out.println(getMean.getMean((x)));
	}
}
