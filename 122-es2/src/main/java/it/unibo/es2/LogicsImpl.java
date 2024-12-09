package it.unibo.es2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
		return isAnyRowFull() || isAnyColFull();
	}

	private boolean isAnyRowFull() {
		return this.values.stream().anyMatch(list -> list.stream().allMatch(l -> l));
	}

	private boolean isAnyColFull() {
		return IntStream.range(0,this.values.size())
		.anyMatch(index -> this.values.stream()
		.allMatch(l -> l.get(index)));
	}
}