public class Bub {
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n ; i++)
            for (int j = 1; j < (n - i); j++)
                if (arr[j-1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
    }
    public static void main(String[] args)
    {
        int arr[] = {5,8,2,9,4,6,1,3,7};
        System.out.println("Before");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("After");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
