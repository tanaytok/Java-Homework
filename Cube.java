
public class Cube extends ThreeDimensionalShape{

	private double kenar;
	
	public Cube(String isim, double kenar) 
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
		return Math.pow(kenar, 2) * 6;
	}

	@Override
	public double getVolume()
	{
		return Math.pow(kenar, 3);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nŞekil adı: " + getArea() + " \nKenar uzunluğu: " + getKenar() + "\nAlan: " + getArea() + "\nHacim: " + getVolume();
	}
	
	
	
	
	

}
