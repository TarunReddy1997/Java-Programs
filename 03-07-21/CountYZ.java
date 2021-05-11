package strings;

public class CountYZ {
	static int countYZ(String string) {
		int count = 0;
		for (String str: string.split(" ")) {
			if(str.endsWith("y") || str.endsWith("z")
					|| str.endsWith("Y") || str.endsWith("Z")) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String string = new String("heavy");
		System.out.println("The resultant output");
		System.out.println(countYZ(string));
	}

}
