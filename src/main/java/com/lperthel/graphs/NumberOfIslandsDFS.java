package com.lperthel.graphs;

import java.util.function.BiPredicate;

class NumberOfIslandsDFS {
	private int currentIsland = 0;
	private char[][] grid;
	public int numIslands(char[][] grid) {
		this.grid = grid;
for(int i = 0;i<grid.length;i++){
for(int j = 0;j<grid[i].length;j++) {
	if(grid[i][j] == '1') {
		currentIsland++;
		fill(i,j);
	}
}
}
return currentIsland;
}
	private void fill(int row, int col) {
		BiPredicate<Integer,Integer> isIsland = (Integer r,Integer c)-> grid[r][c] == '1';
				grid[row][col] = 'X';
				if(row-1>=0 && col<grid[row-1].length && isIsland.test(row-1,col)) 
					fill(row-1,col);
					if(col+1<grid[row].length && isIsland.test(row,col+1))
						fill(row,col+1);
					if(row+1<grid.length && col<grid[row+1].length && isIsland.test(row+1,col))
						fill(row+1,col);
					if(col-1>=0 && isIsland.test(row,col-1))
						fill(row,col-1);
				}
			}