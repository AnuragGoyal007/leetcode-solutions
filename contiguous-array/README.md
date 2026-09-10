# Contiguous Array

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/contiguous-array/)

## Problem Statement

<p>Given a binary array <code>nums</code>, return <em>the maximum length of a contiguous subarray with an equal number of </em><code>0</code><em> and </em><code>1</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,0]
<strong>Output:</strong> 2
<strong>Explanation:</strong> [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,1,1,1,1,0,0,0]
<strong>Output:</strong> 6
<strong>Explanation:</strong> [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>nums[i]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 525 |
| Difficulty | Medium |
| Submissions | 3 |
| Languages | java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [2065275279](java/submission-2065275279.java) | java | Time Limit Exceeded | 3752 | 50192000 | 2026-07-12 22:57:56 |
| [2065276574](java/submission-2065276574.java) | java | Time Limit Exceeded | 3756 | 50248000 | 2026-07-12 22:59:04 |
| [2065516965](java/submission-2065516965.java) | java | Accepted | 23 | 65320000 | 2026-07-13 06:22:06 |

## Solution Structure

```text
contiguous-array/
├── java/
└── README.md
        