package TestCaseGen;
import java.util.ArrayList;

class CFGNode{
	String Type;
	String condition;
	ArrayList<CFGNode> next;
	
	CFGNode(String Type, String condition){
		this.Type = Type;
		this.condition = condition;
	}
}

class CFGTree{
	private CFGNode root;
	CFGTree(CFGNode root){
		this.root = root;
	}
	public void add(CFGNode parent, CFGNode child) {
		parent.next.add(child);
		System.out.println("Successfully added child [" + child.condition + "] to parent [" + parent.condition + "]");
	}
	
	public ArrayList<String> returnConditions(CFGNode root){
		ArrayList<String> res = new ArrayList<String>();
		if(root == null)
			return res;
		for(int i = 0; i < root.next.size(); i++) {
			ArrayList<String> temp = returnConditions(root.next.get(i));
			for(int j = 0; j < temp.size(); j++) {
				res.add(root.condition + " AND " + temp.get(j));
			}
		}
		return res;
	}
	
}

public class CFG {
	
}
