
public  class Shape {

	private String isim;
	
	// Get ve Set fonksiyonları.

	public String getIsim() 
	{
		return isim;
	}

	public void setIsim(String isim) 
	{
		this.isim = isim;
	}
	
	// Constructor kurulur.
	
	public Shape(String isim)
	{
		this.isim = isim;
	}
	
	@Override
	public String toString() 
	{
		return "Bu şekil,";
	}
	
	
	
	
	
}
