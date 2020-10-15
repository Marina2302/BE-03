package module02.finalTask.figures.white;

import module02.finalTask.Cell;
import module02.finalTask.figures.Figure;
import module02.finalTask.exceptions.ImpossibleMoveException;

import java.util.List;

public class QueenWhite extends Figure {
    public QueenWhite(final Cell position) {
        super(position);
    }

    @Override
    public List<Cell> way(Cell source, Cell dest) throws ImpossibleMoveException {
        return godLikeMove(source, dest);
    }

    @Override
    public Figure copy(Cell dest) {
        return new QueenWhite(dest);
    }
}
