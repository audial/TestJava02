package square;

public class TriangleBoard {
		public static void main(String[] args) {
			
			int size = 5;
			for(int row = 1; row <= size ; ++row){
				for(int col = 1; col <= row; ++col){
					System.out.print("# ");
				}
				System.out.println();
			}
			
			int size1 = 5;
			for(int row = 1; row <= size1 ; ++row){
				for(int col = 1; col <= row; ++col){
					System.out.print("# ");
				}
				System.out.println();
			}
		}	
		
}
