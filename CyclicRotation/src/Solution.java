
public class Solution
{
	public int[] solution(int[] A, int K)
	{
		if (A.length > 1)
		{
			for (int i = 0; i < K; i++)
			{
				A = this.rotate(A);
			}
		}
		
		return A;
	}

	int[] rotate(int[] A)
	{
		int[] temp = new int[A.length];
		
		for (int i = 0; i < A.length; i++)
		{
			temp[i] = A[i];
		}

		temp[0] = A[A.length - 1];
		for (int i = 1; i < A.length; i++)
		{
			temp[i] = A[i - 1];
		}

		return temp;
	}
}
