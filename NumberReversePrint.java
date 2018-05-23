package javaashok;

public class NumberReversePrint {

	public static void main(String[] args) {
	
		int a=371, c=0, d=0, i=a;
		
		System.out.println(a);
		
		for (; a>0;)
		{
			d=a%10;
			a=a/10;
			c=c*10+d;
			System.out.println(c);
		}
		
		if (c==i)
		{
			System.out.println("This No. is NOT Number Reverse Print");
		}
		else
		{
			System.out.println("This No. is Number Reverse Print");
		}
	}
}
