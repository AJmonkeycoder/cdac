#!/bin/bash

echo "Enter a number: "
read number

sum=0

while [ $number -gt 0 ]
do 
	rem=$((number%10))
	sum=$((sum+rem))
	number=$((number/10))
done

echo "The sum of all digit of given number is : $sum"
