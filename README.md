# Find-the-Missing-Number-in-an-Arithmetic-Progression
You are given a list of n integers that form an arithmetic progression (AP), but one number is missing in the sequence. The sequence is not necessarily sorted. Write a Java program to find and return the missing number.
 Explanation:
Sorting the array is necessary to analyze the sequence in order.

The common difference is estimated using the first few elements.

A loop checks where the difference between two consecutive terms doesn’t match the expected difference.

It returns the missing number when the pattern breaks.

If the sequence is complete and just missing the last number, it returns the next expected number in the sequence.
