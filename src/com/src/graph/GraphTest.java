package com.src.graph;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter graph input file name: ");
		String file = sc.nextLine();
		Graph graph = new Graph("/Users/meethunpanda/Documents/Java Programming/workspace/Algorithm/src/com/src/graph/friends.txt");
		graph.print();

	}

}
