package junitstrings;
public class Junit_Strings {
	public String Check(String s)
	{

		String s1 = "";
			
		for(int i=0;i<s.length();i++)
		{
			if(i==0 && s.charAt(i)=='A')
			{
				continue;
			}
			if(i==1 && s.charAt(i)=='A')
			{
				continue;
			}
			else {
				s1=s1+s.charAt(i);
		
			}
		}
		return s1;
	}
}
