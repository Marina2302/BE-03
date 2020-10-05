package module02.finalTask.white;

import module02.finalTask.Cell;
import module02.finalTask.Figure;
import module02.finalTask.exceptions.ImpossibleMoveException;

public class RookWhite extends Figure {
    public RookWhite(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveInline(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookWhite(dest);
    }
}
