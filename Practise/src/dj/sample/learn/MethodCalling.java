/**
 * 
 */
package dj.sample.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author djain20
 *
 */
public class MethodCalling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MethodCalling m = new MethodCalling();
		m.show(new ArrayList());
		m.show(new Object());
		m.show(null);
			

	}
	
	private void show(Object list) {
		System.out.println("Calling from Object parameter.");
	}
	
	private void show(List list) {
		System.out.println("Calling from list parameter.");
	}

	/*private void show(String list) {
		System.out.println("Calling from String parameter.");
	}*/
	
}
