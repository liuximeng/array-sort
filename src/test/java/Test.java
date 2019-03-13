import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {7, 8, 5, 1 ,3};
        System.out.println(Arrays.toString(array));
        //ArrarySort.bubble(array);
        //ArrarySort.selectSort(array);
        ArrarySort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
