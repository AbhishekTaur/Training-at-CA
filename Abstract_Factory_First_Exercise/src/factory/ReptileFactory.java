package factory;

public class ReptileFactory implements SpeciesFactory {

	public Animal getAnimal(String s) throws NoSuchAnimalException {
		if(s.equals("Snake")){
			return new Snake();
		}
		if(s.equals("Crocodile")){
			return new Crocodile();
		}
		throw new NoSuchAnimalException();
	}

}
