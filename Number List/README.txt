Shashank loves to play with arrays a lot. Today, he has an array A consisting of N positive integers. At first, Shashank listed all the subarrays of his array A on a paper and later replaced all the subarrays on the paper with the maximum element present in the respective subarray.

For eg: Let us consider the following array A consisting of three elements.

A = {1,2,3}

List of Subarrays:

{1}

{2}

{3}

{1,2}

{2,3}

{1,2,3}

Final List:
{1}

{2}

{3}

{2}

{3}

{3}

Now, Shashank wondered how many numbers in the list are greater than K.

Input Format

The first line of input contains a single integer T denoting the number of test cases. The first line of each test case contains two space-separated integers, N and K, where N denotes the number of elements in the array A. The next line of each test case contains N space separated integers, each denoting an element of array A.

Constraints 
1≤T≤105 
1≤N≤2×105 
1≤Ai≤109 
0≤K≤109 
Sum of N over all test cases does not exceed 106.

Output Format

For each test case, Print the required answer in a separate line.

Sample Input

2
3 2
1 2 3 
3 1 
1 2 3 
Sample Output

3
5
Explanation

In the first test case, there are 3 numbers in the list greater than 2. 
In the second test case, there are 5 numbers in the list greater than 1.
