package testpractice;

public class Test5_1_4 {
	public static void main(String[] args)
	{
//		char[] storeChar = new char[]{'E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E','E','X','A','M','P','L','E'};
		char[] storeChar = new char[]{'E','X','A','M','P','L','E','E'};
		for(int i = 0 ; i <= storeChar.length-1 ; i++)
			System.out.println("the orignal order: " + storeChar[i]);
		long startTime = System.currentTimeMillis();
		char[] newChar = sortLastLarge(storeChar);
		long endTime = System.currentTimeMillis();
		
		System.out.println("print the result list :");
		
		for(int i = 0 ; i <= newChar.length-1 ; i++)
			System.out.println("the orignal order: " + newChar[i]);
		
		System.out.println("The runtime is : " + (endTime-startTime) + " ms");
	}


	private static char[] sortLastLarge(char[] storeChar) {
		int count = 0;
		while(count != storeChar.length-1)
		{
			for(int i = count+1; i >= 0 ; i--)
			{
				if(storeChar[count+1] < storeChar[i])
				{
					char temp = storeChar[count+1];
					for(int j = count+1; j >= i+1; j--)
					{
						storeChar[j] = storeChar[j-1];
					}
					storeChar[i] = temp;
				}
				
			}
			count ++;
		}
		
		return storeChar;
	}
}
