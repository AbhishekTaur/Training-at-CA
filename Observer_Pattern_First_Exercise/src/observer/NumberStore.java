package observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class NumberStore implements Store{
	
	Set<Observer> ob;
	int x;
	
	public void addObserver(Observer o){
		ob.add(o);
	}
	public NumberStore(int x){
		ob = new HashSet<Observer>();
		this.x = x;
	}
	public void removeObserver(Observer o){
		ob.add(o);
	}
	public void doNotify(){
		Iterator<Observer> it = ob.iterator();
		while (it.hasNext()) {
			Observer numberObserver = it.next();
			numberObserver.processData(x);
		}
	}
	public void setNumber(int New){
		this.x=New;
		doNotify();
	}
	
}
