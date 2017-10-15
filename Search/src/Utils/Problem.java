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

public class Problem {
	private State initialState;
	private State finalState;
	
	public Problem() { }
	
	public Problem(State initialState, State finalState) {
		super();
		this.initialState = initialState;
		this.finalState = finalState;
	}

	public State getInitialState() {
		return initialState;
	}

	public void setInitialState(State initialState) {
		this.initialState = initialState;
	}

	public State getFinalState() {
		return finalState;
	}

	public void setFinalState(State finalState) {
		this.finalState = finalState;
	}
}
