package factory;

public class Solution {

	public static void main(String[] args) throws NoSuchAnimalException, NoSuchStuffException {
		SpeciesFactory f = AnimalFactory.getAnimalFactory("Reptile");
		Animal a = f.getAnimal("Glo");
		a.makeSound();
	}

}
