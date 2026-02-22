package core;

public class Kernel 
{
	private static Kernel instance;
	
	//private used so that no new instance can be created
//	private Kernel()
//	{
//		System.out.println("Kernal Intialized.");
//	}
	
	private Kernel() 
	{
	    System.out.println("[Kernel] Initialized.");
	}

	
	public static Kernel getInstance()
	{
		if(instance==null)
			instance=new Kernel();
		return instance;
	}
	
//	public void boot()
//	{
//		System.out.println("Operating Systen booting...");
//	}
	
	
	public void boot() 
	{
	    System.out.println("[Kernel] Operating System Booting...");
	}

}
