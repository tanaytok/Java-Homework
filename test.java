
public class test {

	public static void main(String[] args) 
	{
		
		Shape sh = new Shape("Şekil");
		System.out.println(sh.toString());
		System.out.println("----------------------------------------------------------------");
		
		Triangle tr = new Triangle("Üçgen",5,12);
		System.out.println(tr.toString());
		System.out.println("----------------------------------------------------------------");
		
		Square sq = new Square("Kare",6);
		System.out.println(sq.toString());
		System.out.println("----------------------------------------------------------------");

		Circle cr = new Circle("Daire",3);
		System.out.println(cr.toString());
		System.out.println("----------------------------------------------------------------");

		Cube cb = new Cube("Küp",2);
		System.out.println(cb.toString());
		System.out.println("----------------------------------------------------------------");

		Sphere sp = new Sphere("Küre",5);
		System.out.println(sp.toString());
		System.out.println("----------------------------------------------------------------");

		Tetrahedron tt = new Tetrahedron("Dört Yüzlü",6);
		System.out.println(tt.toString());
		System.out.println("----------------------------------------------------------------");


		
	}
}
