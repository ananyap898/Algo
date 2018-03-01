package com.tumblr.maze;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Step 1 : accept from the argument , then read the maze.  [DONE]
 * Step 2 : assign all the characters into the StringBuffer [DONE]
 * Step 3 : calculate total no. of rows,columns ; determine index of I ; [DONE]
 * Step 4 : write a recursive method, calculate the value [r*c + c], assign r,l,u, and d [DONE]
 * Step 5 : create path within the maze by marking dot , traverse until exit gate [O] is found.
 * Step 6 : Lambda Expression
 * 
 * @author meethunpanda
 *
 */

public class MazeShortestPathTraversalTest {

	private static char[][] maze;
	private static int colStartIndex, rowStartIndex, totalRows, totalColumns;
	private static StringBuffer sb = null;
	private static StringBuffer value = new StringBuffer();

	interface MathOperation {
	      int operation(int a, int b);
	   }
	
	public static void main(String[] args) throws IOException {
		InputStream f = new FileInputStream(args[0]);
		String[] lines = readMazes(f);

		sb = new StringBuffer();

		for (String s : lines) {
			sb.append(s);
			totalRows++;
		}
		
		totalColumns = sb.length() / totalRows;
		maze = new char[totalRows][totalColumns];

		// System.out.println("StringBuffer values -->" + sb.toString());
		//System.out.println("Total Rows -->" + totalRows + "; Total Columns -->" + totalColumns);

		int m = 0;

		for (int i = 0; i < totalRows; i++) {
			for (int j = 0; j < totalColumns; j++) {
				maze[i][j] = sb.charAt(m++);
			}
		}

		findTheEntrance();
		//System.out.println("Entrance is located at Row Index -- > " + rowStartIndex + ", and Column Index --> " + colStartIndex);
		
		findTheShortestPath(rowStartIndex, colStartIndex);
	}

	/**
	 * This recursive methos basically helps determine the shortestPath.
	 * @param rowIndex
	 * @param colIndex
	 * @return boolean
	 */
	private static boolean findTheShortestPath(int rowIndex, int colIndex) {
		value.append((rowIndex * totalColumns) + colIndex + "-");
		char right = 0, left = 0, up = 0, down = 0;

		if ((totalColumns - 1) != colIndex) {
			right = maze[rowIndex][colIndex + 1];
		}
		if (colIndex != 0) {
			left = maze[rowIndex][colIndex - 1];
		}
		if (rowIndex != 0) {
			down = maze[rowIndex - 1][colIndex];
		}
		if (rowIndex != (totalRows - 1)) {
			up = maze[rowIndex + 1][colIndex];
		}

		if (right == 'O' || left == 'O' || up == 'O' || down == 'O') {
			maze[rowIndex][colIndex] = '.';
			value.append(((rowIndex + 1) * totalColumns) + colIndex);

			
			/*for (int i = 0; i < totalRows; i++) {
				for (int j = 0; j < totalColumns; j++) {
					System.out.print(maze[i][j]);
				}
				System.out.println();
			}*/
			 
			System.out.println(value.toString());
			return true;
		}

		boolean isFound = false;

		if (maze[rowIndex][colIndex] != 'I') {
			maze[rowIndex][colIndex] = '.';
		}
		if (right == ' ' && !isFound) {
			isFound = findTheShortestPath(rowIndex, colIndex + 1);
		}
		if (left == ' ' && !isFound) {
			isFound = findTheShortestPath(rowIndex, colIndex - 1);
		}
		if (up == ' ' && !isFound) {
			isFound = findTheShortestPath(rowIndex + 1, colIndex);
		}
		if (down == ' ' && !isFound) {
			isFound = findTheShortestPath(rowIndex - 1, colIndex);
		}
		if (!isFound) {
			maze[rowIndex][colIndex] = ' ';
		}

		return isFound;
	}

	/**
	 * Determining the index of the entrance gate : I
	 */
	private static void findTheEntrance() {
		for (int i = 0; i < totalRows; i++) {
			for (int j = 0; j < totalColumns; j++) {
				if (maze[i][j] == 'I') {
					rowStartIndex = i;
					colStartIndex = j;

				}
			}
		}

	}

	/**
	 * read the maze
	 * 
	 * @param f
	 * @return
	 * @throws IOException
	 */
	private static String[] readMazes(InputStream f) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(f, "UTF-8")); // US-ASCII
		List<String> lines = new ArrayList<String>();
		String line;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}

		return lines.toArray(new String[0]);
	}
}


// OUTPUT(sample)  : 9-8-7-6-11-16-21
// OUTPUT(sample1) : 11-32-33-34-55-76-77-78-57-36-37-38-59-80-81-82-103-124-145-166-165-164-143-122-121-120-141-162-161-160-159-158-137-116-117-118-115-114-135-156-177-198-199-200-201-202-223-244-265-286-307-328-329-330-351-372-309-288-267-246-225-204-327-326-305-284-263-242-241-240-239-238-237-236-215-194-195-196-175-154-61-40-53-74-73-72-51-30-29-28-27-26-25-24-23-22-43-64-65-66-67-68-69-70-91-112-111-110-131-152-151-150-149-148-169-190-191-192-213-234-233-232-253-274-275-276-297-318-339-360-361-362-359-358-379-400-401-402-403-404-405-406-407-408-409-410-431
// OUTPUT(sample2) : 63-64-65-66-67-68-89-110-109-108-107-106-127-148-149-150-171-192-213-234-235-236-237-238-259-280-301-322-343-364-385-406-405-404-403-402-401-400-379-358-337-316-295-274-253-232-255-276-277-278-299-320-319-318-339-360-361-362-169-190-43-22-23-24-25-26-27-28-49-70-91-112-113-114-93-72-51-30-31-32-33-34-55-76-97-118-119-120-141-162-163-164-143-122-101-80-81-82-103-124-145-166-187-208-207-206-227-248-269-290-291-292-313-334-333-332-353-374-373-372-371-370-369-368-367-366-387-408-409-410-411-412-413-414-415-416-417-418-439
