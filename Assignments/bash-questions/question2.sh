#!/bin/bash

read -p "Where would you like to stop?" ending
x=0
y=1
echo $x
while [ "$y" -le "$ending" ]
do
  echo $y
  z=$(("$x"+"$y"))
  x=$y
  y=$z
done
