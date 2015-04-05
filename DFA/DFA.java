import java.util.Set;
import java.util.Map;

/**
 * Java implementation of deterministic finite state automata.
 * <p>
 * A trap state is implicit; that is, any unspecified transition is treated as ending in a trap state from which there is no exit.
 * <p>
 * The transition function is represented as a Map of Maps. The outer map associates a state with its state-specific transition function subset (a transition table row) which is itself represented as a mapping from input symbol to destination state.
 * <p>
 * Note that unspecified cases have undefined results.
 * 
 * @author David Robertson - built according to http://jodypaul.com/cs/theory/DFAjava/DFA.html>required api
 * @version 1.0.0
 */
public class DFA extends Object
{
    /** the set of states of this DFA */
    private Set<State> states;

    /** the alphabet of this DFA */
    private Set<String> alphabet;

    /** the transition function of this DFA */
    private Map<State,Map<String,State>> transition;
    
    /** the start state of this DFA */
    private State start;
    
    /** the start state of this DFA */
    private Set<State> accept;
    
    /**
     * Fully parameterized constructor for DFA objects.
     * @param states the set of states of this DFA
     * @param alphabet the alphabet of this DFA
     * @param transition the transition function of this DFA
     * @param start the start state of this DFA
     * @param accept the set of accept states of this DFA
     */
    public DFA(Set<State> states, Set<String> alphabet, Map<State,Map<String,State>> transition, State start, Set<State> accept)
    {
        this.states = states;
        this.alphabet = alphabet;
        this.transition = transition;
        this.start = start;
        this.accept = accept;
    }
    
    /**
     * Determines whether given string is accepted or rejected by this DFA. Each state's activity couner is initialized to zero, then incremented by one each time the state is entered.
     * @param input the input string; allows both "" and null to indicate the empty string ε
     * @return true if the string is in the language recognized by this DFA; false otherwise
     */
    public boolean accepts(String input)
    {
        return false;
    }
    
    /**
     * Retrieves the set of accept states.
     * @return accept states
     */
    public Set<State> acceptStates()
    {
        return null;
    }

    /**
     * Retrieves the alphabet of this DFA.
     * @return the alphabet
     */
    public Set<String> alphabet()
    {
        return null;
    }
    
    /**
     * Retrieves the initial state of this DFA, if any.
     * @return the initial state; null if none
     */
    public State initialState()
    {
        return null;
    }
    
    /**
     * Lookup transition for specified state and input.
     * @param source the source state
     * @param input the input symbol
     * @return the destination state; null if none
     */
    public State nextState(State source, String input)
    {
        return null;
    }
    
    /**
     * Retrieves the set of all states.
     * @return the states
     */
    public Set<State> states()
    {
        return null;
    }
    
    /**
     * Retrieves the transition function of this DFA.
     * @return Retrieves the transition function of this DFA.
     */
    public Map<State,Map<String,State>> transitionFunction()
    {
        return null;
    }
}
