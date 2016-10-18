package factory;

public class NoSuchStuffException extends Exception {
	public String getMessage(){
		return "No Such Stuff";
	}
}
