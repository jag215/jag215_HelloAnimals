import java.util.Vector;
public class AnimalTest {

	public static void main(String[] args) {
		
		Vector<Animal> vct = new Vector<Animal>();
		Fish fish1 = new Fish("2", "green", 8, 4);
		Fish fish2 = new Fish("4", "blue", 14, 7);
		Mammal mammal1 = new Mammal("12", "black", 70, 55);
		Mammal mammal2 = new Mammal("8", "tan", 30, 20);
		Bird bird1 = new Bird("7", "white", 4, 2);
		Bird bird2 = new Bird("3", "brown", 3, 1);
		
		vct.add(fish1);
		vct.add(fish2);
		vct.add(mammal1);
		vct.add(mammal2);
		vct.add(bird1);
		vct.add(bird2);
		
		for(int i = 0; i < vct.size(); i++)
		{
			vct.get(i).eat();
		}
		
		fish1.swim();
		fish2.swim();
		mammal1.run();
		mammal2.run();
		bird1.fly();
		bird2.fly();
		
		System.out.print("fish1 ");
		fish1.output();
		System.out.print("fish2 ");
		fish2.output();
		System.out.print("mammal1 ");
		mammal1.output();
		System.out.print("mammal2 ");
		mammal2.output();
		System.out.print("bird1 ");
		bird1.output();
		System.out.print("bird2 ");
		bird2.output();

	}

}
