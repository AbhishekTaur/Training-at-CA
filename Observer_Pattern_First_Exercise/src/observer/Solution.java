package observer;

public class Solution {

	public static void main(String[] args) {
		NumberStore s = new NumberStore(0);
		StorageObserver storageO = new StorageObserver();
		DisplayObserver displayO = new DisplayObserver();
		s.addObserver(storageO);
		s.addObserver(displayO);
		s.setNumber(34);
		s.setNumber(45);
	}

}
