package com.syntax.class12;

	public class Phone{
		String model;
		String make;
		double screenSize;
		int RAM;
		int ROM;
		int storate;
		int camera;
		
		void call() {
			System.out.println("calling someone");
	}  void takePicture() {
		System.out.println("use my camer app to take pictures");
	}
	
     public static void main(String[]args) {
	Phone s22Ultra =new Phone();
	s22Ultra.make="Samsung";
	s22Ultra.model="Samsung galaxy s22 ultra";
	s22Ultra.screenSize =6.8;
	System.out.println(s22Ultra.make);
	s22Ultra.call();
	
	
	
}
	}
	

