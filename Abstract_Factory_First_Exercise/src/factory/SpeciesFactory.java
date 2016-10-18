package factory;

public interface SpeciesFactory {
	public Animal getAnimal(String s) throws NoSuchAnimalException;
}
