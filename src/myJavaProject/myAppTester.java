/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author melin
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your name");
		name = input.nextLine();
		greeting(name);
	}
	
	public static void greeting(String n) {
		System.out.println("Hello " + n + "!");
	}


	

}
