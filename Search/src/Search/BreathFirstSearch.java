package Search;

import java.util.ArrayList;
import java.util.HashMap;

import Utils.Action;
import Utils.Node;
import Utils.Problem;

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

public class BreathFirstSearch extends BlindSearch {
	
	public static ArrayList<Node> bfs(Problem problem, HashMap<String, Node> map) {
		Node node = map.get(problem.getInitialState().getDescription());
		node.updatePathCost(0);
		node.updateDad(node);
		ArrayList<Node> exploreds = new ArrayList<Node>();
		
		ArrayList<Node> border = new ArrayList<Node>();
		
		if(node.getState().getDescription().equals(problem.getFinalState().getDescription()))
			return backtracking(node);
		
		border.add(node);
		while (!border.isEmpty()) {
			if(border.isEmpty()) 
				return null;
			node = border.remove(0);
			exploreds.add(node);
			for(Action action: node.getAdjAction()){
				Node son = createNode(node, action, map);
				if(!inExploreds(exploreds, son)) {
					if(son.getState().getDescription().equals(problem.getFinalState().getDescription())) {
						return backtracking(son);
					}
				}
				border.add(son);
			}
		}
		return exploreds;
	}
	
}
