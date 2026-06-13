package PracticeArrays;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "race a car";	
		String arr=s.chars()
				.filter(e-> Character.isLetterOrDigit(e))
				.collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString().toLowerCase();

		System.out.println(arr);
		
		int l=0;
		int r=arr.length()-1;
		while(l<r) {
			
			if(arr.charAt(l)==arr.charAt(r)) {
				l++;
				r--;
			}
			else {
				System.out.println(false);
				break;
			}
			
		}
		System.out.println(true);

	}

}
