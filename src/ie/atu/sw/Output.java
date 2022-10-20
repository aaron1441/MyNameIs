package ie.atu.sw;

public class Output {
	// private variable state to choose which thread to run
	private int state=1;
	
	// synchronized methods to display the words
	// these methods are synchronized so that they display the words in the correct order
	// it can be written like this but this is rather long and alot of methods
	public synchronized void displayWord1(String msg) {
		// if the state is not 1 then wait
		while(state!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//  if the state is 1 then print the message
		System.out.println(msg);
		// set the state to 2
		state=2;
		// wake any methods that are waiting
		notifyAll();
	}
	public synchronized void displayWord2(String msg) {
		while(state!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		state=3;
		notifyAll();
	}
	public synchronized void displayWord3(String msg) {
		while(state!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		state=3;
		notifyAll();
	}
	public synchronized void displayWord4(String msg) {
		while(state!=4) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		state=4;
		notifyAll();
	}
	
	//  this method 
	public synchronized void display(String msg, int Desiredstate)
	{
		while(state != Desiredstate)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			//System.out.println("Here");
			System.out.println(msg);
			state = state +1;
			
			if(state==5)
				state = 1;
			
			notifyAll();
		}
}
