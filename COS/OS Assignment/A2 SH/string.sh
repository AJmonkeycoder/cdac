#!/bin/bash
read -p "Enter a string: " str
cp file1 file2
sed "s/$str//g" file2
