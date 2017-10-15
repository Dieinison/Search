package Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

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

public class DepthFirstSearch extends BlindSearch {
	
	public static ArrayList<Node> dfs(Problem problem, HashMap<String, Node> map){
		Node node = map.get(problem.getInitialState().getDescription());
		node.updatePathCost(0);
		node.updateDad(node);
		ArrayList<Node> exploreds = new ArrayList<Node>();
		
		Stack<Node> border = new Stack<Node>();
		
		if(node.getState().getDescription().equals(problem.getFinalState().getDescription()))
			return backtracking(node);
		
		border.push(node);
		while (!border.empty()) {
			if(border.empty()) 
				return null;
			node = border.pop();
			exploreds.add(node);
			for(Action action: node.getAdjAction()){
				Node son = createNode(node, action, map);
				if(!inExploreds(exploreds, son)) {
					if(son.getState().getDescription().equals(problem.getFinalState().getDescription())) {
						return backtracking(son);
					}
				}
				border.push(son);
			}
		}
		return exploreds;
	}
	
}
