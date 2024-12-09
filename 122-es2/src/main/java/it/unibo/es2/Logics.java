package it.unibo.es2;

import java.util.*;

public interface Logics {

	/**
	 * @return the new value a button should show after being pressed
	 */
	String hit(int elem);

    /**
	 * @return whether it is time to quit
	 */
	boolean toQuit();
}
