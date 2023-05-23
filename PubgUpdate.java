package polymorphism;

public class PubgUpdate extends Pubg{
	
	boolean gun = false;
	
	public void turnRight()
	{
			System.out.println("Turn right !");
	}
	
	public void takeGun(String name)
	{
		gun = true;
		
		bullets += 30;
		System.out.println(name + "gun taken !");
		System.out.println(bullets);
	}
	
	public void fire()
	{
		if(gun)
		{
			if(bullets != 0)
			{
				bullets --;
				System.out.println(bullets+"left");
			}
			else
			{
				System.out.println("reload");
			}
		}
		else
		{
			System.out.println("No gun found !");
		}
	}
	
	public void reload()
	{
		if(gun)
		{
			super.reload();
			System.out.println("reloaded !");
		}
		else
		{
			System.out.println("First take a gun");
		}
	}
}
