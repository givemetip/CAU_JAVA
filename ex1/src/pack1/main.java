package pack1;

public class main {
	public static void main(String[] args)
	{
		int a = 3;
		long startTime = System.nanoTime();
		for(int i=0;i<100;i++)
		{
			int result = a * a;
		}
		long endTime = System.nanoTime();
		System.out.println("a * a time : " + (endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i=0;i<100;i++)
			Math.pow(a, 2);
		endTime = System.nanoTime();
		System.out.println("pow a time : " + (endTime-startTime));
	}
}
