import java.util.Arrays;

public class GenericMethods<T> {

    private T[] elements;

    public GenericMethods(T[] elements) {
        this.elements = elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public static <T> T[] mergeArrays(T[] arr1, T[] arr2) {

        if (arr1 == null) {
            return arr2;
        } else if (arr2 == null) {
            return arr1;
        }

        T[] mergedArray = Arrays.copyOf(arr1, arr1.length + arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        return mergedArray;
    }
}