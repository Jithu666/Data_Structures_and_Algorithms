clear
echo "enter your age"
read age
case $age in 
[0-9]1[0-7])echo "the candidate is not eligible for voting";;
1[8-9]|[2-9][0-9]|1[0-4][0-9])echo "the candidate is eligible to vote";;
*)echo "enter appropriate age";;
esac