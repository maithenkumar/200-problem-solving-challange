import java.util.Stack;

class ValidateStackSequences {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int []arr2={4,5,3,2,1};
        System.out.println( validateStackSequences2(arr1, arr2));
    }

    public static boolean validateStackSequences2(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>(); // Create a stack
        
        int j = 0; // Intialise one pointer pointing on popped array
        
        for(int val : pushed){
            st.push(val); // insert the values in stack
            while(!st.isEmpty() && st.peek() == popped[j]){ // if st.peek() values equal to popped[j];
                st.pop(); // then pop out
                j++; // increment j
            }
        }
        return st.isEmpty(); // check if stack is empty return true else false
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        while (i < pushed.length && j < popped.length) {
            // if (pushed[i] != popped[j]) {
                stack.push(pushed[i]);
                i++;
            // } else
             {
                    
                while ( stack.peek() == popped[j] && j < popped.length   ) {

                    stack.pop();
                    j++;
                }
            }
        }
        return false;
    }
}