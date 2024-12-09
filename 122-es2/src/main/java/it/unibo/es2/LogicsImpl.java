package it.unibo.es2;

import java.util.HashMap;
import java.util.Map;

public class LogicsImpl implements Logics {
	private final Map<Pair<Integer, Integer>, Boolean> values;

	public LogicsImpl(final int size) {
		this.values = new HashMap<>();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				final Pair<Integer, Integer> pos = new Pair<>(i , j);
				this.values.put(pos, false);
			}
		}
	}

	@Override
	public Boolean hit(Pair<Integer, Integer> pos) {
		final Boolean val = !this.values.get(pos);
		this.values.replace(pos, val);
		return val;
	}

	@Override
	public boolean toQuit() {
		
	}	
}
