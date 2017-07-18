package vietho.vn;

public class VietHoListImpl implements VieHoList {

	private int values[] = new int[5];

	public void append(int ele) {
		int temp[] = new int[values.length  + 1];
		for (int i = 0; i < values.length; i++) {
			temp[i] = values[i];
		}
		
		temp[values.length + 1] = ele;
		values = temp;
	}

	public void remove() {
		int temp[] = new int[values.length - 1];
		for (int i = 0; i < values.length - 1; i++) {
			temp[i] = values[i];
		}

		values = temp;
	}

	public void removeAll() {
		values = new int[0];
	}
	
	public int[] values() {
		return values;
	}
}
