package Utils;

import java.util.ArrayList;

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

public class Node {
	private double pathCost;
	private State state;
	private Node dad; //dad lower cost
	private ArrayList<Action> adjAction = new ArrayList<Action>(); //roads
	
	public Node() {}
	
	public Node(State state) {
		this.state = state;
		this.pathCost = 0.0;
	}
	
	public Node(float cost, State state, Node dad) {
		this.pathCost = 0.0;
		this.pathCost = cost;
		this.dad = dad;
		this.state = state;
	}
	
	public void updatePathCost(double cost) {
		this.pathCost += cost;
	}
	
	public void updateState(State s) {
		this.state = s;
	}
	
	public State getState() {
		return this.state;
	}
	
	public void setState(State s) {
		this.state = s;
	}
	
	public double getPathCost() {
		return pathCost;
	}
	
	public void updateDad(Node node) {
		this.dad = node;
	}
	
	public Node getDad() {
		return this.dad;
	}
	
	
	public void addRoad(Action a) {
		this.adjAction.add(a);
	}
	
	public void addAllRoads(ArrayList<Action> roads) {
		this.adjAction = roads;
	}
	
	public ArrayList<Action> getAdjAction() {
		return adjAction;
	}
}
