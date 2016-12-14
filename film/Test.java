package film;


/*
 * Existiert nur um kurz die Ausgabe zu testen
 * 
 */
public class Test
{
	public static void main(String[]args)
	{
		FilmConcreteBuilder pets = new FilmConcreteBuilder();
		FilmDirector dir = new FilmDirector();
		dir.dreheFilm(pets);
		
		Film film = pets.getFilm();
		System.out.println(film.toString());
	}
}
