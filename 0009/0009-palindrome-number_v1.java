/*
 * Problem: Palindrome Number
 * Difficulty: Easy
 * Language: Java
 * Date Solved: 10/1/2026
 * Runtime: 5 ms
 * Memory: 45.7 MB
 * URL: https://leetcode.com/problems/palindrome-number/submissions/2158960769/
 */

class Solution {
    public boolean isPalindrome(int x) {
        int orig=x;
        int rem,rev=0;
        while(x>0){
            rem = x%10;
            rev = rev*10+rem;
            x/=10;
        }
        return (orig==rev);
    }
}