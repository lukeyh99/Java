
public class InitArrayInLoop
{

    public static void main(String[] args)
    {
	int[] loopValues = new int[10];

	for (int i = 4, j = 6; i < 10; i++, j--)
	{
	    loopValues[i] = j;
	    System.out.println("i = " + i + " and loopValues[" + i + "] = " + loopValues[i]);
	}

    }

}
