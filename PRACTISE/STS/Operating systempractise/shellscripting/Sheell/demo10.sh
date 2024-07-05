echo -n "Enter two Operands : "

read op1 op2

echo -e "1.Add\n 2.Sub\n3.Mul\n4.Div\n0. No operations "
echo -n "Enter your choice "

read choice

res=0

case $choice in
1)
	res=`expr $op1 + $op2`
	;;
2)
	res=`expr $op1 - $op2`
	;;
3) 
	res=`expr $op1 \* $op2`
	;;
4)
	res=`expr $op1 / $op2`
	;;

esac

echo "result = $res"
