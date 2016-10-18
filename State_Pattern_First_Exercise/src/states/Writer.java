package states;

public class Writer {

	private State state;
	
	public Writer(){
		state = new UppercaseState();
	}
	void printMessage(String m){
		state.printData(this,m);
	}
	public void setState(State state){
		this.state = state;
	}
}
