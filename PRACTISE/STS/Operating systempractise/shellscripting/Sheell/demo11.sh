#!/bin/bash #sheman line 

# intialization
# while [ condition ]
# do
#     .....
#   modification 
# done


echo -n "Enter Number : "
read num 

echo "$num 's table : "
i=1
while [ $i -lt 11 ]
do 
	result=`expr $num \* $i`
	echo $result
	i=`expr $i + 1`
done
