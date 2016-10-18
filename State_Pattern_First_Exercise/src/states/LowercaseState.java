package states;

public class LowercaseState implements State {
	
	String m;
	public void printData(Writer writer, String message) {
		System.out.println(message.toLowerCase());
		writer.setState(new LowercaseState());
	}
}
