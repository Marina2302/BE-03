package module02.finalTask.figures.white;

import module02.finalTask.Cell;
import module02.finalTask.figures.Figure;
import module02.finalTask.exceptions.ImpossibleMoveException;

import java.util.List;

public class BishopWhite extends Figure {
    public BishopWhite(final Cell position) {
        super(position);
    }

    @Override
    public List<Cell> way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveDiagonal(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopWhite(dest);
    }
}
