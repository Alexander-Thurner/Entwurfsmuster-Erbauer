public class Main 
{
	public static void main(String[]args)
	{
		Pferd pferd = new Pferd.Builder(160, 5).herkunft("�sterreich").farbe("Blau").build();
		
		System.out.println(pferd);
	}
	
}
