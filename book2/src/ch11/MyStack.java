package ch11;

import java.util.*;

public class MyStack extends Vector {
	
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek();
		removeElementAt(size() - 1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if(len == 0)
			throw new EmptyStackException();
		
		return elementAt(len - 1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o); //찾는 객체가 없으면 -1 반환
		if (i >= 0) {
			return size() - i; //Stack은 맨 위에 저장된 객체의 index를 1로 정의한다.
		}
		return -1;
	}
	
}
