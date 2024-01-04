
public class Circle extends TwoDimensionalShape {

	private double yaricap;
	
	public Circle(String isim, double yaricap)
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
		return Math.PI * Math.pow(yaricap, 2);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nŞekil adı: " + getIsim() + " \nYarıçap uzunluğu: " + getYaricap() + "\nAlan: " + getArea();
	}
	
	
	
	

}
