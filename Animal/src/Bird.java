
public class Bird extends Animal{
	
	public Bird(String age, String color, int weight, int minimumWeight)
	{
		super(age, color, weight, minimumWeight);
		type = "bird";
	}
	public void fly()
	{
		if(weight > minimumWeight)
			weight = weight - 2;
		else
			System.out.println("Weight is at or below minimum");
	}

}
