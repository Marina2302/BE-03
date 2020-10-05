package module02.finalTask.figures;

import module02.finalTask.Cell;
import module02.finalTask.exceptions.ImpossibleMoveException;

public abstract class Figure {

    private final Cell position;

    public Figure(Cell position) {
        this.position = position;
    }


    public Cell position() {
        return this.position;
    }

    public abstract Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException;

    public String icon() {
        return String.format(
                "%s.png", getClass().getSimpleName()
        );
    }

    public abstract Figure copy(Cell dest);

    public Cell[] moveInline(Cell source, Cell dest) throws ImpossibleMoveException {
        boolean valid = false;
        Cell[] steps = new Cell[0];
        int deltaX = Integer.compare(dest.getX(), source.getX());
        int deltaY = Integer.compare(dest.getY(), source.getY());
        int moveX = Math.abs(source.getX() - dest.getX());
        int moveY = Math.abs(source.getY() - dest.getY());
        int size = Math.max(moveX, moveY);
        if (source.getY() == dest.getY() + moveY && source.getX() == dest.getX()
                || source.getY() == dest.getY() - moveY && source.getX() == dest.getX()
                || source.getY() == dest.getY() && source.getX() == dest.getX() + moveX
                || source.getY() == dest.getY() && source.getX() == dest.getX() - moveX) {
            steps = new Cell[size];
            steps[0] = Cell.findCell(source.getX() + deltaX, source.getY() + deltaY);
            for (int index = 1; index < steps.length; index++) {
                steps[index] = Cell.findCell(steps[index - 1].getX() + deltaX, steps[index - 1].getY() + deltaY);
            }
            valid = true;
        }
        if (!valid) {
            throw new ImpossibleMoveException();
        }
        return steps;
    }

    public Cell[] moveDiagonal(Cell source, Cell dest) throws ImpossibleMoveException {
        boolean valid = false;
        Cell[] steps = new Cell[0];
        int deltaX = Integer.compare(dest.getX(), source.getX());
        int deltaY = Integer.compare(dest.getY(), source.getY());
        int move = Math.abs(source.getX() - dest.getX());
        if (source.getY() == dest.getY() + move && source.getX() == dest.getX() + move
                || source.getY() == dest.getY() + move && source.getX() == dest.getX() - move
                || source.getY() == dest.getY() - move && source.getX() == dest.getX() + move
                || source.getY() == dest.getY() - move && source.getX() == dest.getX() - move) {
            steps = new Cell[move];
            steps[0] = Cell.findCell(source.getX() + deltaX, source.getY() + deltaY);
            for (int index = 1; index < steps.length; index++) {
                steps[index] = Cell.findCell(steps[index - 1].getX() + deltaX, steps[index - 1].getY() + deltaY);
            }
            valid = true;
        }
        if (!valid) {
            throw new ImpossibleMoveException();
        }
        return steps;
    }

    public Cell[] moveOnlyForwardOneStep(Cell source, Cell dest, Boolean color) throws ImpossibleMoveException {
        boolean valid = false;
        int move = 0;  //If color true - color is black
        if (!color) {
            move = 1;
        }
        if (color) {  // if color false - color is white
            move = -1;
        }
        Cell[] steps = new Cell[0];
        if (source.getY() == dest.getY() + move && source.getX() == dest.getX()) {
            steps = new Cell[] {dest };
            valid = true;
        }
        if (!valid) {
            throw new ImpossibleMoveException();
        }
        return steps;
    }

    public Cell[] moveZigZag(Cell source, Cell dest) throws ImpossibleMoveException {
        boolean valid = false;
        Cell[] steps = new Cell[0];
        if ((source.getY() == dest.getY() + 2 && source.getX() == dest.getX() + 1)
                || (source.getY() == dest.getY() + 2 && source.getX() == dest.getX() - 1)
                || (source.getY() == dest.getY() - 2 && source.getX() == dest.getX() + 1)
                || (source.getY() == dest.getY() - 2 && source.getX() == dest.getX() - 1)
                || (source.getY() == dest.getY() + 1 && source.getX() == dest.getX() + 2)
                || (source.getY() == dest.getY() - 1 && source.getX() == dest.getX() + 2)
                || (source.getY() == dest.getY() + 1 && source.getX() == dest.getX() - 2)
                || (source.getY() == dest.getY() - 1 && source.getX() == dest.getX() - 2)) {
            steps = new Cell[] {dest };
            valid = true;
        }
        if (!valid) {
            throw new ImpossibleMoveException();
        }
        return steps;
    }

    public Cell[] moveAllWayOneStep(Cell source, Cell dest) throws ImpossibleMoveException {
        boolean valid = false;
        Cell[] steps = new Cell[0];
        if ((source.getY() == dest.getY() + 1 && source.getX() == dest.getX() + 1)
                || (source.getY() == dest.getY() + 1 && source.getX() == dest.getX() - 1)
                || (source.getY() == dest.getY() - 1 && source.getX() == dest.getX() + 1)
                || (source.getY() == dest.getY() - 1 && source.getX() == dest.getX() - 1)
                || (source.getY() == dest.getY() + 1 && source.getX() == dest.getX())
                || (source.getY() == dest.getY() - 1 && source.getX() == dest.getX())
                || (source.getY() == dest.getY() && source.getX() == dest.getX() + 1)
                || (source.getY() == dest.getY() && source.getX() == dest.getX() - 1)) {
            steps = new Cell[] {dest};
            valid = true;
        }
        if (!valid) {
            throw new ImpossibleMoveException();
        }
        return steps;
    }

    public Cell[] godLikeMove(Cell source, Cell dest) throws ImpossibleMoveException {
        Cell[] steps;
        int moveX = Math.abs(source.getX() - dest.getX());
        int moveY = Math.abs(source.getY() - dest.getY());
        if (moveX == moveY) {
            steps = moveDiagonal(source, dest);
        } else if (moveX == 0 || moveY == 0) {
            steps = moveInline(source, dest);
        } else {
            throw new ImpossibleMoveException();
        }
        return steps;
    }
}
