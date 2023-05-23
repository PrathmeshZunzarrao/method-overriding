package polymorphism;

public class Pubg {
	
	int bullets;
	
	public void jump()
	{
		System.out.println("Jump 2 steps");
	}
	
	public void turnRight()
	{
		System.out.println("Turn Left");
	}
	
	public void takeGun(String name)
	{
		bullets = 30;
		System.out.println(name + "gun picked !");
	}
	
	public void fire()
	{
		bullets--;
	}
	
	public void reload()
	{
		bullets=30;
	}
	
	public void turnLeft()
	{
		System.out.println("Turn Left");
	}
	
	public void forward()
	{
		System.out.println("1 step front");
	}
	
	public void backward()
	{
		System.out.println("1 step backward");
	}
	
	
}
