# Exception Files

## Due: Mon 12/2 at 11:59 PM

- Create a program called `ExceptionFiles.java`
- Prompt the user for a filename until the user enters the name of a file that exists
- Read in all the lines and store them in an ArrayList of integers
  - If there is any value that is not an integer, skip it and print out the value that was skipped
-  Calculate the mean (formatted to 3 decimal places), median (formatted to one decimal place), max, and min
   -  Write those values to a file called `output.txt`

***Example Input:***\
Enter a filename: gibberish\
File not found. Enter a filename: stillBad.txt\
File not found. Enter a filename: input1.txt\
***Example Contents of input1.txt:***\
3\
4\
cat\
5\
dog\
18\
12\
elephant\
37\
25\
***Example Output to screen:***\
cat was skipped\
dog was skipped\
elephant was skipped\
***Example Contents of output.txt:***\
Mean: 14.857\
Median: 12.0\
Max: 37\
Min: 3
