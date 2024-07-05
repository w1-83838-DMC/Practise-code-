#!/bin/bash

# if block
# if [ condition ]
# then
# ......
# fi

# if else block
#if[ condition ]
# then 
# .....
# else
#  ....
# fi 


# Relational operators 
# -eq : equal to -ne : Not equal to -lt : less than : -gt : greater than  : -ge : greater then equal to 

echo -n "Enter the Age : "
read age 

if [ $age -ge 18 ]
then 
	echo "You can vote "
else
	echo "You can not vote "
fi 




