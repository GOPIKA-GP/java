package ExceptionHandling;

import java.io.IOException;

public class Throws1 {
	public static void m() throws IOException
	{
	throw new IOException();
	}
	public static void main(String[] args) throws IOException
	{
	m();

	}

}
