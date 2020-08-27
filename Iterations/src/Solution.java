
public class Solution
{
	public int solution(int N)
	{
		int max = 0;
		char[] a = Integer.toBinaryString(N).toCharArray();

		System.out.println(a);

		for (int i = 0; i < a.length - 1; i++)
		{
			if (a[i] == '1' && a[i + 1] == '0')
			{
				int temp = 1;
				for (int j = i + 2; j < a.length; j++)
				{
					if (a[j] == '0')
						temp++;
					else if (a[j] == '1')
					{
						max = (temp > max) ? temp : max;
						i = j - 1;
						break;
					}

				}

			}
		}
		System.out.println(max);
		return max;
	}
}
