package module02.finalTask.white;

import module02.finalTask.Cell;
import module02.finalTask.Figure;
import module02.finalTask.exceptions.ImpossibleMoveException;

public class QueenWhite extends Figure {
    public QueenWhite(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return godLikeMove(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new QueenWhite(dest);
    }
}
