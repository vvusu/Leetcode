package com.vvusu.sort;

// ιζ©ζεΊ
public class Selection<T extends Comparable<T>> extends Sort<T> {
	
	@Override
	protected void sort() {
		for (int end = array.length - 1; end > 0; end--) {
			int maxIndex = 0;
			for (int begin = 1; begin <= end; begin++) {
				if (cmp(maxIndex, begin) <= 0) {
					maxIndex = begin;
				}
			}
			swap(maxIndex,end);
		}
	}
	
}