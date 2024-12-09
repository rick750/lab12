package it.unibo.es2;

import java.util.HashMap;
import java.util.Map;

public class LogicsImpl implements Logics {
	private final Map<Pair<Integer, Integer>, String> values;
	private final int size;

	public LogicsImpl(final int size) {
		this.size = size;
		this.values = new HashMap<>();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				final Pair<Integer, Integer> pos = new Pair<>(i , j);
				this.values.put(pos, " ");
			}
		}
	}

	@Override
	public String hit(Pair<Integer, Integer> pos) {
		final String str = this.values.get(pos).equals("*") ? " " : "*";
		this.values.replace(pos, str);
		return str;
	}

	@Override
	public boolean toQuit() {
		final boolean result;
		for (int i = 0; i < )
		return result;
	}	
}
