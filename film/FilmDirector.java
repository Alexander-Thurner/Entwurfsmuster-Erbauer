package film;
/*
 * Der Film Direktor konstruiert ein komplexes Objekt
 * unter der Verwendung der Schnittstelle des Erbauers.
 * Arbeitet eng mit dem Erbauer zusammen
 * Entkoppelt den Kontruktionsablauf von Klienten
 */
public class FilmDirector 
{
	public void dreheFilm(FilmBuilder filmBuilder)
	{
		filmBuilder.addJahr(2016);
		filmBuilder.entscheideRealfilm(false);
		filmBuilder.addGenre("Kinder/Familie");
		filmBuilder.addLandschaft("Groﬂstadt");
		filmBuilder.addSprache("Deutsch");
		filmBuilder.addBewertung(6.7);
		
	}

}
