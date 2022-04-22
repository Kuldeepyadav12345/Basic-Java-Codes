package Arrays;
//Find second largest number in array without sorting
public class SecondHighest {
public static void main(String[] args) {
// unsorted array
int num[] = { 100, 9, 5, 55, 8, -1, 3, 55,11,22 };
// Length of an array
int n = num.length;
// Initialize highest and second highest with minimum integer value
int highest = 1;
int secondHighest = 0;
//Traverse an array
for (int i = 0; i < n; i++) { 
// If greater than highest 
if (num[i] > highest) {
// Assign highest value into secondhigest
secondHighest = highest;
// Set new highest
highest = num[i];
}
// If number is less than highest and greater than secondHighest
if (num[i] < highest && num[i] > secondHighest) {
// Set second highest
secondHighest = num[i];
}
}
System.out.println("Second highest " + secondHighest);
}
}