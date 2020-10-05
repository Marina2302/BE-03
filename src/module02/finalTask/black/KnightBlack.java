package module02.finalTask.black;

import module02.finalTask.Cell;
import module02.finalTask.Figure;
import module02.finalTask.ImpossibleMoveException;

public class KnightBlack extends Figure {

    public KnightBlack(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveZigZag(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}
