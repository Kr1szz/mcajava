package P9;

import java.util.Scanner;

class Storage<T>{
	private T var1;
	public T getItem() {
		return var1;
	}
	public void setItem(T val) {
		var1 = val;
	}
}

public class Program9 {	
	public static <E> void printArray(E[] array) {
		for(E a:array) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Storage<Integer> sInt = new Storage<>();
		int ival = s.nextInt();
		s.nextLine();
		sInt.setItem(ival);
		System.out.println("Integer item: " + sInt.getItem());
		Storage<String> sStr = new Storage<>();
		String sval = s.nextLine();
		sStr.setItem(sval);
		System.out.println("String item: " + sStr.getItem());
		Integer[] iArr = new Integer[5];
		String[] sArr = new String[5];
		System.out.println("Enter Integer Values:");
		for(int i=0;i<5;i++) {
			iArr[i]=s.nextInt();
			s.nextLine();
		}
		System.out.println("Enter String Values:");
		for(int i=0;i<5;i++) {
			sArr[i]=s.nextLine();
		}
		System.out.println("Integer Array:");
		printArray(iArr);
		System.out.println("String Array:");
		printArray(sArr);
	}
}
