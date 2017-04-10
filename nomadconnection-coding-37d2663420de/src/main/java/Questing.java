import java.util.Stack;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d) {
		// FIXME
		return (int) d / 2;
	}

	static boolean quest2(String s) {
		// FIXME
		// int a1 = s.indexOf('(');
		// int a2 = s.indexOf(')');
		// int b1 = s.indexOf('{');
		// int b2 = s.indexOf('}');
		// int c1 = s.indexOf('[');
		// int c2 = s.indexOf(']');
		//
		// if ((a2 - a1) % 2 == 1 && (b2 - b1) % 2 == 1 && (c2 - c1) % 2 == 1) {
		// return true;
		// }
		// return false;

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c.equals('(') || c.equals('{') || c.equals('[')) {
				stack.push(c);
			} else {
				Character start = stack.peek();
				int before = stack.size();
				if (c.equals(')') && start.equals('(')) {
					stack.pop();
				} else if (c.equals('}') && start.equals('{')) {
					stack.pop();
				} else if (c.equals(']') && start.equals('[')) {
					stack.pop();
				}
				int after = stack.size();
				if (before == after) {
					return false;
				}
			}
		}
		return true;
	}
}
