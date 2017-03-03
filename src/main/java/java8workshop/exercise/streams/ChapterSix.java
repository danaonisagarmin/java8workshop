package java8workshop.exercise.streams;

import java.util.Arrays;
import java.util.List;

public class ChapterSix {
	
	public static void main(String[] args) {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(4, 5);
		
		numbers1.stream().flatMap(n -> 
			numbers2.stream()
				.filter(m -> (m + n) % 3 == 0)
				.map(m -> new int[] {n, m})
		).forEach(a -> System.out.println(a[0] + " " + a[1]));
	}

}
