package com.lperthel.graphs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfIslandsUnionFindTest {
private NumberOfIslandsUnionFind solution = new NumberOfIslandsUnionFind();
	@Test
	void testExample2() {
		char[][] grid = {{'1','1','0','0','0'},
			{'1','1','0','0','0'},
				{'0','0','1','0','0'},
					{'0','0','0','1','1'}};
					int expected = 3;
					int actual = solution.numIslands(grid);
					assertEquals(expected,actual);
				}
			}