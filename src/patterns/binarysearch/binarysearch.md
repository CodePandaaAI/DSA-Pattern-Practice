# 🔍 Binary Search Pattern

Binary Search is a powerful search algorithm used on **sorted arrays or lists**. Instead of checking every element one by one (like Linear Search), it **divides the search space in half every time**, drastically reducing the number of steps needed.

---

## 🧠 Core Idea:
> "When the data is sorted, we don’t need to look everywhere.  
> Just look in the middle, then eliminate half the data based on comparison."

It follows the **Divide and Conquer** strategy.

---

## 🧮 Time Complexity:
- ✅ Best Case: `O(1)` → Target found at mid
- 🔁 Average/Worst Case: `O(log n)` → Because we halve the search space every time

---

## ⚒️ Key Components of Binary Search:

| Term     | Meaning                                 |
|----------|-----------------------------------------|
| `start`  | Beginning index of current search space |
| `end`    | Ending index of current search space    |
| `mid`    | Middle index: `(start + end) / 2`       |
| `target` | The value we’re trying to find          |

---

## 🧩 Binary Search Logic:

```kotlin
while (start <= end) {
    val mid = (start + end) / 2
    when {
        nums[mid] == target -> return mid  // Found it!
        nums[mid] < target -> start = mid + 1  // Target is on right
        else -> end = mid - 1  // Target is on left
    }
}
