#!bin/bash 
echo -n "Enter the leap year :"
read year

if [ `expr $year % 4` -eq 0 -a `expr $year % 100` -ne 0 -o `expr $year % 400` -eq 0 ]
then 
	echo -n "$year is a leap year: "
else
	echo -n "$year is not a leap year : "
fi
