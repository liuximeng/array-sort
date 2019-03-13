/**
 * @author 戏梦
 */
public class ArrarySort {
    /**
     * 冒泡排序
     * 原理:比较相邻的元素，将小的放到前面,(每一轮找出数组中最大的放在后面，后面排好序的数组元素不参与下轮排序)
     * 7 8 5 1 3
     */
    public static void bubble(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * 将数组中每个元素与第一个元素比较，如果这个元素小于第一个元素，则交换这两个元素。
     * 7, 8, 5, 1 ,3
     * 原理:
     * 1.将数组中每个元素与第一个元素比较，如果这个元素小于第一个元素，则交换这两个元素
     * 2.循环第1条规则，找出最小元素，放于第1个位置
     * 3.经过n-1轮比较完成排序
     */
    public static void selectSort(int[] a) {
        int length = a.length;
        for (int j = 0; j < length; j++) {
            for (int i = j + 1; i < length; i++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     * 将数组分为两部分, 将后部分的第一个逐一与前部分每一个元素比较，在合理位置插入。
     * 插入排序算法效率要高于选择排序和冒泡排序
     */
    public static void insertSort(int[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            int insertNum = a[i];
            int j = i - 1;
            while (j>=0&&a[j]>insertNum){
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }
}
