package Core;
import java.util.ArrayList;

public class Battlefield
{
	ArrayList<Field> battlefieldGrid;

	public Battlefield(int size)
	{
		battlefieldGrid = new ArrayList<Field>();
	}

}

class Field
{
	Unit unit;

	public Field()
	{

	}
	
	public Field(Unit unit)
	{
		this.unit = unit;
	}
}