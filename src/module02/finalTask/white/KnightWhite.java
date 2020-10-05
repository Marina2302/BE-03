package module02.finalTask.white;

import module02.finalTask.Cell;
import module02.finalTask.Figure;
import module02.finalTask.exceptions.ImpossibleMoveException;

public class KnightWhite extends Figure {
    public KnightWhite(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveZigZag(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightWhite(dest);
    }
}
