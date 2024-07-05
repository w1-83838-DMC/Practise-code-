#!/bin/bash  // sheman line 

# File conditionals

# -e $path : true if path exixt

# -f $path : true if file exixt

# -d $path : true if directory exixt


echo -n "Enter path : "

read path 

if [ -e $path ]
then 
	echo "$path : exixt "
       if [ -f $path ]
       then 
		echo "Path is regular file "
	elif [ -d $path ]
	then
		echo "path is directory file "
	else 
		echo "Path is something else "
	fi 
else
	echo "$path : doesn't exixt"

fi	


