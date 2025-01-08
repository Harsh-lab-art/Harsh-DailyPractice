import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Combination
{
    public static List<String>
    generateCombinations(String[]words,String[]brokenkeys)
    {
        List<String>combinations=new ArrayList<>();
        for(String word:words)
        {
            combinations.addAll(generateCombinationsHelper(word,brokenkeys));
        }
        return combinations;
    }
    public static List<String>generateCombinationsHelper(String word,String[]brokenKeys)
    {
        List<String>lowercaseCombinations=new ArrayList<>();
        if(word.isEmpty())
        {
            lowercaseCombinations.add("");
            return lowercaseCombinations;
        }
        char firstChar=word.charAt(0);
        String remainingWord=word.substring(1);
        if(containsIgnoreCase(brokenKeys,Character.toString(firstChar)))
        {
            return generateCombinationsHelper(remainingWord,brokenKeys);
        }
        for(char c : new char[]{Character.toLowerCase(firstChar),Character.toUpperCase(firstChar)})
        {
            List<String>restCombinations=generateCombinationsHelper(remainingWord, brokenKeys);
            for(String rest:restCombinations)
            {
                lowercaseCombinations.add(c+rest);
            }
        }
    
     return lowercaseCombinations;
    }

public static boolean containsIgnoreCase(String[] arr,String key)
{
  for(String str:arr)
  {
    if(str.equalsIgnoreCase(key))
    {
        return true;
    }
  }
  return false;
}

public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string of words");
    String wordInput=sc.nextLine(); 
    String[]words=wordInput.split(" ");
    System.out.println("enter the broken keys (separated by commas)");
    String brokenKeysInput=sc.nextLine();
    String[] brokenKeys=brokenKeysInput.split(" ");
    List<String>combinations=generateCombinations(words,brokenKeys);
    System.out.println("\nCombinations");
    for(String combination:combinations)
    {
        System.out.println(combination);
    }
    int originalLength=calculateOriginalLength(words);
    int afterBrokenKeysLength=calculateAfterBrokenKeysLength(combinations);
    System.out.println("After broken keys length "+afterBrokenKeysLength);
}
public static int calculateOriginalLength(String[]words)
{
    int length=0;
    for(String word:words)
    {
        length+=word.length();
    }
    return length;
}
public static int calculateAfterBrokenKeysLength(List<String>combinations)
{
    int length=0;
    for(String combination : combinations)
    {
        length+=combination.length();
    }
    return length;
}
}
