/*
 * Problem: Longest Common Prefix
 * Difficulty: Easy
 * Language: Java
 * Date Solved: 10/2/2026
 * Runtime: 0 ms
 * Memory: 42.9 MB
 * URL: https://leetcode.com/problems/longest-common-prefix/submissions/2160127976/
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {

     if(strs==null || strs.length==0){
        return " ";
     }

     String prefix = strs[0];

     for(int i=0;i<strs.length;i++){
        while(!strs[i].startsWith(prefix)){
            prefix = prefix.substring(0,prefix.length()-1);

            if(prefix.isEmpty()){
                return "";
            }
        }
     }
        return prefix;
    }
    }


    /* In this solution, In line 4, we check it if the provided array of string is null or not?
        if it is null then we return " " immediately.
        Then we create a variable of String type.
        If array of string is not null then we assign first element of array as prefix and then we check for the prefix is actually prefix of other element or not and if not then we remove last character from out prefix untill it becomes the actual prefix of this element of array using while(!strs[i].startsWith(prefix)) if the element starts with our actual prefix then it will escape from while loop. But if it fails, prefix will remove its last character and again checks for matching using prefix = prefix.substring(0,prefix.length()-1); 
        Then the output will come. If it still fails, it will keep removing its character from its last, untill or unless it exactly matches the prefix.
        then we checks for empty case. This means if if none of the elements starts with out prefix, the prefix will be null because it is removing its elements until matches. So, we checks for empty using if(prefix.isEmpty) and if it is true, then we will return "";
         If not, then we return prefix as output.

         we use .startsWith(string) to check for is it starts with the provided string or character?

         We use .substring(start,end-1) to remove last character from this string.
         where 0 is nothing but it is the starting address of this string. for example: in "Yukesh" Y is at 0 position (Start) and h is at 5 position (end).
         */
         