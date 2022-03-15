/*

#newtonschool #divisorofn 
Problem Statement
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
t will be int
n will be long

Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2
Example
Input:
2
9
8

Output
0
3
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int j = 1; j <= t; j++) {
			long n = sc.nextLong();
			int count = 0;
			int i = 0, k = 2;   //global k
			for (i = 1; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					if (i % k == 0) {
						count++;
					}

					if ((n / i) % k == 0) {
						count++;
					}
				}
			}
			i--;
			if ((i * i == n) && (i % k == 0)) {
				count--;
			}
			System.out.println(count);
		}
	}

}
