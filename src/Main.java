
import java.util.Arrays;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    int[] array = {2, 6, 8, 1, 5, 12, 9};
    int low = 0;
    int high = array.length - 1;

    quick_sort(array, low, high);
    System.out.println(Arrays.toString(array));

    LinkedList<String> linkedList = new LinkedList<String>();
}

public static void quick_sort(int[] array, int low, int high) {
    if(low >= high) return;

    int pivot = partition(array, low, high);
    quick_sort(array, low , pivot - 1);
    quick_sort(array, pivot + 1, high);

}

public static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int idx = - 1;


    for(int i = low; i < high; i++ ){
        if(array[i] <= pivot){
            idx++;
            int temp = array[i];
            array[i] = array[idx];
            array[idx] = temp;

        }
    }

    idx++;
    array[high] = array[idx];
    array[idx] = pivot;

    System.out.println("for another branch");
    return idx;


}




