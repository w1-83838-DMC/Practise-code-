#!/bin/bash

echo -n "Enter path : "
read path 

if [ -e $path ]
then 
	echo "$path : exist "
	if [ -f $path ]
	then 
		echo "$path is a regular file "
	elif [ -d $path ]
	then 
		echo "$path is a directory file "
	else
		echo "path is something else "
	fi
else 
	echo "$path : doesn't exixt "
fi

