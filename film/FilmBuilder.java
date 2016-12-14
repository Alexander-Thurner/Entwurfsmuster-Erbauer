package film;


/*
 * Diese Klasse hier kommt dem Erbauer gleich, somit
 * spezifiziert er die abstrakte Schnittstelle zur
 * Erzeugung der Teile eines komplexen Objektes
 */

public interface FilmBuilder 
{
	public void addJahr(int jahr);
	public void entscheideRealfilm (boolean realfilm);
	public void addGenre(String genre);
	public void addLandschaft(String landschaft);
	public void addSprache(String sprache);
	public void addBewertung(double bewertung);
	
	
	
	
}
