package switchcase;

public class MyArray {

	public static void main(String[] args) {
		int i;
		int[] array = new int[4];
		
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;
//		array[3] = 40;
//				

		for(i=0;i<array.length;i++) {
			
			array[i]=(int)(Math.random()*100);
			//System.out.println(array[i]);
		}
		
		for(int var : array) {
			System.out.println(var);
		}
		for(i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}

	}

}
