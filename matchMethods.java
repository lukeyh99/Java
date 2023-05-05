/**
 * @(#)matchMethods.java
 *
 *
 * @author
 * @version 1.00 2019/2/26
 */


public class matchMethods {

    public static int main(String args[])
    	 {
    	 	String strWithNumber = "This string has a 1 number";
if(strWithNumber.matches(".*\\d.*"))
{
    System.out.println("'"+strWithNumber+"' contains digit");
}
 else
{
    System.out.println("'"+strWithNumber+"' does not contain a digit");
}

String strWithoutNumber = "This string does not have a number";
if(strWithoutNumber.matches(".*\\d.*"))
{
    System.out.println("'"+strWithoutNumber+"' contains digit");
}
else
{
    System.out.println("'"+strWithoutNumber+"' does not contain a digit");
}
    }


}