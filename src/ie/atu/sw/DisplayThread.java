package ie.atu.sw;

public class DisplayThread extends Thread {
	private Output shared;
	private int state;
	private String msg;
	
	public DisplayThread(Output o, int i, String m) {
		shared = o;
		state = i;
		msg = m;
	}
	
	public void run() {
		for(int i=0; i<20; i++) {
			shared.display(msg, state);
		}
	}
	
	
}
