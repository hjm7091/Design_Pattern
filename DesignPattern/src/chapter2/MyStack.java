package chapter2;

import java.util.ArrayList;

public class MyStack extends ArrayList<String>{
	
	public void push(String element) {
		add(element);
	}
	
	public String pop() {
		return remove(size()-1);
	}
	
	public static void main(String[] args) {
		MyStack st = new MyStack();
		st.push("insang1");
		st.push("insang2");
		st.set(0, "insang3"); //허용되면 스택의 규칙에 위반됨
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}
