import java.util.TreeMap;
import java.util.TreeSet;

public class StateTransitions {
	private String state;
	// <AlphabetCharacter, State>
	private TreeMap<String, String> transitions;
	
	public StateTransitions(String state){
		this.state = state;
		transitions = new TreeMap<String,String>();
	}
	
	public void addTransition(String alphabetKey, String state) {
		transitions.put(alphabetKey, state);
	}
	
	public boolean containsTransitionFor(String alphabetKey){
		return transitions.containsKey(alphabetKey);
	}
	
	public String getTransitionStateFor(String alphabetKey){
		return transitions.get(alphabetKey);
	}
	
//	public String removeTransitionFor(String alphabetKey){
//		return transitions.remove(alphabetKey);
//	}
	
	public String toString(){
		return "<Name:(" + this.state + ")##" + "Transitions: (" + this.transitions.toString()+")>";
	}
}
