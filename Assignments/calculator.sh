#!/bin/bash

echo "What is your first number?";

read num1;

echo "What is your second number?";

read num2;

echo "to divide please use d"

echo "What is your operator?";

read operator;

case $operator in
    d)
    echo $(($num1 / $num2));;
    +)
    echo $(($num1 + $num2));;
    -)
    echo $(($num1 - $num2));;
    *)
    echo $(($num1 * $num2));;
    \?)
    echo error
esac
