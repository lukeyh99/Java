
public class ArrayToMethod
{

    public static void main(String[] args)
    {
	double[] prices =
	    { 10, 20.20, 35, 50.00 };
	double percentInc = 0.10;

	System.out.printf("Before the price increase method call\n");
	for (int i = 0; i < prices.length; i++)
	{
	    System.out.printf("prices[%d] is %.2f\n", i, prices[i]);
	}
	System.out.println("");

	priceIncrease(prices, percentInc); // Call the method

	System.out.printf("\nAfter the price increase method call\n");
	for (int i = 0; i < prices.length; i++)
	{
	    System.out.printf("prices[%d] is %.2f\n", i, prices[i]);
	}

    }

    public static void priceIncrease(double[] oldPrices, double inc)
    {
	for (int i = 0; i < oldPrices.length; i++)
	{
	    System.out.printf("In the method, oldPrices[%d] was %.2f", i, oldPrices[i]);
	    oldPrices[i] = oldPrices[i] * (1 + inc);
	    System.out.printf(" oldPrice[%d] is %.2f\n", i, oldPrices[i]);
	}

    }
}
