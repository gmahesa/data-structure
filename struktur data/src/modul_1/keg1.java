package modul_1;

import java.util.Arrays;

public class keg1 {

	public int n = 10;
	public int[] TabInt = new int[n];
	public int[] temp;

	public int[] getTabInt() {
		return TabInt;
	}

	public void setTabInt(int[] j) {
		for (int i = 0; i < TabInt.length; i++) {
			TabInt[i] = i + 1;
		}
		TabInt = j;
	}

	public void InsertAtIndex(int idx, int v) {
		TabInt = new int[n + 1];
		setTabInt(TabInt);
		int a = TabInt.length - 1; // length = 10 >>>> a = 10 -1 = 9;
		for (int i = idx; i < TabInt.length; i++) {
			TabInt[a] = TabInt[a - 1];
			a--;
		}
		TabInt[idx] = v;
		temp = TabInt;
	}

	public void RemoveAtIndex(int inx) {
		TabInt = new int[n - 1];
		setTabInt(temp);
		for (int i = inx; i < TabInt.length; i++) {
			if (i != (TabInt.length - 1)) {
				TabInt[i] = temp[i + 1];
			}
		}
		TabInt = Arrays.copyOf(temp, (temp.length - 1));
	}

	public void GetIndex(int inx) {
		setTabInt(temp);
		int i;
		for (i = 0; i < TabInt.length; i++) {
			if (TabInt[i] == inx) {
				System.out.println(i);
				break;
			}
		}
		if (i == TabInt.length) {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		keg1 k1 = new keg1();
		k1.InsertAtIndex(1, 100);
		for (int element : k1.TabInt) {
			System.out.println(element);
		}
		System.out.println("\n====batas====\n");
		k1.RemoveAtIndex(8);
		for (int element : k1.TabInt) {
			System.out.println(element);
		}
		System.out.println("\n====batas====\n");
		k1.GetIndex(100);
	}
}