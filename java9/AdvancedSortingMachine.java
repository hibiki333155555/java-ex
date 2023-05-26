public class AdvancedSortingMachine extends SortingMachine{
    public AdvancedSortingMachine(Strategy s) {
        super(s);
    }

    public void sort(int[] array) {
        System.out.println(strategy.getClass().getName());
        long start = System.currentTimeMillis();
        strategy.sort(array);
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}
