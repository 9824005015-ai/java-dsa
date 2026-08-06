class Solution {
    public int nextGreaterElement(int n) {

        char[] arr = String.valueOf(n).toCharArray();

        int i = arr.length - 2;

        // Find the first decreasing digit
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            return -1;
        }

        // Find the next greater digit
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Reverse the remaining digits
        int left = i + 1;
        int right = arr.length - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        long ans = Long.parseLong(new String(arr));

        if (ans > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) ans;
    }
}
