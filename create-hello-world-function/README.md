# Create Hello World Function

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/create-hello-world-function/)

## Problem Statement

Write a function&nbsp;<code>createHelloWorld</code>.&nbsp;It should return a new function that always returns&nbsp;<code>&quot;Hello World&quot;</code>.
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> args = []
<strong>Output:</strong> &quot;Hello World&quot;
<strong>Explanation:</strong>
const f = createHelloWorld();
f(); // &quot;Hello World&quot;

The function returned by createHelloWorld should always return &quot;Hello World&quot;.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> args = [{},null,42]
<strong>Output:</strong> &quot;Hello World&quot;
<strong>Explanation:</strong>
const f = createHelloWorld();
f({}, null, 42); // &quot;Hello World&quot;

Any arguments could be passed to the function but it should still always return &quot;Hello World&quot;.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= args.length &lt;= 10</code></li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 2667 |
| Difficulty | Easy |
| Submissions | 1 |
| Languages | JavaScript |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date | Code |
|---|---|---|---:|---:|---|---|
| [1995213789](https://leetcode.com/submissions/detail/1995213789/) | JavaScript | ✅ Accepted | 46 ms | 53.60 MB | 04 May 2026, 11:58 PM | [View Code](javascript/submission-1995213789.js) |

## Solution Structure

```text
create-hello-world-function/
└── javascript/
└── README.md
```
