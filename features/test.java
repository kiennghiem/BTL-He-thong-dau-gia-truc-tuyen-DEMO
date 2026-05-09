public class BubbleSort {
    
    /**
     * Thuật toán Bubble Sort - Sắp xếp mảng theo thứ tự tăng dần
     * @param arr Mảng cần sắp xếp
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Vòng lặp ngoài - qua từng phần tử
        for (int i = 0; i < n - 1; i++) {
            // Vòng lặp trong - so sánh các phần tử liền kề
            for (int j = 0; j < n - i - 1; j++) {
                // Nếu phần tử hiện tại lớn hơn phần tử tiếp theo, hoán đổi
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi arr[j] và arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Phiên bản tối ưu với cờ để phát hiện nếu mảng đã sắp xếp
     */
    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            
            // Nếu không có hoán đổi, mảng đã sắp xếp
            if (!isSwapped) {
                break;
            }
        }
    }
    
    /**
     * Hàm in mảng
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * Hàm main để kiểm tra
     */
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
        
        // Test phiên bản tối ưu
        int[] arr2 = {5, 2, 8, 1, 9};
        System.out.println("\nMảng 2 ban đầu:");
        printArray(arr2);
        
        bubbleSortOptimized(arr2);
        
        System.out.println("Mảng 2 sau khi sắp xếp (tối ưu):");
        printArray(arr2);
    }
}

