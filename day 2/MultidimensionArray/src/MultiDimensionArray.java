
public class MultiDimensionArray {

	private boolean flag;

	public boolean isPresent(int[][] input,int num) {
		flag=false;
		
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[i].length;j++)
			{
				 if(num==input[i][j])
				 {
					 System.out.println("Element "+num+" found at '"+(i+1)+"'th row '"+(j+1)+"' th column");
					 flag=true;
				 }
			}
		}
		return flag;
	}

}
