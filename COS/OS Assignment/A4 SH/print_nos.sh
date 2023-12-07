#!/bin/bash

number=5

while [ $number -ge 1 ]
do
	echo $number
	number=$((number-1))
done
