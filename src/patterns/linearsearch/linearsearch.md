# List Of Questions Solved

- First Occurrence of a target
- Last Occurrence of a target
- Check if target exists
- Count Occurrence of a target
- Find Minimum Element
- Find All Occurrences of a target
- Find First Duplicate Element
- Find Missing Number (1 to N)

# Explanation of Linear Search

Imagine you have a line of boxes, and each box has a number inside. Linear search is like looking through these boxes one by one, starting from the very first box.

**How it works, step by simple step:**

1.  **Start at the beginning:** You begin your search with the first box in the line.
2.  **Look inside:** You open the box and check the number inside.
3.  **Is it what you're looking for?**
    * **Yes!** If the number in the box is the "target" you're searching for, then you've found it! You can stop here (for questions like "Check if target exists" or "First Occurrence").
    * **No.** If the number is not your target, you close the box and move to the next box in the line.
4.  **Keep going:** You repeat steps 2 and 3 for each box, moving from left to right, one after the other.
5.  **Until you find it or reach the end:** You continue this process until either you find the target number in one of the boxes, or you've looked through every single box in the line.
6.  **Not found:** If you reach the end of the line of boxes and haven't found your target, then it means the target is not in the line.

**Think of it like this:**

If you lose your keys in your house, linear search is like checking every single room, starting from the living room, then the kitchen, then the bedroom, and so on, until you either find your keys or you've checked every room.

**Why is it easy?**

It's easy because the method is straightforward. You don't need to do any special sorting or calculations beforehand. You just go through each item one by one.

**How it helps with the questions:**

* **First Occurrence:** You stop as soon as you find the target for the very first time.
* **Last Occurrence:** You go through the entire list and remember the *last* position where you found the target.
* **Check if target exists:** You go through the list and if you find the target even once, it exists. If you reach the end without finding it, it doesn't exist.
* **Count Occurrence:** You go through the entire list and keep a count of how many times you find the target.
* **Find Minimum Element:** You go through the entire list and keep track of the smallest number you've seen so far.
* **Find All Occurrences:** You go through the entire list and record the position every time you find the target.
* **Find First Duplicate Element:** You can use a variation where for each element, you check the rest of the list to see if it appears again. The first one you find that has a duplicate is your answer.
* **Find Missing Number (1 to N):** You can check if each number from 1 to N exists in your list. The first one you don't find is the missing number.

Linear search is simple and works well for small lists. However, for very large lists, it can take a long time because you might have to check every single item in the worst case!