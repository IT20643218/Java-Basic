package Collection;

import java.util.Stack;

public class Stack1 {

		
		public static void main (String[] args) {
			Stack<Integer> st = new Stack<>();
			st.push(23);
			st.push(45);
			st.peek();
			st.pop();
			st.push(100);
			st.pop();
			st.pop();
			st.push(65);
			st.push(79);
			st.peek();
		}

}
