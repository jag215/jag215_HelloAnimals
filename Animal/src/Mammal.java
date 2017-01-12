
public class Mammal extends Animal{
	
	public Mammal(String age, String color, int weight, int minimumWeight)
	{
		super(age, color, weight, minimumWeight);
		type = "mammal";
	}
	public void run()
	{
		if(weight > minimumWeight)
			weight = weight - 1;
		else
			System.out.println("Weight is at or below minimum");
	}

}
