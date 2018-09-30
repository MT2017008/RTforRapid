package TestCaseGen;

import java.io.*;
import java.util.*;

public class RapidToZ3 
{
	
	public static void main(String args[]) throws IOException
	{
			
		FileReader f=new FileReader("C:\\Users\\User\\git\\RTforRapid\\PE-DS901\\src\\TestCaseGen\\TestProgramRapid.txt");
		BufferedReader br=new BufferedReader(f);
		String temp="";
		while((temp=br.readLine())!=null)
		{
			System.out.println(temp);
			String words[]=temp.split(" ");
			if(words[0].equals("VAR"))
			{
				DetectVar.createVariable(temp);
			}
		}
		
	}
}
