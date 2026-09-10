# Binary Search

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/binary-search/)

## Problem Statement

<p>Given an array of integers <code>nums</code> which is sorted in ascending order, and an integer <code>target</code>, write a function to search <code>target</code> in <code>nums</code>. If <code>target</code> exists, then return its index. Otherwise, return <code>-1</code>.</p>

<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 9
<strong>Output:</strong> 4
<strong>Explanation:</strong> 9 exists in nums and its index is 4
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 2
<strong>Output:</strong> -1
<strong>Explanation:</strong> 2 does not exist in nums so return -1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> &lt; nums[i], target &lt; 10<sup>4</sup></code></li>
	<li>All the integers in <code>nums</code> are <strong>unique</strong>.</li>
	<li><code>nums</code> is sorted in ascending order.</li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 704 |
| Difficulty | Easy |
| Submissions | 3 |
| Languages | cpp, java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [1709243562](cpp/submission-1709243562.cpp) | cpp | Accepted | 0 | 31268000 | 2025-07-24 10:11:52 |
| [1716375507](cpp/submission-1716375507.cpp) | cpp | Accepted | 0 | 31336000 | 2025-07-30 03:12:30 |
| [2054540712](java/submission-2054540712.java) | java | Accepted | 0 | 48464000 | 2026-07-03 15:55:06 |

## Solution Structure

```text
binary-search/
├── cpp/
├── java/
└── README.md
        