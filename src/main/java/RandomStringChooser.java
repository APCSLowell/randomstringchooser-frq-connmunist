import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> words;
  
public RandomStringChooser(String[] wordArray)
{
  words = new ArrayList<String>();
  for(string w: wordArray)
      words.add(w);
}
public string getNext(){
if(words.size() == 0)
    return "NONE";
int i = (int)(Math.random() * words.size());
  return words.remove(i);
}
}
