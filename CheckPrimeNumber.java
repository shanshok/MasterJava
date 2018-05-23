package javaashok;

public class CheckPrimeNumber {

	public static void main(String[] args) {
    
		int i, nbr=5, flag=0;
		System.out.println(nbr);
		for (i=2; i<nbr; i++)
		{	
		if (nbr%i==0)
		{
			flag = 1;
			break;
		}}
		
		if (flag==0)
		{
			System.out.println("Prime No");
		}
		else
		{
			System.out.println("Not a Prime No");
		}
		}
	}

