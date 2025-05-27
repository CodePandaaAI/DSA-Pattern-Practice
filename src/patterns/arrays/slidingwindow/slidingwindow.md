# 🪟 Sliding Window Pattern — Explained (For Humans)

Welcome to the Sliding Window grind! This pattern is one of the most powerful for solving **array or string problems involving subarrays, substrings, or conditions across elements**.

If you're someone who just came from Binary Search and want to understand the next logical pattern — this is it.

---

## 🔍 What's the Sliding Window Pattern?

Imagine a **window** sliding across an array — picking or dropping elements **one at a time** — while you track something like:
- Sum
- Max/Min
- Count
- Length
- Frequency

Instead of checking **every possible subarray (brute force)**, we **slide the window** and do the math as we go. Saves time, saves life.

---

## 🧠 When to Use Sliding Window?

✅ Use it when:

- You’re asked about **subarrays**, **substrings**, or **consecutive elements**
- You're tracking things like **max**, **sum**, **length**, or **count**
- There's a **"fixed size"** or **"condition"** on the subarray

---

## 🧊 Real-Life Analogy

Imagine you're driving and looking out a car window 🚗.  
You can only see **3 people** at a time on the footpath.

As your car moves, you:
- Drop the person who was visible at the back
- Add the new person now visible at the front

Same thing in code:
- You maintain a subarray (window)
- Add new elements as window moves forward
- Drop old ones from the back
- Update your answer while you move

---

## ✌️ Two Types of Sliding Window:

### 1. **Fixed Size Window**

- The window has a **constant size `k`**
- You move the window forward by 1 element each time

**Example Problems:**
- Max/Min sum of subarray of size `k`
- Max number of vowels in substring of length `k`

**🧠 Trick:**  
You maintain a running sum/count, subtract the outgoing, add the incoming

---

### 2. **Variable Size Window**

- The window **expands and shrinks** depending on conditions
- You use `start` and `end` pointers to control the window
- You shrink from the left when the condition is violated

**Example Problems:**
- Longest substring without repeating characters
- Smallest subarray with sum ≥ `target`
- Max fruits in 2 baskets (Leetcode 904)

---

## 💡 Fixed Size Sliding Window – Example

Find **max sum of any subarray of size `k`**:

```kotlin
fun maxSumSubArray(arr: List<Int>, k: Int): Int {
    var currentSum = 0
    var maxSum = Int.MIN_VALUE

    // Step 1: Sum first k elements
    for (i in 0 until k) {
        currentSum += arr[i]
    }
    maxSum = currentSum

    // Step 2: Slide the window
    for (i in k until arr.size) {
        currentSum = currentSum - arr[i - k] + arr[i]
        maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum
}
