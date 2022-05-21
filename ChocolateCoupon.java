import java.util.Scanner;

/**
 * @author Arash
 *
 *Suppose we can buy a chocolate bar from the vending machine for $1 each. 
 *Inside every chocolate bar is a coupon. We can redeem six coupons for one 
 *chocolate bar from the machine. 
 *
 *This means that once you have started buying chocolate bars from the machine, 
 *you always have some coupons. 
 *
 *We would like to know how many chocolate bars can be eaten if 
 *we start with N dollars and always redeem coupons if we have enough 
 *for an additional chocolate bar.
 *
 *For example, with 6 dollars we could consume 7 chocolate bars 
 *after purchasing 6 bars giving us 6 coupons and then redeeming the 6 coupons 
 *for one bar. This would leave us with one extra coupon. 
 *
 *For 11 dollars, we could have consumed 13 chocolate bars and still have one coupon left. 
 *
 *For 12 dollars, we could have consumed 14 chocolate bars and have two coupons left.
 *
 *Write a program that inputs a value for N and outputs how many chocolate bars 
 *we can eat and how many coupons we would have left over. 
 *Use a loop that continues to redeem coupons as long as there are enough to 
 *get at least one chocolate bar.
 */

public class ChocolateCoupon 
{
	public static void main(String[] args) 
	{
		//variables
		int chocolate = 0;
		int couponChocolate = 0;
		
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the dollar amount you want to spend "
				+ "on purchasing chocolate for $1 each: ");			
		int money = keyboard.nextInt();
		
		//while you have money, add chocolate and coupon
		while (money > 0 )
		{
			chocolate++;
			couponChocolate++;
			money--;
		}
		//if you have more than 5 coupons, add chocolate and coupon and subtract coupons
		while (couponChocolate > 5)
		{
			chocolate++;
			couponChocolate++;
			couponChocolate -= 6;
		}
		
		//output
		System.out.println("You can purchase a total of: " + chocolate + " chocolate bars");
		System.out.println("with " + couponChocolate + " coupons left over");
		
		//closes scanner object
		keyboard.close();
	}
}
