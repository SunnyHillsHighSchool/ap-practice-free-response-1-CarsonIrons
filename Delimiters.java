import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
	ArrayList<String> delimiters = new ArrayList<String>();
  for(int i=0;i<tokens.length;i++){
if(tokens[i].equals(openDel)||tokens[i].equals(closeDel))
delimiters.add(tokens[i]);
  }
  
  	return delimiters;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
    int count=0;
	for(int i=0;i<delimiters.size() && count>=0;i++){
if(delimiters.get(i).equals(openDel))
count++;
if(delimiters.get(i).equals(closeDel))
count--;
  }
  
  	return count==0;
	}
}