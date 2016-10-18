package observer;

import java.util.*;

public class StorageObserver implements Observer{
	ArrayList<Integer> n = new ArrayList<Integer>();
	public void processData(int x){
		n.add(x);
		for(Integer z: n){
			System.out.print(z+" ");
		}
		System.out.println();
	}
}
