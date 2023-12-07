#!/bin/bash

hour=$(date +%H)

if ((hour>=0 && hour<12))
then
	echo "Good morning, user!"
elif ((hour>=12 && hour<17))
then
	echo "Good Afternoon, user!"
else
	echo "Good evening, user!"
fi
