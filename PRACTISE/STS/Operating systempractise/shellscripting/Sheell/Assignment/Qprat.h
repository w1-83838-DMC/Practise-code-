#!/bin/bash

echo -n "Enter the Number "

read number

i=1
while [ $i -lt 11 ]
do
	mul=`expr $number \* $i`
	echo $mul
	i=`expr $i + 1`
done
