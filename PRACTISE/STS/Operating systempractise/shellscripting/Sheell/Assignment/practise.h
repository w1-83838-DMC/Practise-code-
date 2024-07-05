#!/bin/bash 
echon -n "Enter the Numbers "

flag=1
read number 

for((i=2; i*i<=number; i++))
do
	if((num % i == 0))
	then 
		flag=0
	break
	fi
done

if[ $number -eq 1 ]
then 
	echo -n "The $number is a prime number "
else 
	echo -n "The $number is not a prime number "
fi
