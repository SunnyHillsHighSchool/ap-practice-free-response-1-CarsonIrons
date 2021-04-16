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

//Delimiter Methods
//By Carson Irons P2
	public ArrayList<String> getDelimitersList(String[] tokens)
	{
//create list for output
	ArrayList<String> delimiters = new ArrayList<String>();
  //traverse tokens
  for(int i=0;i<tokens.length;i++){
//add delimiters to output list
if(tokens[i].equals(openDel)||tokens[i].equals(closeDel))
delimiters.add(tokens[i]);
  }
  //return delimiters 
  	return delimiters;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
 //create moderator 
    int count=0;
    //traverse list and check for delimiters, use count to check for balance
	for(int i=0;i<delimiters.size() && count>=0;i++){
if(delimiters.get(i).equals(openDel))
count++;
if(delimiters.get(i).equals(closeDel))
count--;
  }
  //return result
  	return count==0;
	}
}