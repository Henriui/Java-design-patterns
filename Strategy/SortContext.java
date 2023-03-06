package Strategy;

public class SortContext {
    private ISort sortStrategy;

    public SortContext(ISort sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] array) {
        sortStrategy.sort(array);
    }

    public void setSortStrategy(ISort sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
