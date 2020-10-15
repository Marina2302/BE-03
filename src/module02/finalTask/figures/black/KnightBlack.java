package module02.finalTask.figures.black;

import module02.finalTask.Cell;
import module02.finalTask.figures.Figure;
import module02.finalTask.exceptions.ImpossibleMoveException;

import java.util.List;

public class KnightBlack extends Figure {

    public KnightBlack(final Cell position) {
        super(position);
    }

    @Override
    public List<Cell> way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveZigZag(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}
