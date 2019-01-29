class FG
{
	void g() throws Exception1
	{
	throw new Exception1("Exception in g()");
	}
	
	void f() throws Exception2
	{
		try
		{
			g();
		}
		catch (Exception1 e)
		{
			System.out.println(e);
			throw new Exception2("Exception in f() ");
		}

	}


}
