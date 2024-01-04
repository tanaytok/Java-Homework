
public class Sphere extends ThreeDimensionalShape {

	private double yaricap;
	
	public Sphere(String isim, double yaricap)
	{
		super(isim);
		this.yaricap = yaricap;
	}

	public double getYaricap() 
	{
		return yaricap;
	}

	public void setYaricap(double yaricap) 
	{
		this.yaricap = yaricap;
	}

	@Override
	public double getArea()
	{
		return 4 * Math.PI * Math.pow(yaricap, 2);
	}

	@Override
	public double getVolume() 
	{
		return (4/3) * Math.PI * Math.pow(yaricap, 3);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nŞeklin adı: " + getIsim() + " \nYarıçap uzunluğu: " + getYaricap() + "\nAlan: " + getArea() + "\nHacim: " + getVolume();
	}
	
	
	
	
	
}
