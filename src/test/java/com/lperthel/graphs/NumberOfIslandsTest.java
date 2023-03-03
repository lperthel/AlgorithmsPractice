package com.lperthel.graphs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {
private NumberOfIslandsDFS solution = new NumberOfIslandsDFS();
	@Test
	void testExample2() {
		char[][] grid = {{'1','1','0','0','0'},
			{'1','1','0','0','0','1'},
				{'0','0','1','0'},
					{'0','0','0','1','1'},
						{'0','0','0','0','0'}};
					int expected = 4;
					int actual = solution.numIslands(grid);
					assertEquals(expected,actual);
				}
			}