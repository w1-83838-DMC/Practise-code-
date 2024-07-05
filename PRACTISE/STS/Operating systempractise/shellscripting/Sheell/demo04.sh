#!/bin/bash  // Sheman line 

echo -n "Enter  Numbers "
read num1 num2

max=0

if [ $num1 -eq  $num2 ]
then
       max=$num1	
	echo "num1 and num2 are both equals "
elif [ $num1 -gt $num2 ]
then
	max=$num1
	echo "num1 is greater"
else
	max=$num2
	echo "num2 is greater"
fi 

echo "Maximum Numbers is : $max "
