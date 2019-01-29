class Test
{
	public static void main(String[] args)
	{
		FG obj = new FG();
		try
		{
			obj.f();
		}
		catch (Exception2 e)
		{
			System.out.println(e);
		}
	}
}
