# Maximum Average Subarray I

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)

## Problem Statement

<p>You are given an integer array <code>nums</code> consisting of <code>n</code> elements, and an integer <code>k</code>.</p>

<p>Find a contiguous subarray whose <strong>length is equal to</strong> <code>k</code> that has the maximum average value and return <em>this value</em>. Any answer with a calculation error less than <code>10<sup>-5</sup></code> will be accepted.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,12,-5,-6,50,3], k = 4
<strong>Output:</strong> 12.75000
<strong>Explanation:</strong> Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [5], k = 1
<strong>Output:</strong> 5.00000
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= k &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 643 |
| Difficulty | Easy |
| Submissions | 2 |
| Languages | cpp, java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [1713118250](cpp/submission-1713118250.cpp) | cpp | Accepted | 0 | 113660000 | 2025-07-27 13:46:30 |
| [2070051092](java/submission-2070051092.java) | java | Accepted | 4 | 69468000 | 2026-07-16 20:57:51 |

## Solution Structure

```text
maximum-average-subarray-i/
├── cpp/
├── java/
└── README.md
        