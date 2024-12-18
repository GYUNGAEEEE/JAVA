package ch11;

import java.util.*;

public class StackEx1 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		goURL("1. 네이트");
		goURL("2. 야후");
		goURL("3. 네이버");
		goURL("4. 다음");
		
		printstatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printstatus ();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printstatus();
		
		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printstatus();
		
		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");
		printstatus();
	}
	
	public static void printstatus() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
		back.push(forward.pop());
	}
	
	public static void goBack() {
		if(!back.empty())
		forward.push(back.pop()) ;
	}
	
}
