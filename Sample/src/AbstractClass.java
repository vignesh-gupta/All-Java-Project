abstract class Animal {
  public abstract void animalSound();
  public abstract void additional();
}

class Cat extends Animal{
	public void animalSound(){
		System.out.print("Roar");
	}
	public void additional(){
		System.out.print("Non-Veg");
	}
}



public class AbstractClass extends a{
	Cat c = new Cat();
	c.animalSound();
}
