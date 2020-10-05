package module02.finalTask;

import module02.finalTask.exceptions.FigureNotFoundException;
import module02.finalTask.exceptions.ImpossibleMoveException;
import module02.finalTask.exceptions.OccupiedWayException;
import module02.finalTask.figures.Figure;

import java.util.Optional;
import java.util.stream.IntStream;

public class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException,
            FigureNotFoundException {
        boolean rst = false;
        Optional<Integer> index = findBy(source);
        Optional<Integer> target = findBy(dest);
        if (!index.isPresent()) {
            throw new FigureNotFoundException();
        }
        Cell[] steps = this.figures[index.get()].way(source, dest);
        for (Cell step1 : steps) {
            Optional<Integer> empty = findBy(step1);
            if (empty.isPresent() || target.isPresent()) {
                throw new OccupiedWayException();
            }
        }
        if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
            rst = true;
            this.figures[index.get()] = this.figures[index.get()].copy(dest);
        }
        return rst;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private Optional<Integer> findBy(Cell cell) {
        return IntStream.range(0, this.figures.length)
                .filter(i -> this.figures[i] != null && this.figures[i].position().equals(cell)).boxed()
                .findFirst();
    }
}
