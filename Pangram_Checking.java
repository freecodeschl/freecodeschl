/*
Pangram Checking
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
Input
First line of input contains of an integer T denoting number od test cases then T test cases follow. Each testcase contains a String S.

Constraints:
1 <= T <= 100
1 <= |S| <= 1000

Note:- String will not contain any spaces
Output
For each test case print in a new line 1 if its a pangram else print 0.
Example
Input:
2
Bawdsjogflickquartzvenymph
sdfs

Output:
0
0

Explanation :
Testcase 1: In the given input, the letter 'x' of the english alphabet is not present. Hence, the output is 0.
Testcase 2: In the given input, there aren't all the letters present in the english alphabet. Hence, the output is 0.

_________________________________________________________________________________________________________________________
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
	static int Check_panagram(String str)
	{
		boolean flag [] = new boolean [26];
		for(int i=0; i<26; i++)
		{
			flag[i]=false;   //arr usme koi as  a true mark nhi hai
		}

		for(int i=0; i<str.length(); i++)
		{
			int index=-1;  //temp
			index=(str.charAt(i)-'a');    //convert to ascii value  256
			if(index != -1 && index < 26)  //0
			{
				flag[index]=true;
			}

		}
		for(int i=0; i<26; i++)
		{
			if(flag[i]==false) return 0;  //if this cond true we are miss some char
		}
		return 1;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0)
		{
			String str = sc.next();
			str=str.toLowerCase();  //java str lower case convert
			System.out.println(Check_panagram(str));
		}
	}
