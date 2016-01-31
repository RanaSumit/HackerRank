Sami's spaceship crashed on Mars! She sends n sequential SOS messages to Earth for help.
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, S, determine how many letters of Sami's SOS have been changed by radiation.

Input Format

There is one line of input: a single string, S.

Note: As the original message is just SOS repeated n times, S's length will be a multiple of 3.

Constraints 
1≤|S|≤99
|S| % 3=0
S will contain only uppercase English letters.

Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 1

SOSSPSSQSSOR
Sample Output 1

3
Sample Input 2

SOSSOT
Sample Output 2

1
Explanation

Sample 1

S = SOSSPSSQSSOR, and signal length |S|=12. Sami sent 4 SOS messages (i.e.: 12/3=4).

Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR

We print the number of changed letters, which is 3.

Sample 2

S = SOSSOT, and signal length |S|=6. Sami sent 2 SOS messages (i.e.: 6/3=2).

Expected Signal: SOSSOS 
Received Signal: SOSSOT

We print the number of changed letters, which is 1.
