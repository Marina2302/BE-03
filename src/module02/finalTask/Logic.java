package module02.finalTask;

import module02.finalTask.exceptions.FigureNotFoundException;
import module02.finalTask.exceptions.ImpossibleMoveException;
import module02.finalTask.exceptions.OccupiedWayException;
import module02.finalTask.figures.Figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Logic {
    private  List figures = new ArrayList();
    private int index = 0;

    public void add(Figure figure) {
        this.figures.set(this.index++, figure);
    }

    public boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException,
            FigureNotFoundException {
        boolean rst = false;
        Optional<Integer> index = findBy(source);
        Optional<Integer> target = findBy(dest);
        if (!index.isPresent()) {
            throw new FigureNotFoundException();
        }
        List<Cell> steps = this.figures.get(index.get()).way(source, dest);
        for (Cell step1 : steps) {
            Optional<Integer> empty = findBy(step1);
            if (empty.isPresent() || target.isPresent()) {
                throw new OccupiedWayException();
            }
        }
        if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
            rst = true;
            this.figures.set(index.get(), this.figures.get(index.get()).copy(dest));
        }
        return rst;
    }

    public void clean() {
        for (int position = 0; position != this.figures.size(); position++) {
            this.figures.set(position, null);
        }
        this.index = 0;
    }

    private Optional<Integer> findBy(Cell cell) {
        return IntStream.range(0, this.figures.size())
                .filter(i -> this.figures.get(i) != null && this.figures.get(i).position().equals(cell)).boxed()
                .findFirst();
    }
}
