package factory;

public abstract class AnimalFactory{
	public static SpeciesFactory getAnimalFactory(String s) throws NoSuchStuffException{
		if(s.equals("Reptile")){
			return new ReptileFactory();
		}
		if(s.equals("Mammal")){
			return new MammalFactory();
		}
		throw new NoSuchStuffException();
		
	}
}
