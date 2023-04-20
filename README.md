# CodeSmash2023Task

## Question

A company is running a promotion in which buyers receive prizes for purchasing a secret combination of fruits. The combination will change each day, and the team running the promotion wants to use a code list to make it easy to change the combination. The code list contains groups of fruits. Both the order of the groups within the code list and the order of the fruits within the groups matter. However, between the groups of fruits, any number, and type of fruit is allowable. The term "anything" is used to allow for any type of fruit to appear in that location within the group.
Consider the following secret code list: [[apple, apple], [banana, anything, banana]]
Based on the above secret code list, a buyer who made either of the following purchases would win the prize: orange, apple, apple, banana, orange, banana apple, apple, orange, orange, banana, apple, banana, banana
Write an algorithm to output 1 if the buyer is a winner else output 0.
- **Input** - The input to the function/method consists of two arguments: codeList, a string array of space-separated values representing the order and grouping of specific fruits that must be purchased in order to win the prize for the day. shoppingCart, a list representing the order in which a buyer purchases fruit.
- **Output** - Return an integer 1 if the buyer is a winner else return 0.
Note 'anything' in the codeList represents that any fruit can be ordered in place of 'anything' in the group. 'anything' has to be something, it cannot be "nothing." 'anything' must represent one and only one fruit. If secret code list is empty then it is assumed that the buyer is a winner.
Please provide written explanation of your approach.

## Examples
### Example 1
-	Input: codeList = [[apple, apple], [banana, anything, banana]] shoppingCart = [orange, apple, apple, banana, orange, banana]
-	Output: 1
-	Explanation: codeList contains two groups - [apple, apple] and [banana, anything, banana]. The second group contains 'anything' so any fruit can be ordered in place of 'anything' in the shoppingCart. The buyer is a winner as the buyer has added fruits in the order of fruits in the groups and the order of groups in the codeList is also maintained in the shoppingCart.
### Example 2
-	Input: codeList = [[apple, apple], [banana, anything, banana]] shoppingCart = [banana, orange, banana, apple, apple]
-	Output: 0
-	Explanation: The buyer is not a winner as the buyer has added the fruits in order of groups but group [banana, orange, banana] is not following the group [apple, apple] in the codeList.
### Example 3
-	Input: codeList = [[apple, apple], [banana, anything, banana]] shoppingCart= [apple, banana, apple, banana, orange, banana]
-	Output: 0
-	Explanation: The buyer is not a winner as the buyer has added the fruits in an order which is not following the order of fruit names in the first group.
### Example 4
-	Input: codeList = [[apple, apple], [apple, apple, banana]] shoppingCart= [apple, apple, apple, banana]
-	Output: 0
-	Explanation: The buyer is not a winner as the first 2 fruits form group 1, all three fruits would form group 2, but can't because it would contain all fruits of group 1.

## Time and Space Complexity

- **Time Complexity**  of the code is O(n*m). This is because it iterates through each element in the codeList and shoppingCart until it finds a match or reaches the end.
- **Space Complexity** of the code is O(k) where k is the lenght of the longest sublist in the codeList.

## Explenation 

Given that my team and I had experience in doing similar tasks during Advent of Code this task was not that difficult. We first started by thinking about how the code should function and what all we needed to do to make it work. Instantly We knew that the for or while loop was needed to be used to iterate through the first list and another one inside that loop to iterate through the other list. That is where we started, after that we needed to check if the elements of the first list match the elements of the second list. but we had a problem here in the main function we noticed that the elements in the codeList were being saved as a single string so we decided to convert that string into a list that we can iterate through we just simply removed the first and last elements of the string and split it where we had ", ". Finally we used few variables to keep track of what part of the lists we have passed and to check if we have found all parts of the codeList in the shoppingCartList. After all of that we have made couple of unit test just to test out the function, this is where we realized that we were missing one case and that is if the codeList is empty so we simply added a single if statement at the beginning of the function that will check if the codeList is empty and return 1 if it is.  
