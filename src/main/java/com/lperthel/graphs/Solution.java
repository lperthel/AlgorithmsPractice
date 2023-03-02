package com.lperthel.graphs;

import java.util.function.BiPredicate;

class Solution {
	private int myColor;
	private int [][] image;
	private int newColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        myColor = image[sr][sc];
        newColor = color;
        fill(sr,sc);
    return this.image;
    }
	private void fill(int row, int col) {
BiPredicate<Integer,Integer> isMyColor = (Integer r,Integer c)-> image[r][c] == myColor;
		image[row][col] = newColor;
		if(row-1>=0 && col<image[row-1].length && isMyColor.test(row-1,col)) 
			fill(row-1,col);
			if(col+1<image[row].length && isMyColor.test(row,col+1))
				fill(row,col+1);
			if(row+1<image.length && col<image[row+1].length && isMyColor.test(row+1,col))
				fill(row+1,col);
			if(col-1<=0 && isMyColor.test(row,col-1))
				fill(row,col-1);
		}
	}