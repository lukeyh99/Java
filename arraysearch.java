/**
 * @(#)arraysearch.java
 *
 *
 * @author
 * @version 1.00 2019/2/20
 */
import java.util.Scanner;
public class arraysearch
{
    public static void main(String args[])
    	  {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        String search = new String();
        String array[][] = new String[row][col];
        for(int i = 0; i < row; i++)
        	{
            for(int j = 0; j < col; j++)
            	{
                array[i][j] = scan.nextLine();
            }
            System.out.println(countStrings(array,search));
        }
    }
    public static int countStrings(String[][]array, String search)
    	{
        int count = 0;
        int row = array.length;
        int col = array[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(array[i][j].equals(search)){
                    count++;
                }
            }
        }
        return count;
    }
}

