
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int[] newArr = new int[arr1.length + arr2.length];
        int index = 0;

        for(int i = 0; i < arr1.length; i++){
            newArr[index] = arr1[i];
            index++;
        }

        for(int i = 0; i < arr2.length; i++){
            newArr[index] = arr2[i];
            index++;
        }

        return newArr;
    }
}
