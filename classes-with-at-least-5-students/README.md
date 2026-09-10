# Classes With at Least 5 Students

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/classes-with-at-least-5-students/)

## Problem Statement

<p>Table: <code>Courses</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| student     | varchar |
| class       | varchar |
+-------------+---------+
(student, class) is the primary key (combination of columns with unique values) for this table.
Each row of this table indicates the name of a student and the class in which they are enrolled.
</pre>

<p>&nbsp;</p>

<p>Write a solution to find all the classes that have <strong>at least five students</strong>.</p>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The&nbsp;result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> 
Courses table:
+---------+----------+
| student | class    |
+---------+----------+
| A       | Math     |
| B       | English  |
| C       | Math     |
| D       | Biology  |
| E       | Math     |
| F       | Computer |
| G       | Math     |
| H       | Math     |
| I       | Math     |
+---------+----------+
<strong>Output:</strong> 
+---------+
| class   |
+---------+
| Math    |
+---------+
<strong>Explanation:</strong> 
- Math has 6 students, so we include it.
- English has 1 student, so we do not include it.
- Biology has 1 student, so we do not include it.
- Computer has 1 student, so we do not include it.
</pre>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 596 |
| Difficulty | Easy |
| Submissions | 3 |
| Languages | mysql |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date |
|---|---|---|---|---|---|
| [1916263621](mysql/submission-1916263621.sql) | mysql | Wrong Answer | 326 | 0 | 2026-02-12 01:24:26 |
| [1916263761](mysql/submission-1916263761.sql) | mysql | Wrong Answer | 321 | 0 | 2026-02-12 01:24:39 |
| [1971477347](mysql/submission-1971477347.sql) | mysql | Accepted | 307 | 0 | 2026-04-07 16:29:12 |

## Solution Structure

```text
classes-with-at-least-5-students/
├── mysql/
└── README.md
        