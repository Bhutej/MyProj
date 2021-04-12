package com.tyss.quizassign;

import java.util.Scanner;

import com.tyss.quizassign.factory.Factory;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int iterate;
		do {
			System.out.println("Welcome to Quiz");
			System.out.println("Enter 1 for Register");
			System.out.println("enter 2 for Login");
			int option = scanner.nextInt();
			Factory factory = new Factory();
			if (option == 1) {
				factory.register();
			}
			if (option == 2) {
				factory.login();
			}
			System.out.println("Enter 1 for one more time Login/Register");
			System.out.println("Enter 2 for exit");
			iterate = scanner.nextInt();
		} while (iterate == 1);
	}//End of the Main Method

}//End of the Class
