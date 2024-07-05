#!/bin/bash
echo  "Enter the salary : "
read salary
echo "ENter the da"
read da
echo "Enter the hra"
read hra

pda=$(echo $da \* $salary /100|bc)
phra=$(echo $hra \* $salary /100|bc)
if [ $pda -eq 40 -a $phra -eq 20 ]
then
	gs=$(echo $da + $hra + $salary|bc)
	echo $gs
else
	echo "your pd or hra is below specified or above specified percentage"
fi
