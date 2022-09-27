#!/bin/bash

data=data.csv;

read -p "What's your first name?" fname;
read -p "what's your last name?" lname;
read -p "Whats your email address?" email;
read -p "What's your username?" uname;
read -p "What's your password?" pw;

echo "$fname,$lname,$email,$uname,$pw">> $data;

