#!/bin/bash

echo "Enter your weight in Kgs: "
read weight

if (( weight>=30 && weight<=250 ))
	then
		echo "Congratulations! you are eligible for MBT health club"
	else
		echo "Sorry, you are not eligible as your weight is not whithin the given range"
fi
