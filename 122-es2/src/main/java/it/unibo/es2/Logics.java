package it.unibo.es2;

import java.util.*;

public interface Logics {

	/**
	 * @param pos the position of the
	 * 
	 * @return the new value a button should show after being pressed
	 */
	Boolean hit(Pair<Integer, Integer> pos);

    /**
	 * @return whether it is time to quit
	 */
	boolean toQuit();
}
