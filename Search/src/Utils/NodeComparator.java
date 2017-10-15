package Utils;

import java.util.Comparator;

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

public class NodeComparator implements Comparator<Node> {
	
	// auxiliar method for comparing nodes to priority queue
	
	@Override
	public int compare(Node a, Node b) {
		if (a.getPathCost() < b.getPathCost()) {
			return -1;
		}
		if (a.getPathCost() > b.getPathCost()) {
			return 1;
		}
		return 0;
	}
}
