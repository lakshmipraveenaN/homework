package dailytask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class isornotprogram {
	public boolean iscountandnotcount(String s)
	{
		//String s="thisisnot";
		String s2[]=s.split(" ");
		int iscount=0;
		int notcount=0;
		boolean flag=false;
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].contains("is"))
			{
				iscount+=+1;
			}
			else if(s2[i].contains("not"))
			{
				notcount+=+1;
			}
		}
		if(iscount==notcount)
		{
			flag =true;
			System.out.println("both is and not count are equal+"+flag);
		}
		else
		{
			flag=false;
			System.out.println("both is and not count are  not equal+" +flag);
		}
		return flag;

	}
	@Test
	public void test1()
	{
		String s="thisisnot";
		boolean flag = iscountandnotcount(s);
		Assert.assertEquals(flag, "false");
	}


}
