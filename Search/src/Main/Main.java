package Main;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import Utils.Node;
import Utils.Problem;
import Utils.State;
import Main.Init;
import Search.BreathFirstSearch;
import Search.DepthFirstSearch;
import Search.UniformCostSearch;

/**
 * Basic Search Algorithms.
 * 
 * Check ReadMe for details on this program and on how to use it.
 * 
 * Authors/Students Numbers: 
 * 			Dieinison Jack Freire Braga / 368339
 * 			Maria Tassiane Barros de Lima / 391052
 * 			Yago da Cruz Ignacio
 * 
 * Institution: 
 * 			Federal University of Ceará, Campus Quixadá 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Read problem from a file
        String[] search_problem = ReaderFile.readFromFile(args[1]);

        // Problem to solve
		State initialState = new State(search_problem[0]); 
		State finalState = new State(search_problem[1]);
		Problem problem = new Problem(initialState, finalState); 
		HashMap<String, Node> mapRomania = Init.initMap();
        
		if(args[0].equals("bfs")){
			ArrayList<Node> solutionBFS = BreathFirstSearch.bfs(problem, mapRomania);
			Collections.reverse(solutionBFS);
			System.out.println("***************Breadth First Search***************");
			System.out.print("The path from source to destination is: \n");
			System.out.print("[ ");
			for(Node a: solutionBFS){
				System.out.print( a.getState().getDescription()  + " " );
			}
			System.out.println("]");
		
		}else if(args[0].equals("dfs")){
			ArrayList<Node> solutionDFS = DepthFirstSearch.dfs(problem, mapRomania);
			Collections.reverse(solutionDFS);
			System.out.println("***************Depth First Search***************");
			System.out.print("The path from source to destination is: \n");
			System.out.print("[ ");
			for(Node a: solutionDFS){
				System.out.print( a.getState().getDescription()  + " " );
			}
			System.out.println("]");
			
		}else if(args[0].equals("ucs")){
			ArrayList<Node> solutionUCS = UniformCostSearch.ufs(problem, mapRomania);
			Collections.reverse(solutionUCS);
			System.out.println("***************Uniform Cost Search***************");
			System.out.print("The path from source to destination is: \n");
			System.out.print("[ ");
			for(Node a: solutionUCS){
				System.out.print( a.getState().getDescription()  + " " );
			}
			System.out.println("]");
    	}
	}

}
