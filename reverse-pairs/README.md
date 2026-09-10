# Reverse Pairs

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/reverse-pairs/)

## Problem Statement

<p>Given an integer array <code>nums</code>, return <em>the number of <strong>reverse pairs</strong> in the array</em>.</p>

<p>A <strong>reverse pair</strong> is a pair <code>(i, j)</code> where:</p>

<ul>
	<li><code>0 &lt;= i &lt; j &lt; nums.length</code> and</li>
	<li><code>nums[i] &gt; 2 * nums[j]</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,2,3,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The reverse pairs are:
(1, 4) --&gt; nums[1] = 3, nums[4] = 1, 3 &gt; 2 * 1
(3, 4) --&gt; nums[3] = 3, nums[4] = 1, 3 &gt; 2 * 1
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,4,3,5,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The reverse pairs are:
(1, 4) --&gt; nums[1] = 4, nums[4] = 1, 4 &gt; 2 * 1
(2, 4) --&gt; nums[2] = 3, nums[4] = 1, 3 &gt; 2 * 1
(3, 4) --&gt; nums[3] = 5, nums[4] = 1, 5 &gt; 2 * 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 493 |
| Difficulty | Hard |
| Submissions | 3 |
| Languages | Java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date | Code |
|---|---|---|---:|---:|---|---|
| [2104178084](https://leetcode.com/submissions/detail/2104178084/) | Java | ❌ Wrong Answer | 3847 ms | 49.76 MB | 12 Aug 2026, 06:19 PM | [View Code](java/submission-2104178084.java) |
| [2105195587](https://leetcode.com/submissions/detail/2105195587/) | Java | ✅ Accepted | 42 ms | 64.60 MB | 13 Aug 2026, 02:15 PM | [View Code](java/submission-2105195587.java) |
| [2105202942](https://leetcode.com/submissions/detail/2105202942/) | Java | ✅ Accepted | 42 ms | 64.59 MB | 13 Aug 2026, 02:22 PM | [View Code](java/submission-2105202942.java) |

## Solution Structure

```text
reverse-pairs/
└── java/
└── README.md
```
