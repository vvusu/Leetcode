package com.vvusu.sort;

public class Insertion2<T extends Comparable<T>> extends Sort<T> {
	
	@Override
	protected void sort() {
		for (int begin = 1; begin < array.length; begin++) {
			int cur = begin;
			T v = array[cur];
			while(cur > 0 && cmp(v, array[cur - 1]) < 0) {
				swap(cur, cur-1);
				array[cur] = array[cur - 1];
				cur--;
			}
			array[cur] = v;
		}
	}
	
}
