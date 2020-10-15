package module02.finalTask.figures.black;

import module02.finalTask.Cell;
import module02.finalTask.exceptions.ImpossibleMoveException;
import module02.finalTask.figures.Figure;

import java.util.List;

public class BishopBlack extends Figure {
    public BishopBlack(final Cell position) {
        super(position);
    }

    @Override
    public List<Cell> way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveDiagonal(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
