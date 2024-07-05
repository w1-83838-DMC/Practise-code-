#!/bin/bash  // sheman line 

echo -n "Enter the age : "
read age 

if [ $age -gt 18 ]
then 
	echo "You are adult you can vote "
else
	echo "You are under age "
fi  
