#!/bin/bash 

echo "ENter Two Numbers "
read num1 num2
 # command Substitution 

 # substitution result of compand at the place of command 

 sum=`expr $num1 + $num2`
 echo "sum = $sum"

