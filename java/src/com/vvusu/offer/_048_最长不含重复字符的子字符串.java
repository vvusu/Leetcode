package com.vvusu.offer;

import java.util.Arrays;

public class _048_最长不含重复字符的子字符串 {

	public int longestSubStringWithoutDuplication(String str) {
	    int curLen = 0;
	    int maxLen = 0;
	    int[] preIndexs = new int[26];
	    Arrays.fill(preIndexs, -1);
	    
	    for (int curI = 0; curI < str.length(); curI++) {
	        int c = str.charAt(curI) - 'a';
	        int preI = preIndexs[c];
	        if (preI == -1 || curI - preI > curLen) {
	            curLen++;
	        } else {
	            maxLen = Math.max(maxLen, curLen);
	            curLen = curI - preI;
	        }
	        preIndexs[c] = curI;
	    }
	    maxLen = Math.max(maxLen, curLen);
	    return maxLen;
	}
}
