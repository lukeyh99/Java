/**
 * @(#)Binary search.java
 *
 *
 * @author
 * @version 1.00 2019/5/1
 */


public class Binarysearch {

    public static void main(String args[])
     {
     	int array [] = { 12,34,44,51,103,210,217,230,291,300,312,1024};

     	int target = 291, high = array.length-1, low = 0, middle = 0;
     	boolean found = false;
     	while( low <= high &&!found)
     	{
     		middle = (high + low)/2;
     		if(array[middle] > target)//search lower space
     		{
     			high = middle - 1;
     		}
     		else if ( array[middle] < target)//search higher space
     		{
     			low = middle + 1;
     		}
     		else
     		{
     			System.out.println(target + " found at position " + middle);
     			found = true;
     		}

     	}
     	if(!found )
     	{
     		System.out.println(target + " was not found in the list");
     	}
     	}
    }


