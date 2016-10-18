package factory;

public class MammalFactory implements SpeciesFactory {

	public Animal getAnimal(String s) throws NoSuchAnimalException{

		if(s.equals("Cat")){
			return new Cat();
		}
		if(s.equals("Dog")){
			return new Dog();
		}
		else
		throw new NoSuchAnimalException();
		}
}
