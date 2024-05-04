package com.iis.MO21016;

/**
 * Hello world!
 *
 */
public class App 
{
	public String Hello() {
		return "Hello Word";
	}
	
    public static void main( String[] args )
    {
    	App hw = new App() ;
        System.out.println(hw.Hello() );
    }
}
