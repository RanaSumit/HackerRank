The Head Librarian at a library wants you to create a program that calculates the fine for returning a book after the return date. 
You are given the actual and the expected return dates. Calculate the fine as follows:

If the book is returned on or before the expected return date, no fine will be charged. In other words, the fine is 00.
If the book is returned in the same calendar month as the expected return date, the fine = 1515 Hackos ×× the number of late days.
If the book is not returned in the same calendar month but in the same calendar year as the expected return date, the fine = 500500 Hackos×× the number of late months.
If the book is not returned in the same calendar year, the fine is fixed at 1000010000 Hackos.
Input 
You are given the actual and the expected return dates in D M YD M Y format on two separate lines. The first line contains the
D M YD M Y values for the actual return date and the next line contains the D M YD M Y values for the expected return date. 
Here's a sample:

9 6 2015
6 6 2015
Constraints: 
1≤D≤311≤D≤31 
1≤M≤121≤M≤12 
1≤Y≤30001≤Y≤3000 
The given date is a valid date on a Gregorian calendar.

Output 
Print a single value representing the fine. 
The sample output for the above input would be 4545. 
Since the actual return date is 33 days later than expected, the fine is calculated as 15×3=4515×3=45 Hackos.
