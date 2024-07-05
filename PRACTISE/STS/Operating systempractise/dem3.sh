#!/bin/bash

echo "Enter Radius "
read r

area=$(echo "3.14 * $r * $r "| bc)
echo :"Area of circle =$area"
