public class IntArrayQueue {
    
    private int[] que; //큐 배열
    private int capacity; //큐 용량
    private int num = 0; //현재 데이터 개수

    public IntArrayQueue(int capacity) {
        que = new int[capacity];
    }
}
