#!/bin/bash 

echo "--------CALCULATOR--------"
echo "Press + for Addition"
echo "Press - for Subtraction"
echo "Press * for Multiplication"
echo "Press / for Division"
echo "Press e for EXIT"

read -p "num1=> " a
read -p "Op=> " op
read -p "num2=> " b

if [[ $op == + ]]
then
	result=$(( $a+$b ))
elif [[ $op == - ]]
then
	result=$(( $a-$b ))
elif [[ $op == \* ]]
then
	result=$(( $a*$b ))
elif [[ $op == / ]]
then
	result=$(( $a/$b ))
else
	echo "Invalid Input"
nan
fi

echo "Ans= $result"
