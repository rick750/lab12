package it.unibo.es1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicsImpl implements Logics {
	private final List<Integer> values;

	public LogicsImpl(int size) {
		this.values = new ArrayList<>(Collections.nCopies(size, 0));
	}

	@Override
	public int size() {
		return this.values.size();
	}

	@Override
	public List<Integer> values() {
		return Collections.unmodifiableList(this.values);
	}

	@Override
	public List<Boolean> enablings() {
		return this.values().stream().map(elem -> elem > 0).toList(); 
	}

	@Override
	public int hit(int elem) {
		this.values.set(elem, this.values.get(elem) + 1);
		return this.values.get(elem);
	}

	@Override
	public String result() {
		return this.values.stream()
			.;
	}

	@Override
	public boolean toQuit() {
		return this.values.stream()
			.distinct()
			.count() <= 1;
	}
}
