package module02.finalTask.figures.black;

import module02.finalTask.Cell;
import module02.finalTask.figures.Figure;
import module02.finalTask.exceptions.ImpossibleMoveException;

import java.util.List;

public class PawnBlack extends Figure {
    public PawnBlack(final Cell position) {
        super(position);
    }


    @Override
    public List<Cell> way(Cell source, Cell dest) throws ImpossibleMoveException {
        return moveOnlyForwardOneStep(source, dest, true);
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnBlack(dest);
    }
}
