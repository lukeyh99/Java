/**
 * @(#)palindrones.java
 *
 *
 * @author
 * @version 1.00 2019/1/15
 */

import java.util.Scanner;
public class palindrones {

    public static void main(String args[])
    	 {
    	 	Scanner sc = new Scanner(System.in);
    	 		System.out.println("Please enter number of elements");
    	 		String s1 = new String();
    	 		 s1 = sc.nextLine();
    	 		 System.out.println("Enter a string" );
    	 		 for( int len = s1.length() - 1; len >= 0; len --)
    	 		 {
    	 		 	if( len == 'a' )
    	 		 		System.out.println(len);

    	 		 }



  }
}



