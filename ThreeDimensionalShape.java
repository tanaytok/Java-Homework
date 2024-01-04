
public abstract class ThreeDimensionalShape extends Shape {

	// Constructor kurulur.
	
	public ThreeDimensionalShape(String isim)
	{
		super(isim);
	}

	
	// getArea() ve getVolume() metodları yazılır.
	
	public abstract double getArea();
	public abstract double getVolume();
	
	@Override
	public String toString() 
	{
		return super.toString() + "üç boyutlu bir şekildir. ";
	}
	
	
	
}
