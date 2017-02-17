package uk.ac.bris.cs.oxo.standard;

import static java.util.Objects.requireNonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import uk.ac.bris.cs.gamekit.matrix.ImmutableMatrix;
import uk.ac.bris.cs.gamekit.matrix.Matrix;
import uk.ac.bris.cs.gamekit.matrix.SquareMatrix;
import uk.ac.bris.cs.oxo.Cell;
import uk.ac.bris.cs.oxo.Outcome;
import uk.ac.bris.cs.oxo.Player;
import uk.ac.bris.cs.oxo.Side;
import uk.ac.bris.cs.oxo.Spectator;

public class OXO implements OXOGame {

	private Player noughtSide, crossSide;
	private Side currentSide;
	private int size;

	public OXO(int size, Side startSide, Player noughtSide, Player crossSide) {


		if(size <= 0)
		{
			throw new IllegalArgumentException("size invalid");
		}

	}

	@Override
	public void registerSpectators(Spectator... spectators) {
		// TODO
		throw new RuntimeException("Implement me");
	}

	@Override
	public void unregisterSpectators(Spectator... spectators) {
		// TODO
		throw new RuntimeException("Implement me");
	}

	@Override
	public void start() {
		// TODO
		throw new RuntimeException("Implement me");
	}

	@Override
	public SquareMatrix<Cell> board() {
		// TODO
		throw new RuntimeException("Implement me");
	}

	@Override
	public Side currentSide() {
		// TODO
		throw new RuntimeException("Implement me");
	}
}
