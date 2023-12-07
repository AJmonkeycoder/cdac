#!/bin/bash

echo "Enter the number: "
read number

reverse_num=0

while [ $number -gt 0 ]
do
	rem=$((number%10))
	reverse_num=$((reverse_num*10+rem))
	number=$((number/10))
done

echo "The number after reversing is : $reverse_num"
