#fibbonacci number 
#!/bin/bash

echo -n "Enter the Number "
read num
a=0
b=1
c=0
i=1
while [ $i -le $num ]
do
	c=`expr $a + $b`
	echo -n "$c"
	i=`expr $i + 1` 
        a=$b
	b=$c 
done


