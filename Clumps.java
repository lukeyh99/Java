/**
 * @(#)week 9.java
 *
 *
 * @author
 * @version 1.00 2018/12/3
 */

import java.util.Scanner;
public class Clumps.java {

    public static void main (String args[])
    	{
    		//set up variables
    		int size = 0, largestClump = 1, Clump = 1;
    		Scanner sc = new Scanner(System.in);
    		//prompt user for array size
    		System.out.println("how big is the array: ");
    		 size = sc.nextInt();
    		//create an array o the  corresponding size
    		int[] ar = new int [size];
    		//prompt the user to input all elements
    		for(int i = 0; i<ar.length; i++)
    		{
    			System.out.println("Please enter values of the array"+i);
    			ar[i] = sc.nextInt();

    		}
    		//need to work through the array elemment by element
    		//starting a the start. Compare the first two elements
    		//with each other. If they are the same add one on ther current clump size
    		//If its bigger update your largest clump size.
    		//If the elements are not the same reset clump value back to 1.
    		//move onto the next two elements and repeat
    		int val = ar[0];


    		//move through array and check for clumps
    		for(int i = 1; i<size; i++)
    		{
    			if(ar[i] == val)
    			{
    				largestClump = clump;
    			}
    		}
    		else//the values are not the same
    		{
    			val = ar[i];
    			clump = 1;
    		}

    }//end loop
    System.out.println("Largest clump: " + largestClump);


}