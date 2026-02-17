public class Main {

    public static void main(String[] args) {
        Integer[] intArray1 = { 1, 2, 3 };
        Integer[] intArray2 = { 4, 5, 6 };

        String[] strArray1 = { "Welcome", "To" };
        String[] strArray2 = { "Java", "Programming" };

        Integer[] mergedIntArray = GenericMethods.mergeArrays(intArray1, intArray2);
        String[] mergedStrArray = GenericMethods.mergeArrays(strArray1, strArray2);

        System.out.println("Merged Integer Array: ");
        for (Integer num : mergedIntArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Merged String Array: ");
        for (String str : mergedStrArray) {
            System.out.print(str + " ");
        }
    }

}
