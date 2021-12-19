# Most_Active_Cookie
## The way to execute:

Step 1: javac most_active_cookie.java\
Step 2: java most_active_cookie cookie_log.csv -d 2018-12-09\
#### **Notice**: The searchDate of "2018-12-09" can be changed into different ones.


## Algorithm Steps:

1. Initial the args[0] is cookie_log.csv (input File), args[1] is -d(timeZone), args[2] is searchDate(2018-12-09);
2. Read the input file cookie_log.csv;
3. For each line of the input file, Seperate into two Strings, cookie and timestamp;
4. Get the timestampDate from the timestamp;
5. Compare the timestampDate and searchDate;
   if they are equal, use map to store the cookies and frequency of the cookies;
6. Iterate the map, check the highest frequency;
7. Iterate the map, if the cookeis frequency are the highest, then system out.

## Comment:
1. For the Algorithem Step **3**, if can't use "split", then change the code into\
    (1)Create a string array result with two element to store cookie and timestamp, a counter to count where to spilt;\
    (2)Use counter to find the position of comma;\
    (3)Store the cookie in result[0], and store the timestamp to result[1];

2. For the Algorithm Step **4**, if can't use "split", then change the code into\
    (1)Create a string array result with two element to store the timestampDate and timestampHour, a counterT to count where to split;\
    (2)Use counterT to find the position of 'T';\
    (3)Store the timestampDate to result[0], and store the timestampHour to result[1];
    
3. For the Algorithm Step **5**， if can't use ".equals", then change the code into\
    (1)Check the length of two Dates, if length is not same, then not equal;\
    (2)Check each character of two Dates, if the characters are not same, then not equal;\
    (3)Otherwise, they are equal.
    
4. For the Algorithm Step **5**, if can't use "getOrDefault", then chage the code into\
    (1)Check if the map contains the key;\
    (2)If contains, get the value of the key and update the value by one;\
    (3)If not, put the key into map, and the value is one.
#### **Notice**: Because this version just use a main method without other methods or classes, so there is no test.
    **For the comment parts, it's also in the corresponding position of the code**

                                                                                                                                                     --12/19 ZY
   
   
   
