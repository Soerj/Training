import java.util.*;

public class App
{
	public static void print(Iterator it)
	{
		while (it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}

	public static void main(String[] args)
	{
		List<Node> list = new ArrayList<Node>();
		HashSet<Node> hs = new HashSet<Node>();

		fill(list, 3);
		fill(hs, 4);

		print(list.iterator());
		System.out.println("-------------");
		print(hs.iterator());
	}

	public static void fill(List<Node> list, int count)
	{
		for (int i = 0; i < count; i++)
		{
			list.add(new Node());
		}
	}

	public static void fill(Set<Node> list, int count)
	{
		for (int i = 0; i < count; i++)
		{
			list.add(new Node());
		}
	}
}

class Node
{
	static int counter = 0;
	private final int id = counter++;

	public int getId()
	{
		return this.id;
	}

	@Override
	public String toString()
	{
		return (getClass().getSimpleName() + " " + id);
	}
}