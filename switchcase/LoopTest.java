package switchcase;

public class LoopTest {

	public static void main(String[] args) {
		
		int i = 0;
		int k = 0;
		int count =0;
		while(i<3)
		{
			for(int j=0;j<4;j++)
			{
				do {
					System.out.println("i------>"+i+"j---->"+j+"k---->"+k);
					k++;
					count++;
				}while(k<5);
			}
			i++;
			System.out.println("Total Count : "+ count);
		}

	}

}
