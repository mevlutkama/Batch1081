package slides3;

public class Counter {

    int count;
    static int stCount;

    public Counter() {
        count++;
        stCount++;
    }

    public int getCount() {
        return count;
    }

    public static int getStCount() {
        return stCount;
    }
}

