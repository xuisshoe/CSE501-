package lab0;

public class ArrayPractice {

	public static void main(String[] args) {

		boolean[][] twoD = new boolean[3][4];

		for(int i = 0; i < twoD.length; ++i)
		{
			for(int j = 0; j < twoD[0].length; ++j)
			{
				twoD[i+1][j] = Math.random() > .5;
				System.out.print("(" + i + " ," + j + ") ");
			}
			System.out.println();
		}
		
		System.out.print("\n");
		System.out.println();
		
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
			
	}
}
