# Maximum Subarray

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/maximum-subarray/)

## Problem Statement

<p>Given an integer array <code>nums</code>, find the <span data-keyword="subarray-nonempty">subarray</span> with the largest sum, and return <em>its sum</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-2,1,-3,4,-1,2,1,-5,4]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The subarray [4,-1,2,1] has the largest sum 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The subarray [1] has the largest sum 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,4,-1,7,8]
<strong>Output:</strong> 23
<strong>Explanation:</strong> The subarray [5,4,-1,7,8] has the largest sum 23.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> If you have figured out the <code>O(n)</code> solution, try coding another solution using the <strong>divide and conquer</strong> approach, which is more subtle.</p>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 53 |
| Difficulty | Medium |
| Submissions | 4 |
| Languages | cpp, java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [1711531221](cpp/submission-1711531221.cpp) | cpp | Wrong Answer | 3969 | 26616000 | 2025-07-26 03:34:30 |
| [1711531857](cpp/submission-1711531857.cpp) | cpp | Time Limit Exceeded | 3970 | 33572000 | 2025-07-26 03:36:08 |
| [1711533296](cpp/submission-1711533296.cpp) | cpp | Accepted | 0 | 71800000 | 2025-07-26 03:39:47 |
| [2096830544](java/submission-2096830544.java) | java | Accepted | 1 | 77288000 | 2026-08-06 20:22:09 |

## Solution Structure

```text
maximum-subarray/
├── cpp/
├── java/
└── README.md
        