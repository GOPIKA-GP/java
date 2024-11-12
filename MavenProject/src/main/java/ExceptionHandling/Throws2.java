package ExceptionHandling;

import java.io.IOException;

public class Throws2 {
	public static void m() throws IOException
	{
	throw new IOException();
	}
	public static void main(String[] args) 
	{
	try 
	{
		m();
	} 
	catch (IOException e) {
		
		e.printStackTrace();
	}

	}


}
