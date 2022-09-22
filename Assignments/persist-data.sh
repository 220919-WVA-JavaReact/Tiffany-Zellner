#!/bin/bash

data="MOCK_DATA.csv";


echo "What's your first name?";

read fname;

echo "What's your last name?";

read lname;

echo "What's your email address?";

read email;

echo "Set your username";

read uname;

echo "Set your password";

read pw;

echo "$fname,$lname,$email,$uname,$pw">> $data;

