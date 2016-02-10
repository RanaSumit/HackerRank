Given a list of nn integers, A={a1,a2,…,an}A={a1,a2,…,an}, and another integer, kk representing the expected sum. Select zero or more numbers from AA such that the sum of these numbers is as near as possible, but not exceeding, to the expected sum (kk).

Note

Each element of AA can be selected multiple times.
If no element is selected then the sum is 0.
Input Format

The first line contains TT the number of test cases. 
Each test case comprises of two lines. First line contains two integers, nn kk, representing the length of list AA and expected sum, respectively. Second line consists of nn space separated integers, a1,a2,…,ana1,a2,…,an, representing the elements of list AA.

Constraints 
1≤T≤101≤T≤10 
1≤n≤20001≤n≤2000 
1≤k≤20001≤k≤2000 
1≤ai≤2000,where i∈[1,n]1≤ai≤2000,where i∈[1,n]
Output Format

Output TT lines, the maximum sum for each test case which is as near as possible, but not exceeding, to the expected sum (k).

Sample Input

2
3 12
1 6 9
5 9
3 4 4 4 8
Sample Output

12
9
Explanation

In the first test case, one can pick {6, 6}. In the second, we can pick {3,3,3}.
