#!/bin/bash

read -p -r "Where would you like to stop?" end
x=0
y=1
while [ "$y" -le "$end" ]
do
  z=$(("$x"+"$y"))
echo "$z"
x=$y
y=$z
done
