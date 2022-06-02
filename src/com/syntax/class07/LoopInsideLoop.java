package com.syntax.class07;

public class LoopInsideLoop {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		while (x <= 10) {
			while (y <=10) {
				System.out.print(y);
				y++;
				
			}
			System.out.println();
			y = 1;
			x++;
		}

	}

}
