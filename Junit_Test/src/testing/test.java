package testing;


import java.util.TreeSet;
public class test {

	public int maxCredit(int[] a, int[] b, int[] c, int[] d, int[] e) {
		int[][] arr = { a, b, c, d, e };
		int[] arr_num = { 0, 0, 0, 0, 0 };
		int count = 0;
		int n = 0;
		while (true) {
			TreeSet<Entry> set = new TreeSet<>();
			for (int j = 0; j < arr_num.length; j++) {
				if (arr_num[j] < arr[j].length) {
					set.add(new Entry(arr[j][arr_num[j]], j));
				}
			}
			if (set.size() < 3)
				break;
			else if (set.size() > 3)
				while (set.size() != 3)
					set.remove(set.last());
			if (set.last().time - set.first().time <= 1000) {
				count++;
				n = set.last().time + 1;

			} else {
				n++;
			}

			for (int j = 0; j < arr_num.length; j++) {
				while (arr_num[j] < arr[j].length && arr[j][arr_num[j]] < n)
					arr_num[j]++;
			}
		}
		return count;
	}

	static class Entry implements Comparable<Entry> {
		int time;
		int index;

		public Entry(int time, int index) {
//			super();
			this.time = time;
			this.index = index;
		}

		@Override
		public int compareTo(Entry o) {
			if (this.time == o.time)
				return this.index - o.index;
			return this.time - o.time;
		}

		@Override
		public String toString() {
			return "Entry [time=" + time + ", index=" + index + "]";
		}
	}

	  /*public static void main(String[] args) {
	    TreeSet<Entry> set = new TreeSet<>();
	    set.add(new Entry(1, 0));
	    set.add(new Entry(1, 1));
	    set.add(new Entry(1, 2));
	    System.out.println(set.size());
	  }*/
	}