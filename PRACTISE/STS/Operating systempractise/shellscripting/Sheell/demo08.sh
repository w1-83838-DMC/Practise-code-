#!/bin/bash #sheman line

# String operations 

# = , != , -z 

str1="sunbeam"

str2="dmc"

if [ $str1 = $str2 ]
then 
	echo "Both the Strings are equals "
else
	echo "Both the Strings are not equals "
fi


if [ -z $str1 ]
then 
	echo "str1 is empty "
else
	echo "str1 is not empty "
fi


#concatination of a string

str3=$str1$str2
echo "str3 = $str3"
