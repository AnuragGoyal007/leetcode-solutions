# Find the Index of the First Occurrence in a String

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Problem Statement

<p>Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>, or <code>-1</code> if <code>needle</code> is not part of <code>haystack</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> haystack = &quot;sadbutsad&quot;, needle = &quot;sad&quot;
<strong>Output:</strong> 0
<strong>Explanation:</strong> &quot;sad&quot; occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> haystack = &quot;leetcode&quot;, needle = &quot;leeto&quot;
<strong>Output:</strong> -1
<strong>Explanation:</strong> &quot;leeto&quot; did not occur in &quot;leetcode&quot;, so we return -1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li>
	<li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 28 |
| Difficulty | Easy |
| Submissions | 1 |
| Languages | java |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [2030959105](java/submission-2030959105.java) | java | Accepted | 1 | 43152000 | 2026-06-12 21:14:12 |

## Solution Structure

```text
find-the-index-of-the-first-occurrence-in-a-string/
├── java/
└── README.md
        