package TestCaseGen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectVar{
	
	public static void createVariable(String line) throws IOException
	{
		ArrayList<String> type=new ArrayList<String>();
		ArrayList<String> name=new ArrayList<String>();
		
	
		
		/*Pattern p=Pattern.compile("VAR\\s([a-zA-Z0-9]*)\\s([a-zA-Z0-9]*)(\\s)*=");
		Matcher m=p.matcher(line);
		while(m.find())
		{
			
			System.out.println("single assignment");
			String words[]=line.split(" ");
			type.add(words[1]);
			name.add(words[2]);
			System.out.println(type.get(0)+" "+name.get(0));
		}
		
		*/
		String temp[]=line.split("=|;");
		String words[]=temp[0].split(" ");
		String varname[]=words[2].split(",");
		for(int i=0;i<varname.length;i++)
		{	if(i!=varname.length-1) {
			//System.out.println(words[1]+" "+varname[i]);
			type.add(words[1]);
			name.add(varname[i]);
		}
			else {
			//System.out.println(words[1]+" "+varname[i].substring(0,varname[i].length()));
			type.add(words[1]);
			name.add(varname[i].substring(0,varname[i].length()));
			}
		}
		
		for(int i=0;i<type.size();i++)
		{
			System.out.println(type.get(i)+" "+name.get(i));
		}
		ArrayList<String> output=VarConv.conv(type,name);
		FileWriter f=new FileWriter("C:\\Users\\User\\git\\RTforRapid\\PE-DS901\\src\\TestCaseGen\\OutputToZ3.txt");
		for(int i=0;i<output.size();i++)
		{
			
			f.write(output.get(i)+"\n");
			
		}
		f.close();
		System.out.println(output);
		
	}

}
