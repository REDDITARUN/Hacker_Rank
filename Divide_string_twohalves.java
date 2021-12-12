
/* Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail). 

Sample Input:
2
Hacker
Rank
Sample Output

Hce akr
Rn ak
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Takes number of constraints
        int n = in.nextInt();
        String s;
        
        for(int i=0; i<n; i++)
    {
        
        s = in.next();
        
        for(int j=0; j<s.length(); j++)
        {
            if(j%2==0)
            {
                System.out.print(s.charAt(j));
            }
        }
        System.out.print(" ");
         for(int j=0; j<s.length(); j++)
        {
            if(j%2==1)
            {
                System.out.print(s.charAt(j));
            }
        }
        System.out.println();
    }
    

        
    }
}