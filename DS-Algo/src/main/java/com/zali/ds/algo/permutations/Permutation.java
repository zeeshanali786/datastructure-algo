package com.zali.ds.algo.permutations;

public class Permutation {
    public Permutation()
    {

        String s = "abc";
        btPer(s,"");

    }


    public void btPer(String remainingStr, String GenStr)
    {
        //find exit case
        //iterate
        //resuc

        if(remainingStr.length()==0  )
        {
            System.out.print(GenStr +" ");
            return;
        }

        for(int i = 0; i < remainingStr.length(); i++)
        {
            Character selectedChar = remainingStr.charAt(i);
             String lRemainingStr = remainingStr.substring(0,i)+ remainingStr.substring(i+1);
             String lGenStr = GenStr + selectedChar;
            btPer(lRemainingStr,lGenStr);

        }

    }
    // Function to print all the permutations of str
    public void printPermutn(String str, Integer level)
    {
        String ImmutableStr = str;
        for(int i = 0; i < str.length() - level; i++)
        {
            char last = str.charAt(str.length() -level);


            String before = str.substring(0,i);
            String after   = str.substring(i, str.length() -level);
            String afterAft = str.substring(str.length() -(level - 1),str.length());
            String tmp =  before + last + after + afterAft;
                System.out.print(tmp + " ");
        }
        level ++;
        if(!(level > str.length()))
        printPermutn(str, level);

    }

    // Function to print all the permutations of str
     void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printPermutn(ros, ans + ch);
        }
    }

}
