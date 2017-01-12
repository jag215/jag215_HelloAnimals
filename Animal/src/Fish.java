
public class Fish extends Animal{
	
	public Fish(String age, String color, int weight, int minimumWeight)
	{
		super(age, color, weight, minimumWeight);
		type = "fish";
	}
	public void swim()
	{
		if(weight > minimumWeight)
			weight = weight - 1;
		else
			System.out.println("Weight is at or below minimum");
	}

}
