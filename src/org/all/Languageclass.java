package org.all;

import java.util.Scanner;

import org.tamil.Tamillang;

public class Languageclass extends Tamillang {
	
	private void alllanguage() {
		System.out.println("all language extracted");

	}
	
	public static void main(String[] args) {
		
		Scanner Studentinfo = new Scanner(System.in);
		
		long studentID = Studentinfo.nextLong();
		System.out.println(studentID);
		
		Studentinfo.nextLine();
		String studentName = Studentinfo.nextLine();
		System.out.println(studentName);
		
		System.out.println("Mark 1");
		int mark1 = Studentinfo.nextInt();
		System.out.println("Mark 2");
		int mark2 = Studentinfo.nextInt();
		System.out.println("Mark 3");
		int mark3 = Studentinfo.nextInt();
		System.out.println("Mark 4");
		int mark4 = Studentinfo.nextInt();
		
		int mark5 = mark1+mark2+mark3+mark4;
				System.out.println(mark5);
				System.out.println(mark5/4);
		
	}
	
	

}
