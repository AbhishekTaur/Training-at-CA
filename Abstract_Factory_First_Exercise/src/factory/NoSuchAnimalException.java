package factory;

public class NoSuchAnimalException extends Exception {
	public String getMessage(){
		return "No Animal";
	}
}
