
public class Triangle extends TwoDimensionalShape {

	// Üçgenin alan hesabı için gerekli değişkenler tanımlanır.
	
	private double taban;
	private double yukseklik;
	
	// Ve constructor oluşturulur.
	
	public Triangle(String isim, double taban, double yukseklik) 
	{
		super(isim);
		this.taban = taban;
		this.yukseklik = yukseklik;
	}

	// TwoDimensionalShape'ten extend edilen getArea() metodu alınır.
	
	@Override
	public double getArea() 
	{
		return (taban * yukseklik) / 2;
	}

	// get() ve set() metodları.
	
	public double getTaban() {
		return taban;
	}

	public void setTaban(double taban) {
		this.taban = taban;
	}

	public double getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}
	
	
	@Override
	public String toString()
	{
		return super.toString() + "\nŞekil adı:" + getIsim() + " \nTaban uzunluğu: " + getTaban() + " \nYükseklik uzunluğu: " + getYukseklik() +"\nAlan: " + getArea();
 	}
	
	
	
	
	
	
	
	
	
	
}
