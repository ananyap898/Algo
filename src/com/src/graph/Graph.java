package com.src.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {
	
	Vertex[] adjList;
	
	public Graph(String file) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File(file));
		adjList = new Vertex[scanner.nextInt()];
		
		// Read Vertices
		for(int i =0 ; i < adjList.length; i++){
			adjList[i]= new Vertex(scanner.next(), null);
		}
		
		// Read Edges
		while(scanner.hasNext()){
			
			// FInd index for the vertices by reading Vertices' name
			int v1 = indexForVertex(scanner.next());
			int v2 = indexForVertex(scanner.next());
			
			adjList[v1].adjList = new Neighbour(v2, adjList[v1].adjList);
			adjList[v2].adjList = new Neighbour(v1, adjList[v2].adjList);
			
		}
		
		
	}

	private int indexForVertex(String name) {
		for(int v=0; v< adjList.length; v++){
			if(adjList[v].vertexName.equals(name)){
				return v;
			}
		}
		return -1;
	}

	public void print() {
		 System.out.println();
	        for (int v=0; v < adjList.length; v++) {
	            System.out.print(adjList[v].vertexName);
	            for (Neighbour nbr=adjList[v].adjList; nbr != null;nbr=nbr.next) {
	                System.out.print(" --> " + adjList[nbr.vertexNum].vertexName);
	            }
	            System.out.println("\n");
	        }
		
	}
	
	
	

}


class Neighbour{
	public int vertexNum;
	public Neighbour next;
	public Neighbour(int vertexNum, Neighbour next) {
		super();
		this.vertexNum = vertexNum;
		this.next = next;
	}
}

class Vertex{
	public String vertexName;
	public Neighbour adjList;
	public Vertex(String vertexName, Neighbour adjList) {
		super();
		this.vertexName = vertexName;
		this.adjList = adjList;
	}
	
}
