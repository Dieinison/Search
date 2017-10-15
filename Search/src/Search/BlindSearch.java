package Search;

import java.util.ArrayList;
import java.util.HashMap;

import Utils.Action;
import Utils.Node;

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

public class BlindSearch {
	
	//verify if a node is in exploreds
	public static boolean inExploreds(ArrayList<Node> exploreds, Node node) {
		for(Node a: exploreds) {
			if(node.getState().getDescription().equals(a.getState().getDescription()))
				return true;
		}
		return false;
	}
	
	// initialize a node
	public static Node createNode(Node node, Action act, HashMap<String, Node> map) {
		Node n = new Node();
		n.updateState(act.getDestine().getState()); 
		n.updatePathCost(node.getPathCost() + act.getCost());
		n.updateDad(node);
		
		ArrayList<Action> neighborhood = new ArrayList<Action>();
		Node temp = new Node();
		
		temp = map.get(act.getDestine().getState().getDescription());
		neighborhood = temp.getAdjAction();
		
		for(Action a: neighborhood) {
			if(a.getDestine().getState().getDescription() != act.getOrigin().getState().getDescription()) {
				n.addRoad(a);
			}
		}
		return n;
	}
	
	//backtrack to take the solution
	public static ArrayList<Node> backtracking(Node n){
		ArrayList<Node> solution = new ArrayList<Node>();		
		while(n.getState().getDescription() != n.getDad().getState().getDescription()) {
			solution.add(n);
			n = n.getDad();
		}
		solution.add(n.getDad());
		return solution;
	}
	
	//update node, only for UCS
	public static Node updateNode(ArrayList<Node> exploreds, Node node) {
		for(Node a: exploreds) {
			if(node.getState().getDescription() == a.getState().getDescription()) {
				if(node.getPathCost() < a.getPathCost()) {
					return node;
				}
			}		
		}
		return null;
	}
	
}
