
public class Tetrahedron extends ThreeDimensionalShape{
	
	private double uzunluk;
	
	public Tetrahedron(String isim, double uzunluk) 
	{
		super(isim);
		this.uzunluk = uzunluk;
	}

	public double getUzunluk() 
	{
		return uzunluk;
	}

	public void setUzunluk(double uzunluk) 
	{
		this.uzunluk = uzunluk;
	}

	@Override
	public double getArea()
	{
		return Math.pow(uzunluk, 2) * Math.sqrt(3);
	}

	@Override
	public double getVolume() 
	{
		return (Math.pow(uzunluk, 3) * Math.sqrt(2)) / 12;
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nŞeklin adı: " + getIsim() + " \nKenar uzunluğu: " + getUzunluk() + "\nAlan: " + getArea() + "\nHacim: " + getVolume();
	}
	
	

	
	
	
	

}
