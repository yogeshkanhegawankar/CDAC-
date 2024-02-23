public class PowerOfNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("Enter number:");
		num=sc.nextInt();
		int power=1,base,exponent;
		exponent=num%10;
		base=num/10;
		
		for(int i=1;i<=exponent;i++) {
			power=power*base;
		}
		System.out.println("Power of "+num+" is "+power);
	}
	
	}
-----------------------------------------------------------
O/P:
Enter number:
22
