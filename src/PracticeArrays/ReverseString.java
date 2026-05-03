package PracticeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String s = "happy weekend";

//		char[] r = s.toCharArray();
//
//		int left = 0;
//		int right = r.length-1;
//
//		while (left < right) {
//
//			char temp = r[right];
//			r[right] = r[left];
//			r[left] = temp;
//			left++;
//			right--;
//		}
//		
//		for(int i=0;i<r.length;i++) {
//			System.out.print(r[i]+" ");
//		}
//		System.out.println();
   
		
		List<Character> result =s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		
		String res= Stream.of(s.split("")).reduce("",(p,n)-> (n+p));
		//result.stream().reduce(" ",(p,n)-> n + p);
		System.out.println(res);
	}

}
