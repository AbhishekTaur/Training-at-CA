package observer;

public interface Store {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void doNotify();
}
