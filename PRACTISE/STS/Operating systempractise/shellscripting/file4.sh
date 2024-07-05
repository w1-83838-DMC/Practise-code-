#!/bin/bash

echo "Enter Radius : "
read r

area=$(echo "3.142 * $r * $r " | bc)
echo "circle area = $area"

:
