# Continuous Subarray Sum

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/continuous-subarray-sum/)

## Problem Statement

<p>Given an integer array nums and an integer k, return <code>true</code> <em>if </em><code>nums</code><em> has a <strong>good subarray</strong> or </em><code>false</code><em> otherwise</em>.</p>

<p>A <strong>good subarray</strong> is a subarray where:</p>

<ul>
	<li>its length is <strong>at least two</strong>, and</li>
	<li>the sum of the elements of the subarray is a multiple of <code>k</code>.</li>
</ul>

<p><strong>Note</strong> that:</p>

<ul>
	<li>A <strong>subarray</strong> is a contiguous part of the array.</li>
	<li>An integer <code>x</code> is a multiple of <code>k</code> if there exists an integer <code>n</code> such that <code>x = n * k</code>. <code>0</code> is <strong>always</strong> a multiple of <code>k</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [23,<u>2,4</u>,6,7], k = 6
<strong>Output:</strong> true
<strong>Explanation:</strong> [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [<u>23,2,6,4,7</u>], k = 6
<strong>Output:</strong> true
<strong>Explanation:</strong> [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [23,2,6,4,7], k = 13
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>0 &lt;= sum(nums[i]) &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>1 &lt;= k &lt;= 2<sup>31</sup> - 1</code></li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 523 |
| Difficulty | Medium |
| Submissions | 5 |
| Languages | java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [2065207542](java/submission-2065207542.java) | java | Wrong Answer | 3811 | 83428000 | 2026-07-12 21:59:58 |
| [2065209073](java/submission-2065209073.java) | java | Time Limit Exceeded | 3809 | 83412000 | 2026-07-12 22:01:16 |
| [2065296081](java/submission-2065296081.java) | java | Time Limit Exceeded | 3909 | 83428000 | 2026-07-12 23:15:34 |
| [2065515098](java/submission-2065515098.java) | java | Wrong Answer | 8 | 110640000 | 2026-07-13 06:16:05 |
| [2065515866](java/submission-2065515866.java) | java | Accepted | 22 | 139712000 | 2026-07-13 06:18:35 |

## Solution Structure

```text
continuous-subarray-sum/
├── java/
└── README.md
        