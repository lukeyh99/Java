/**
 * @(#)ClassesObjects.java
 *
 *
 * @author
 * @version 1.00 2019/5/2
 */


public class Car //class name
{

    //attributes
    int numberOfDoors;
    String colour;
    char motorType;// F for fuel or E for electric

    //setting up default constructors
    public Car()
    {
    	numberOfDoors = 3;
    	colour = 'red';
    	motorType = 'E';
    }
    //General constructor
    public Car(int doors, String carColour, char motor)
    {
    	numberOfDoors = doors;
    	colour = carColour;
    	motorType = motor;
    }
    //functionality
    public  void  printCarDetails
    {
    	String details = "Number of Doors" + numberOfDoors;
    	details += "\nColour: " + colour;
    	details += "\nMotor Type: " + motorType;
    	System.out.println(details);
    }
    public class CarTester
    {
    	public static void main (String args[])
    	{
    		//This will call the default constructor
    		Car c1 = new Car()
    			//this will call the general constructor that takes in the parameters eg(int , string , char)
    		Car c2 = new Car( 4 , "Blue" , 'I');
    		//call printCar details
    		c1.printCarDetails();
    		//this will call the printcardetails for c2
    		c2.printCarDetails();
    		//call colour method for c2 and print
    		System.out.println("Current colour is : " + c1.colour);
    		//this will change the colour of the car
    		c1.colour = "red";
    		//this will call the colour method for c1
    		System.out.println("Current colour is:" + c1.colour);

    	}
    }
    //making an array of objects
    Car carshowroom [] = new car [5];
    for(int i = 0 ; i < 5; i++)
    {
    	carShowRoom[i] = new Car();
    }




}