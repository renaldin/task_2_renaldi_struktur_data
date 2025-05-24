class CountingSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        int output[] = new int[n];
        
        int max = arr[0];
        for (int i = 1; i < n; ++i) {
            if (arr[i] > max) max = arr[i];
        }

        int count[] = new int[max + 1];
        for (int i = 0; i <= max; ++i) count[i] = 0;

        for (int i = 0; i < n; ++i) ++count[arr[i]];

        for (int i = max - 1; i >= 0; --i) count[i] += count[i + 1];

        for (int i = 0; i < n; ++i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i) arr[i] = output[i];
    } //end void sort

    public static void main(String args[])
    {
        CountingSort ob = new CountingSort();
        int arr[] = {43, 11, 1, 67, 89, 66};
        System.out.println("Sebelum diurutkan:");
        for (int i = 0; i < arr.length; ++i) System.out.print(arr[i] + " ");
        ob.sort(arr);
        System.out.println("\n\nSetelah diurutkan (Descending):");
        for (int i = 0; i < arr.length; ++i) System.out.print(arr[i] + " ");
    } //end public static void main
} //end class CountingSort