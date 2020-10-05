package module02.finalTask.white;

import module02.finalTask.Cell;
import module02.finalTask.Figure;
import module02.finalTask.ImpossibleMoveException;

public class PawnWhite extends Figure {
    public PawnWhite(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveOnlyForwardOneStep(source, dest, false);
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnWhite(dest);
    }
}
