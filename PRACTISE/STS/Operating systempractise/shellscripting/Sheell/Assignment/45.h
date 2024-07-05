#!bin/bash
echo -n "Enter the Numbers "
read number
i=1
fact=1
while [ $i -le $number ]
do
	fact=`expr $fact \* $i`
	i=`expr $i + 1`
done      

echo "Factorial is $fact"                 
