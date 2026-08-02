import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		
		Integer ele = stk.peek();
		System.out.println("Top most ele:"+ele);
		
		while(!stk.isEmpty())
		{
			Integer e = stk.pop();
			System.out.println(e+" Element popped");
		}

		
	}

}
