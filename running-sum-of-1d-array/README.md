# Running Sum of 1d Array

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/running-sum-of-1d-array/)

## Problem Statement

<p>Given an array <code>nums</code>. We define a running sum of an array as&nbsp;<code>runningSum[i] = sum(nums[0]&hellip;nums[i])</code>.</p>

<p>Return the running sum of <code>nums</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> [1,3,6,10]
<strong>Explanation:</strong> Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,1,1,1]
<strong>Output:</strong> [1,2,3,4,5]
<strong>Explanation:</strong> Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,1,2,10,1]
<strong>Output:</strong> [3,4,6,16,17]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>-10^6&nbsp;&lt;= nums[i] &lt;=&nbsp;10^6</code></li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 1480 |
| Difficulty | Easy |
| Submissions | 2 |
| Languages | cpp, java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [1710259973](cpp/submission-1710259973.cpp) | cpp | Accepted | 0 | 12576000 | 2025-07-25 03:38:25 |
| [2060519467](java/submission-2060519467.java) | java | Accepted | 0 | 44540000 | 2026-07-08 18:28:44 |

## Solution Structure

```text
running-sum-of-1d-array/
├── cpp/
├── java/
└── README.md
        