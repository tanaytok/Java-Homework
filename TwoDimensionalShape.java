
public abstract class TwoDimensionalShape extends Shape {

	// Constructor kurulur.
	
	public TwoDimensionalShape (String isim)
	{
		super(isim);
	}

	// Soruda iki boyutlu şekiller için istenen getArea() metodu soyut bir metod olarak yazılır.
	// Çünkü bu metod sadece 2 boyutlu şekiller için geçerlidir ve her alan hesabı her şekil için aynı değildir.
	// Şekil sınıfları içerisinde hepsinin ayrı formülleri olacak.
	
	public abstract double getArea();
	
	@Override
	public String toString()
	{
		return super.toString() + "iki boyutlu bir şekildir. ";
	}
	
	
	
	
	
}
