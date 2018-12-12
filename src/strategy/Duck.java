package strategy;

public abstract class Duck {

	public void swim() {
		System.out.println("Swimming");
	}
	
	public void quack() {
		System.out.println("Quacking");
	}
	
	public abstract void display();
	
	public abstract void fly();
}
