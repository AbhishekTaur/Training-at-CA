package states;

public class UppercaseState implements State {

	String m;
	
	public void printData(Writer writer, String message) {
		System.out.println(message.toUpperCase());
		writer.setState(new LowercaseState());
	}

}
