package com.string;

public class Course {
   //size 12345
	//index 012345
	
	
	public static void main(String[] args) {
	String name="Sharpa";
	String stud="Sharpa";
	
    String cool=name.toUpperCase();  
    System.out.println(cool);
		
	String bad=name.toLowerCase();
	System.out.println(bad);
	
	boolean red=name.startsWith("Sh");
	System.out.println(red);
	
	
	boolean black=name.endsWith("rp");
	System.out.println(black);
	
	
	int blue=name.indexOf("p");
	System.out.println(blue);
	
	int blue1=name.indexOf("a");
	System.out.println(blue1);
	
	String blue2=name.replace('S', '1');
	System.out.println(blue2);
		
	String blue3=name.replace('h', '2');
	System.out.println(blue3);
	
	String blue4=name.replaceAll("a", "&&");
	System.out.println(blue4);
	
	boolean yellow=name.equals(stud);
	System.out.println(yellow);
	
	boolean yellow1=name.equalsIgnoreCase(stud);
	System.out.println(yellow1);
	
	boolean yellow2=name.contains("Sh");
	System.out.println(yellow2);
	
	String rose=name.concat(stud);
	System.out.println(rose);
	
	String forg=name.trim();
	System.out.println(forg+ "25");
	
	String dog="Welcome to siva house";
	String[] pet=dog.split("o");
	for(int i=0; i<pet.length; i++) {
	System.out.println(pet[i]);

	}
	
	for(int i=0; i<dog.length(); i++) {
		System.out.println(dog.charAt(i));
	}
	
	char loose=dog.charAt(5);
	System.out.println(loose);
	
	}
	
	

}
