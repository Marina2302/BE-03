package module02.finalTask.black;

import module02.finalTask.Cell;
import module02.finalTask.Figure;
import module02.finalTask.ImpossibleMoveException;

public class BishopBlack extends Figure {
    public BishopBlack(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveDiagonal(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
