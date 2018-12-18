
public class ArrayIndexDistance {
	private boolean flag;

	public boolean isPresentAtDistance(int k) {
		// TODO Auto-generated method stub
		int[] array1={1,2,3,2,4,5};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=(i+1);j<array1.length;j++)
			{
				if(array1[i]==array1[j])
				{
					System.out.println((j-i));
					if((j-i)<=k)
					{
						flag=true;
					}
					else
						flag=false;
				}
			}
		}
		return flag;
	}

}
