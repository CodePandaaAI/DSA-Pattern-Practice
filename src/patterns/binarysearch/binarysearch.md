# 🔍 Binary Search Pattern — **Evolved Notes**

Binary Search is not just an algorithm — it’s a mindset. It teaches us how to think **smarter, not harder** — divide,
eliminate, zoom in.

---

## 🧠 Core Concept:

> “When data is sorted (fully or in parts), we can stop brute-forcing.
> Let logic, boundaries, and midpoints guide the way.”

Binary Search uses the **Divide & Conquer** principle — shrinking the search space by half on every step.

---

## 🧮 Time Complexity:

| Case    | Time       |
|---------|------------|
| Best    | `O(1)`     |
| Average | `O(log n)` |
| Worst   | `O(log n)` |

It’s this log behavior that makes Binary Search legendary for large inputs.

---

## ⚒️ Common Binary Search Components:

| Term     | Meaning                                   |
|----------|-------------------------------------------|
| `start`  | Start index of search space               |
| `end`    | End index of search space                 |
| `mid`    | Middle index: `(start + end) / 2`         |
| `target` | Element we’re searching or logic-checking |

---

## 🧩 Basic Binary Search Logic:

```kotlin
while (start <= end) {
    val mid = (start + end) / 2
    when {
        nums[mid] == target -> println("$mid")
        nums[mid] < target -> start = mid + 1
        else -> end = mid - 1
    }
}
```

---

## 🔁 Variations We’ve Explored:

| Pattern                             | Use Case                                        | Key Twist                                   |
|-------------------------------------|-------------------------------------------------|---------------------------------------------|
| **First/Last Occurrence**           | Find first or last index of target              | Check both sides after match                |
| **Rotated Sorted Array**            | Find target even if array is rotated            | Analyze sorted halves                       |
| **Find Minimum in Rotated Array**   | Locate pivot/minimum point                      | Eliminate based on `nums[mid] vs nums[end]` |
| **Insert Position**                 | Where to insert if target not found             | Final `start` index gives answer            |
| **Find Peak Element**               | Local peak where `arr[i-1] < arr[i] > arr[i+1]` | Use mid and its neighbors                   |
| **Binary Search in Reverse Sorted** | Same logic in reverse order                     | Flip the comparison signs                   |

---

## 🚨 Important Mindset Upgrades:

* Always ask: **Is the array sorted? Fully or partially?**
* Use dry runs to visualize how `start`, `end`, `mid` shift
* Boundary checks matter: avoid out-of-bounds on `mid-1` or `mid+1`
* You don’t always return `mid` — sometimes it’s `start`, `end`, or just a boolean
* It's not always about "finding" a value — sometimes it's about **deciding**, **positioning**, or **breaking** a
  condition

---

## ✅ Pro Tip: Debug Like a Soldier

* Add prints: `start`, `mid`, `end`, `nums[mid]`
* Imagine how your code will behave for edge cases: smallest, largest, missing, duplicate values
* Trust the pattern — but **don’t blindly copy** — tweak based on problem need

---