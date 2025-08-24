package aulajava;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int x, y, z;
		x = 114;
		y = 17;
		z = 12;
		boolean r;
		r = (x < y ^ y < z) ? true : false;
		System.out.println(r);
	}

}
