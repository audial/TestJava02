package suma;

public class Suma {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0 ; i < 1000 ; i++) {
			if(i % 3 == 0) {
				return;
			}
			if(i % 5 == 0) {
				count++;
				System.out.println(count+ " " + i);
			}
		}

	}

}
