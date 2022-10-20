package ie.atu.sw;

public class test {
	public static void main(String[] args) {
		Output outputScreen = new Output();
		
		// declare each thread and pass it the word to use and the shared output screen
		DisplayThread t1 = new DisplayThread(outputScreen,1,"My");
		DisplayThread t2 = new DisplayThread(outputScreen,2,"Name");
		DisplayThread t3 = new DisplayThread(outputScreen,3,"Is");
		DisplayThread t4 = new DisplayThread(outputScreen,4,"Bob");
		
		// run each thread
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
