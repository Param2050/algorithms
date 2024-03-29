package stackandqueue;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String args[]) {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }

    private static void printNGE(int[] arr, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        int newArr[] = new int[n];

        for(int i=n-1; i>=0; i--) {
//            11, 13, 21, 3
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();

            if(stack.isEmpty()) {
                newArr[i] = -1;
            }else {
                newArr[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for (int i=0; i<n; i++) {
            System.out.println(arr[i] + " -----------> " + newArr[i]);
        }
    }
}
