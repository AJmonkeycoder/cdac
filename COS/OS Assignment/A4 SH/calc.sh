#!/bin/bash

echo "---CALCULATOR---"
echo "Enter single line input with spaces in between operator and numbers "

echo ""
echo "Press + for Addition"
echo "Press - for Subtraction"
echo "Press * for Multiplication"
echo "Press / for Division"
echo ""

read -p "" num1 op num2
#echo -n $num1 $operator $num2
operator=$op
result=1
if [ "$operator" == "+" ]
then
	result=$(( $num1+$num2 ))
elif [ "$operator" == "-" ]
then
	result=$(( $num1-$num2 ))
elif [ "$operator" == "*" ]
then
	result=$(( $num1*$num2 ))
elif [ "$operator" == "/" ]
then
	result=$(( $num1/$num2 ))

else
	echo "Invalid operator"
fi

echo -n " = $result"
echo ""
