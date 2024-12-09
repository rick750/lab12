package it.unibo.es2;

import java.util.ArrayList;
import java.util.List;

public class LogicsImpl implements Logics {
	private final List<List<Boolean>> values;

	public LogicsImpl(final int size) {
		this.values = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			final List<Boolean> row = new ArrayList<>();
			this.values.addLast(row);
			for(int j = 0; j < size; j++) {
				this.values.get(i).addLast(false);
			}
		}
	}

	private boolean getCell(Pair<Integer, Integer> pos) {
		return this.values.get(pos.getX()).get(pos.getY());
	}

	@Override
	public boolean hit(Pair<Integer, Integer> pos) {
		final Boolean val = !this.getCell(pos);
		this.values.get(pos.getX()).set(pos.getY(), val);
		return val;
	}

	@Override
	public boolean toQuit() {
		
	}	
}
