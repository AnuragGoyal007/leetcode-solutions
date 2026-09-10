# Find Minimum in Rotated Sorted Array

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)

## Problem Statement

<p>Suppose an array of length <code>n</code> sorted in ascending order is <strong>rotated</strong> between <code>1</code> and <code>n</code> times. For example, the array <code>nums = [0,1,2,4,5,6,7]</code> might become:</p>

<ul>
	<li><code>[4,5,6,7,0,1,2]</code> if it was rotated <code>4</code> times.</li>
	<li><code>[0,1,2,4,5,6,7]</code> if it was rotated <code>7</code> times.</li>
</ul>

<p>Notice that <strong>rotating</strong> an array <code>[a[0], a[1], a[2], ..., a[n-1]]</code> 1 time results in the array <code>[a[n-1], a[0], a[1], a[2], ..., a[n-2]]</code>.</p>

<p>Given the sorted rotated array <code>nums</code> of <strong>unique</strong> elements, return <em>the minimum element of this array</em>.</p>

<p>You must write an algorithm that runs in&nbsp;<code>O(log n) time</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,4,5,1,2]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The original array was [1,2,3,4,5] rotated 3 times.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [4,5,6,7,0,1,2]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [11,13,15,17]
<strong>Output:</strong> 11
<strong>Explanation:</strong> The original array was [11,13,15,17] and it was rotated 4 times. 
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= n &lt;= 5000</code></li>
	<li><code>-5000 &lt;= nums[i] &lt;= 5000</code></li>
	<li>All the integers of <code>nums</code> are <strong>unique</strong>.</li>
	<li><code>nums</code> is sorted and rotated between <code>1</code> and <code>n</code> times.</li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 153 |
| Difficulty | Medium |
| Submissions | 4 |
| Languages | C++, Java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date | Code |
|---|---|---|---:|---:|---|---|
| [1699718604](https://leetcode.com/submissions/detail/1699718604/) | C++ | ✅ Accepted | 0 ms | 14.02 MB | 16 Jul 2025, 12:14 PM | [View Code](cpp/submission-1699718604.cpp) |
| [1716930556](https://leetcode.com/submissions/detail/1716930556/) | C++ | ✅ Accepted | 0 ms | 13.99 MB | 30 Jul 2025, 03:35 PM | [View Code](cpp/submission-1716930556.cpp) |
| [1847371412](https://leetcode.com/submissions/detail/1847371412/) | C++ | ✅ Accepted | 0 ms | 14.20 MB | 05 Dec 2025, 11:55 AM | [View Code](cpp/submission-1847371412.cpp) |
| [2004858308](https://leetcode.com/submissions/detail/2004858308/) | Java | ✅ Accepted | 0 ms | 43.76 MB | 17 May 2026, 12:12 AM | [View Code](java/submission-2004858308.java) |

## Solution Structure

```text
find-minimum-in-rotated-sorted-array/
├── cpp/
└── java/
└── README.md
```
