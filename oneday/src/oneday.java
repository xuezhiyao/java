
public class oneday {
	
	private static final int BREAKFASET = 1;
	private static final int LUNCH =2;
	private static final int SUPPER = 3;

	public static void main(String[] args) {
		oneday one = new oneday();
		one.sleep();
	    one.have_meal(BREAKFASET);
		one.goto_work();
		one.code();
		one.have_meal(LUNCH);
		one.code();
		one.return_home();
		one.have_meal(SUPPER);
	}
	
	

	private void have_meal(int breakfaset2) {
		switch(breakfaset2){
		case BREAKFASET: 
			System.out.print("having BREAKFASET\n");
			break;
		case LUNCH:
			System.out.print("having LUNCH\n");
			break;
		case SUPPER:
		    System.out.print("having SUPPER\n");
		    break;
		default:
			System.out.print("do nothing\n");
		}
		
	}



	private void code() {
		System.out.print("having code\n");
	}

	private void return_home() {
		System.out.print("return_home\n");
		
	}

	private void goto_work() {
		System.out.print("having goto_work\n");
		
	}

	private void sleep() {
		System.out.print("having sleep\n");
		
	}
}