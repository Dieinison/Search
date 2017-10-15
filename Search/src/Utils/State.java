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

public class State {
	private String description;

	public State() { }
	
	public State(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
