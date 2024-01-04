
public class Square extends TwoDimensionalShape {

	private double kenar;
	
	public Square(String isim, double kenar) 
	{
		super(isim);
		this.kenar = kenar;
	}

	public double getKenar() 
	{
		return kenar;
	}

	public void setKenar(double kenar) 
	{
		this.kenar = kenar;
	}

	@Override
	public double getArea() 
	{
		return Math.pow(kenar, 2);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nŞekil adı: " + getIsim() + " \nKenar uzunluğu: " + getKenar() + "\nAlan: " + getArea();
	}
	
	
	
	
	
	

}
