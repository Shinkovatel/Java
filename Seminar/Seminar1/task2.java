public class task2 {
    public static void main(String [] args) throws Exception {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else if (maxCount < count) {
                maxCount = count;
                count = 0;
            }
        }
        if (maxCount < count)
            maxCount = count;

        System.out.println(maxCount);
    }
}