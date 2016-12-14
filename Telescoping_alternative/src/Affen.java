
class Affen 
{
	int groesse;
	int alter;
	String farbe;
	String herkunft;
	
	//Hier herrscht das Telescoping Constructor Pattern
	public Affen(int groesse, int alter, String farbe, String herkunft)
	{
		this.groesse = groesse;
		this.alter = alter;
		this.farbe = farbe;
		this.herkunft = herkunft;
		System.out.println(groesse + alter + farbe + herkunft);
		
	}
	
}
