/**
 * @(#)Studypractice.java
 *
 *
 * @author
 * @version 1.00 2019/3/28
 */
//bubble sorting
public class Bubblesort
{
	public static void main(String args[])
	{
		int [] data = {12,11,232,666,1433,0,-34,14,43,544};
		int temp = 0;
		for(int pass = 1 ; pass < data.length; pass++)
		{
			for( int i = 0; i < data.length-1; i ++)
			{
				if(data[i] > data[i+1])
				{
					temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
			}

	}
	for (int i = 0; i < data.length; i++ )
	{
		System.out.print(data[i] + " ");
	}
}

}
}


