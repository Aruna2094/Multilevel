package org.multi;

public class Rbibank extends Axisbank {
	
	private void savings() {
		System.out.println("savings 3%");
		System.out.println("done");
   }

	private void current() {
		System.out.println("current 4%");
     System.out.println("done");
	}
	
	
	
	public static void main(String[] args) {
		Rbibank r=new Rbibank();
		r.savings();
		r.current();
		r.fixed();
		r.recurring();
		r.goldloan();
		r.carloan();
	}
}
