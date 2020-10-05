package module02.finalTask.black;

import module02.finalTask.Cell;
import module02.finalTask.Figure;
import module02.finalTask.ImpossibleMoveException;

public class RookBlack extends Figure {
    public RookBlack(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveInline(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookBlack(dest);
    }
}
