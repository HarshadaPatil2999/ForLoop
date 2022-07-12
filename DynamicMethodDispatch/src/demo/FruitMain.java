package demo;
//dynamic method dispatch
//run time polymorphisam
 class Fruit{
	void eat()
	{
		System.out.println("Fruits are good for health");
	}
}

class Apple extends Fruit{
	void eat()
	{
		System.out.println("Apple is very good for eyes");
	}

	
}
class Strawberry extends Fruit{
	void eat()
	{
		System.out.println("Strawberries are sweet in taste");
	}
}

public class FruitMain{
	public static void main(String[] args) {//run time 
		Fruit f1=new Fruit();//upcasting:create a parent class object and same
		f1.eat();// method in child class display with ref and store the object of child class which child class of same method will be displayed.
		f1=new Apple();
		f1.eat();
		f1=new Strawberry();
		f1.eat();
	}
}