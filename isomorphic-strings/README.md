# Isomorphic Strings

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/isomorphic-strings/)

## Problem Statement

<p>Given two strings <code>s</code> and <code>t</code>, <em>determine if they are isomorphic</em>.</p>

<p>Two strings <code>s</code> and <code>t</code> are isomorphic if the characters in <code>s</code> can be replaced to get <code>t</code>.</p>

<p>All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;egg&quot;, t = &quot;add&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>The strings <code>s</code> and <code>t</code> can be made identical by:</p>

<ul>
	<li>Mapping <code>&#39;e&#39;</code> to <code>&#39;a&#39;</code>.</li>
	<li>Mapping <code>&#39;g&#39;</code> to <code>&#39;d&#39;</code>.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;f11&quot;, t = &quot;b23&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong>Explanation:</strong></p>

<p>The strings <code>s</code> and <code>t</code> can not be made identical as <code>&#39;1&#39;</code> needs to be mapped to both <code>&#39;2&#39;</code> and <code>&#39;3&#39;</code>.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;paper&quot;, t = &quot;title&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>t.length == s.length</code></li>
	<li><code>s</code> and <code>t</code> consist of any valid ascii character.</li>
</ul>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 205 |
| Difficulty | Easy |
| Submissions | 3 |
| Languages | C++ |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date | Code |
|---|---|---|---:|---:|---|---|
| [1308301733](https://leetcode.com/submissions/detail/1308301733/) | C++ | ❌ Wrong Answer | 6 ms | 7.98 MB | 03 Jul 2024, 07:20 PM | [View Code](cpp/submission-1308301733.cpp) |
| [1308303039](https://leetcode.com/submissions/detail/1308303039/) | C++ | ❌ Wrong Answer | 6 ms | 8.27 MB | 03 Jul 2024, 07:21 PM | [View Code](cpp/submission-1308303039.cpp) |
| [1308303238](https://leetcode.com/submissions/detail/1308303238/) | C++ | ❌ Wrong Answer | 3 ms | 8.22 MB | 03 Jul 2024, 07:22 PM | [View Code](cpp/submission-1308303238.cpp) |

## Solution Structure

```text
isomorphic-strings/
└── cpp/
└── README.md
```
