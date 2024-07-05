#!/bin/bash # shamen line

echo -n "Enter the String "

read str

strrev=`echo $str | rev`

if [ $str = $strrev ]

then 
	echo "String is a palindrome String "

else
	echo "String is not a palindrome String "

fi
