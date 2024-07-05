#!/bin/bash

echo -n "Enter the Number "
read number 
flag=1
for((i=2; i*i<=number; i++))
do
	if (( number % i == 0 ))
	then
		flag=0
	break
	fi
done

if [ $flag -eq 1 ]
then 
	echo "The Given Number is Prime Number "
else
	echo "The Given Number is not prime Number "
fi
