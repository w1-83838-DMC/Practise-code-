#!/bin/bash

#logical operators 

# -a -o // And and or ! not 

echo "Enter the file name :  "
read file 

if [ -e $file ]
then
	if [ -f $file -a -x $file ]
	then 
		echo "regular executable file "
	else
		echo "not a regular file or not has executable permission "
	fi
else
	echo " file doesn't exist "
fi
