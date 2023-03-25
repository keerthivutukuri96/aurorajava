package switchcase;

public class myarray2 {

	public static void main(String[] args) {
		int[][] myarray2= new int[2][3];
		
		myarray2[0][0] = 1;
		myarray2[0][1] = 2;
		myarray2[0][2] = 3;
		
		
		myarray2[1][0] = 4;
		myarray2[1][1] = 5;
		myarray2[1][2] = 6;
		
				
		for(int i=0;i<myarray2.length;i++) {
			for(int j=0;j<myarray2[i].length;j++) {
				
				//myarray2[i][j]=(int)(Math.random()*100);
				System.out.print(myarray2[i][j]+" ");

			}
			System.out.println();
		}
		
		
		

	}

}
