package com.tumblr.maze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeTraversalTest {
	
	
	private char[][] maze;
	private int colStart , rowStart, rows, columns, totalRows, totalColumns;
	
	public MazeTraversalTest(String fileName){
		try {
			Scanner scanner = new Scanner(new File(fileName));
			StringBuilder sb = new StringBuilder();
			while(scanner.hasNext()){
				sb.append(scanner.nextLine());
				this.rows++;
			}
			
			this.columns = sb.length() / this.rows;
			this.maze = new char[this.rows][this.columns];
			
			this.totalRows = this.rows;
			this.totalColumns = this.columns;
			
			int m=0;
			
			
			for(int i=0 ; i<this.rows ; i++){
				for(int j=0 ; j<this.columns ; j++){
					this.maze[i][j] = sb.charAt(m++);
				}
			}
			scanner.close();
			findStart();
			solve(this.rowStart , this.colStart);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*for(int i=0 ; i<this.rows ; i++){
			for(int j=0 ; j<this.columns ; j++){
				System.out.print(this.maze[i][j]);
			}
			System.out.println();
		}*/
		
	}

	private boolean solve(int row, int col) {
		
		char right = 0, left = 0, up =0, down =0 ;
		
		if((this.totalColumns - 1) != col){
			right = this.maze[row][col + 1];
		}
		if(col != 0){
			left = this.maze[row][col - 1];
		}
		if(row != 0){
			up = this.maze[row - 1][col];
		}
		if(row != (this.totalRows - 1)){
			down = this.maze[row + 1][col];
		}
		
		
		if(right == 'O' || left == 'O' || up == 'O' || down == 'O'){
			maze[row][col] = '.' ;
			
			for(int i=0 ; i< this.rows ; i++){
				for(int j=0 ; j< this.columns ; j++){
					System.out.print(this.maze[i][j]);
				}
				System.out.println();
			}
			
			return true;
		}
		
		boolean solved = false;
		if(this.maze[row][col] != 'I'){
			this.maze[row][col] = '.' ;
		}
		if(right == ' ' && !solved){
			solved = solve(row, col + 1);
		}
		if(down == ' ' && !solved){
			solved = solve(row + 1, col);
		}
		if(left == ' ' && !solved){
			solved = solve(row, col - 1);
		}
		
		if(up == ' ' && !solved){
			solved = solve(row - 1, col);
		}
		if(!solved){
			this.maze[row][col] = ' ' ;
		}
		
		return solved;
		
	}

	private void findStart() {
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				if(maze[i][j] == 'I'){
					 this.rowStart = i;
					 this.colStart = j;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		new MazeTraversalTest("/Users/meethunpanda/Documents/Java Programming/workspace/Algorithm/src/com/tumblr/maze/sample1.maze");

	}

}
