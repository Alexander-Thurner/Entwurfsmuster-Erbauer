package film;

//Diese Klasse hier repräsentiert "Produkt" vom Erbauer Entwurfsmuster

public class Film
{
	public int jahr;
	public boolean realfilm;
	public String genre;
	public String landschaft;
	public String sprache;
	public double bewertung;
	
	public int getJahr()
	{
		return jahr;
	}
	
	public boolean getrealfilm()
	{
		return realfilm;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public String getLandschaft()
	{
		return landschaft;
	}
	
	public String getSprache()
	{
		return sprache;
	}
	
	public double getBewertung()
	{
		return bewertung;
	}
	
	

	


	/*
	 * bei der If-Anweisung ändert sich lediglich das Wort "kein" oder "ein", 
	 * je nachdem ob es ein Realfilm ist oder nicht
	 */
	public String toString()
	{
		if(realfilm == false)
		{
		return "Erscheinungsjahr: " + jahr + " Der Film ist kein Realfilm.  Das Genre ist: " + genre + ", spielt in folgender Landschaft: " + landschaft + ". Die Personen im Film sprechen folgende Sprache: " + sprache + " und die Bwertung des Filmes ist: " + bewertung;
		}
		
		else
		{
		return "Erscheinungsjahr: " + jahr + " Der Film ist ein Realfilm.  Das Genre ist: " + genre + ", spielt in folgender Landschaft: " + landschaft + ". Die Personen im Film sprechen folgende Sprache: " + sprache + " und die Bwertung des Filmes ist: " + bewertung;
		}
	}
	
}
