package com.lperthel.datastructures;

public class ContainerWithMostWater {
public int maxArea(int[] height) {
	int left = 0,right = height.length -1, max = 0;
	while(right >left) {
		int area = calcArea(height, left, right);		
		max = Math.max(area,max);
		if(height[left] >height[right])
			right--;
		else
			left++;
	}
	return max;
}

private int calcArea(int[] height, int left, int right) {
	return Math.min(height[right],height[left]) * (right-left);
}
}
