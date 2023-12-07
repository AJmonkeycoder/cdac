#! /bin/bash

for((i=0;i<3; i++));
do
	for((j=0; j<10; j++));
	do
		if [ $i -eq 0 ] || [ $i -eq 2 ]
		then
			if [ $j -eq 4 ]
			then			
				echo -n "*" 
			else
				echo -n " "
			fi
		else
			echo -n "*"
		fi
	done
	echo
done
