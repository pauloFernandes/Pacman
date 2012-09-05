import java.util.concurrent.Semaphore;

public class Semaforo {
	private Semaphore semaforo;
	
	public Semaforo(int initVal) {
		semaforo = new Semaphore(initVal);
	}

	public void up() {
		semaforo.release();
	}

	public void down() {
		try {
			semaforo.acquire();
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}
}