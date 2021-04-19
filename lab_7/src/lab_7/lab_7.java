package lab_7;

import java.util.Scanner;
import java.io.*;

class OutOfRangeException extends Exception{
	
}

class AddZeroException extends Exception{
	
}

class SubtractZeroException extends Exception{
	
}

public class lab_7 {
	
private static int sum;
	
	public static void Add(int n1, int n2) throws AddZeroException, OutOfRangeException
	{
		if(n1 ==0 || n2 == 0)
			throw new AddZeroException();
		sum = n1 + n2;
		if(n1>1000||n1<0||n2>1000||n2<0||sum>1000)
			throw new OutOfRangeException();
	}
	
	public static void Sub(int n1, int n2) throws SubtractZeroException, OutOfRangeException
	{
		if(n1 ==0 || n2 == 0)
			throw new SubtractZeroException();
		sum = n1 - n2;
		if(n1>1000||n1<0||n2>1000||n2<0||sum<0)
			throw new OutOfRangeException();
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] num = input.split("\\+|-");
		int n1 = Integer.parseInt(num[0]);
		int n2 = Integer.parseInt(num[1]);
		try {
			if(input.charAt(num[0].length())=='+')
				Add(n1 ,n2);
			else if(input.charAt(num[0].length())=='-')
				Sub(n1 ,n2);
			System.out.println(sum);
		}catch(AddZeroException e)
		{
			e.printStackTrace();
		}catch(SubtractZeroException e)
		{
			e.printStackTrace();
		}catch(OutOfRangeException e) {
			e.printStackTrace();
		}
		
			
		scan.close();

	}

}
