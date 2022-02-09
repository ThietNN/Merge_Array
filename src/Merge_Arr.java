public class Merge_Arr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] intResult = new int[8];

        for (int i =0;i<arr1.length;i++){
            intResult[i] = arr1[i];
        }
        for (int i=arr2.length;i<intResult.length;i++){
            intResult[i] = arr2[i-arr2.length];
        }
        String result = " ";
        for(int i = 0;i<intResult.length;i++){
            result += intResult[i] + ", ";
        }
        System.out.println("Result: " + result);
    }
}
