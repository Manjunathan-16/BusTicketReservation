
public class Bus {
	private int BusNo;
	private boolean ac;
	private int capacity;

	Bus(int no, boolean ac, int cap) {
		this.BusNo = no;
		this.ac = ac;
		this.capacity = cap;
	}

	public int getBusNo() {
		return BusNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int cap) {
		capacity = cap;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public void displayBusInfo() {
		System.out.println("Bus Number - " + BusNo + ", ac - " + ac + ", Capacity - " + capacity);
	}
}
