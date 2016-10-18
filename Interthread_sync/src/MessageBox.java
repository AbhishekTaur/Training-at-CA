public class MessageBox {
	String message;

	synchronized String get() {

		if (message == null)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Got: " + message);
		String x = message;
		message = null;
		notify();
		return x;
	} 

	synchronized void put(String message1) {
		if (this.message != null)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
			this.message = message1;
			System.out.println("Put: " + message1);
				//newMessage = true;
			notify();
		}
	} 
