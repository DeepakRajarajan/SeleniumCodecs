package week3;

public class MyMobile {

	public static void main (String[] args)

	{
		Samsung s = new Samsung();
		//Confirm Inheritance works
		s.bluetooth();
		//confirm Override works
		s.displaytype();
	
		Iphone i = new Iphone();
		//confirm overload works
		i.model();
		i.model("Print the overload value");;
	}
}
