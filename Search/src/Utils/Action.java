package Utils;

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

public class Action {
	private Node origin;
	private Node destine;
	private double cost;
	
	public Action() {}

	public Action(Node origin, Node destine, double cost) {
		this.origin = origin;
		this.destine = destine;
		this.cost = cost;
	}

	public Node getOrigin() {
		return origin;
	}

	public void setOrigin(Node origin) {
		this.origin = origin;
	}

	public Node getDestine() {
		return destine;
	}

	public void setDestine(Node destine) {
		this.destine = destine;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
