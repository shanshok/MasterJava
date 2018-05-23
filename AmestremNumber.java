package javaashok;

public class AmestremNumber {

	public static void main(String[] args) {
		int n=142, r, m=0, p;
		p=n;
		System.out.println(p);
		while (n>0)
		{
			r=n%10;
			m=(r*r*r)+m;
			n=n/10;
		}
		System.out.println(m);
		if (m==p)
		{
			System.out.println("This is Amestrem! Number");
		}
		else
		{
			System.out.println("This is NOT Amestrem! Number");
		}
	}
	}


