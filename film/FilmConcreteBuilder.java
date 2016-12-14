package film;


/*
 * Diese Klasse hier ist die konkrete Erbauerklasse, sie
 * erzeugt die Teile des komplexen Objekts durch
 * Implementierung der Schnittstelle. Bietet im
 * Normalfall auch eine Schnittstelle zum Auslesen des Produktes
 * Jede einzelne Methode muss von FilmBuilder übernommen werden.
 */
public class FilmConcreteBuilder implements FilmBuilder
{
	public Film film = new Film();
	
	public void addJahr(int jahr)
	{
		film.jahr = jahr;
	}
	
	public void entscheideRealfilm (boolean realfilm)
	{
		film.realfilm = realfilm;
	}
	
	public void addGenre(String genre)
	{
		film.genre = genre;
	}
	
	
	public void addLandschaft(String landschaft)
	{
		film.landschaft = landschaft;
	}
	
	
	public void addSprache(String sprache)
	{
		film.sprache = sprache;
	}
	
	
	public void addBewertung(double bewertung)
	{
		film.bewertung = bewertung;
	}
	
	public Film getFilm()
	{
		return film;
	}
	
	
	
}
