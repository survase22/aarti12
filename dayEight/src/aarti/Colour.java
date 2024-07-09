package aarti;
//covareint overriding concept
//parent class
public class Colour {
	protected Colour getColour()
	{
		Colour s =new Colour();
				return s;
		
	}
	//child class
	class Red extends Colour{
		protected Red getcolour()
		{
		Red s=new Red();
		return s;
		
	}
	}
	//child class
		class Yellow extends Colour{
			protected Yellow getcolour()
			{
		Yellow s=new Yellow();
			return s;
			
		}
		}

System.out.println("r.getColour");

	


