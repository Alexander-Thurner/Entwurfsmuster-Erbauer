public class Pferd 
{
	
	/*wenn ein Konstruktor zu überfüllt ist nennt man das 
	 * Telescoping Construtor Pattern
	 *  --> siehe Affen.java
	 *  Am besten kann man dies mit einem Erbauer auflösen
	*/
		    
	
	private int groesse;
	private int alter;
	private String farbe;
	private String herkunft;
	
	public int gibGröße()
	{
		return groesse;
	}
	
	public int gibAlter()
	{
		return alter;
	}
	
	public String gibFarbe()
	{
		return farbe;
	}
	
	public String gibHerkunft()
	{
		return herkunft;
	}
	
	


	
	
	public static class Builder
	{
		//diese Variablen müssen gesetzt werden
		private final int groesse;
		private final int alter;
		
		//diese Variablen sind optional
		private String herkunft;
		private String farbe;
		
		//In diesem Konstruktor befindet sich jede verpflichtende Variable (die anderen sind Optional)
		public Builder(int groesse, int alter)
		{
			this.groesse = groesse;
			this.alter = alter;
		}
		//Hier werden die restlichen Variablen definiert
		public Builder herkunft(String herkunft)
		{
			this.herkunft = herkunft;
			return this;
		}
		
		public Builder farbe(String farbe)
		{
			this.farbe = farbe;
			return this;
		}
		
		
		public Pferd build()
		{
			return new Pferd(this);
		}
		
	}
	
	/* hier auf Private gesetzt, damit das Objekt
	 * nicht über den Pferd-Konstruktor instanziert wird
	 */
	private Pferd(Builder builder)
	{
		this.groesse = builder.groesse;
		this.alter = builder.alter;
		this.herkunft = builder.herkunft;
		this.farbe = builder.farbe;
	}	
	
	 public String toString() {
	        return "Das Pferd hat folgende Daten: "+this.groesse+", "+this.alter+", "+this.herkunft+", "+this.farbe;
	    }
	
}


