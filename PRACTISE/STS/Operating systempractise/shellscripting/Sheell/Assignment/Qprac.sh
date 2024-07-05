#!/bin/bash

run filename

for i in `ls -a $filename`
do
	if [ [ $i == .* ]];
	then 
		echo $i
	fi 
done
