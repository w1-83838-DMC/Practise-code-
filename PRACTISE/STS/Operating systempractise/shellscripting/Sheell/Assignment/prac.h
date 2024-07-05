#!bin/bash
echo -n "Enter the Numbers : "
read number 
for i in `seq 10`
do
	mul=`expr $number \* $i`
	echo "Multiplication is :  $mul"
done
