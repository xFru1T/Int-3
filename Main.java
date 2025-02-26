import java.util.Scanner;
class Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print size array: ");
        int size = scanner.nextInt();
        int[] sortedArray = new int[size];
        System.out.print("Print " + size + " num(s): ");
        for (int i = 0; i < size; i++) {
            sortedArray[i] = scanner.nextInt();
            }
        System.out.println("Print element array: ");
        int target = scanner.nextInt();
        int result = binarySearch(sortedArray, target);
        if (result == -1) {
            System.out.println("Not found");
            }
        else {
            System.out.println("Found in: " + result);
            }
        }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
                }
            if (array[mid] < target) {
                left = mid + 1;
                }
            else {
                right = mid - 1;
                }
            }
        return -1;
        }
    }
