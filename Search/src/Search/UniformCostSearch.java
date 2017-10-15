package Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

import Utils.Action;
import Utils.Node;
import Utils.NodeComparator;
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

public class UniformCostSearch extends BlindSearch {
	
	final static int NUM_OF_CITIES = 20;
	
	public static ArrayList<Node> ufs(Problem problem, HashMap<String, Node> map) {
		Node node = map.get(problem.getInitialState().getDescription());
		node.updatePathCost(0);
		node.updateDad(node);
		
		NodeComparator comparator = new NodeComparator();
		Queue<Node> border = new PriorityQueue<Node>(NUM_OF_CITIES, comparator);
		
		border.add(node);
		ArrayList<Node> exploreds = new ArrayList<Node>();
		
		while (!border.isEmpty()) {
			if(border.isEmpty()) 
				return null;
			if(node.getState().getDescription().equals(problem.getFinalState().getDescription()))
				return backtracking(node);
			node = border.remove();
			exploreds.add(node);
			for(Action action: node.getAdjAction()){
				Node son = createNode(node, action, map);
				if(!inExploreds(exploreds, son)) {
					border.add(son);
				} else {
					Node temp = updateNode(exploreds, node);
					if(temp != null) {
						border.remove(son);
						border.add(temp);
					}
				}
			}
		}
		return exploreds;
	}
	
}
