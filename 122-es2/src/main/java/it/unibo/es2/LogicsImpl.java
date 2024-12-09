package it.unibo.es2;

import java.util.HashMap;
import java.util.Map;

public class LogicsImpl implements Logics {
	private final Map<Pair<Integer, Integer>, String> values;

	public LogicsImpl(int size) {
		this.values = new HashMap<>();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				final Pair<Integer, Integer> pos = new Pair<>(i , j);
				this.values.put(pos, " ");
			}
		}
	}

	@Override
	public String hit(int elem) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hit'");
	}

	@Override
	public boolean toQuit() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'toQuit'");
	}

	
}
