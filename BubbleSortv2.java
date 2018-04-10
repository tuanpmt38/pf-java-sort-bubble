public class BubbleSortv2 {

    public static void bubbleSort(int[] number) {
        boolean needNextPass = true;
        int temp;
        for (int i = 1; i < number.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < number.length - 1; j++) {
                if (number[j] > number[j + 1]) {
                    temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {3, 5, 6, -4, 67, 9, 45, 34};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
