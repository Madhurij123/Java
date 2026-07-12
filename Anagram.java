package clg.dkte;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
	String s1 = "ate";
	
	String s2 = "eat";
	
	char[] a = s1.toCharArray();
	char[] b = s2.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	System.out.println(Arrays.equals(a, b));
}
}
