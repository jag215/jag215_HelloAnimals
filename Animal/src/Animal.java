
public class Animal {
	
	protected String age;
	protected String color;
	protected String type;
	protected int weight;
	protected int minimumWeight;
	
	public Animal(String age, String color, String type, int weight, int minimumWeight)
	{
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	
	public Animal(String age, String color, int weight, int minimumWeight)
	{
		this.age = age;
		this.color = color;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public int getWeight()
	{
		return weight;
	}
	public void eat()
	{
		weight += 1;
	}
	public void output()
	{
		System.out.println("Final Weight: " + getWeight());
	}
	
}
