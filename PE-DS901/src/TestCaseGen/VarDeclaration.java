package TestCaseGen;
import java.util.ArrayList;

class VarConv{
	public static ArrayList<String> conv(ArrayList<String> type, ArrayList<String> name) {
		ArrayList<String> res = new ArrayList<String>();
		for(int i = 0;i < type.size(); i++) {
			switch(type.get(i)) {
				case "num": {
					res.add("(declare-const " + name.get(i) + " Int)");		
				}; break;
				
				case "bool":{
					res.add("(declare-const " + name.get(i) + " Bool)");
				}; break;
				
				default:{
							
						};
			}
		}
		return res;
	}
}

public class VarDeclaration {
	public static void main(String args[]) {
		
	}
}
