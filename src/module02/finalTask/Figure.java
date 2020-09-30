package module02.finalTask;

public abstract class Figure {

    private final Cell position;
    private final FigureColor figureColor;

    public Figure(Cell position, FigureColor figureColor) {
        this.position = position;
        this.figureColor = figureColor;
    }


    public Cell position() {
        return this.position;
    }

    public abstract Cell[] way(Cell source, Cell dest);

    String icon() {
        return String.format(
                "%s.png", getClass().getSimpleName()
        );
    }

    public abstract Figure copy(Cell dest);
}
