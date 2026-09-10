# Customers Who Never Order

[🔗 Open Problem on LeetCode](https://leetcode.com/problems/customers-who-never-order/)

## Problem Statement

<p>Table: <code>Customers</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table indicates the ID and name of a customer.
</pre>

<p>&nbsp;</p>

<p>Table: <code>Orders</code></p>

<pre>
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| customerId  | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
customerId is a foreign key (reference columns) of the ID from the Customers table.
Each row of this table indicates the ID of an order and the ID of the customer who ordered it.
</pre>

<p>&nbsp;</p>

<p>Write a solution to find all customers who never order anything.</p>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> 
Customers table:
+----+-------+
| id | name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Orders table:
+----+------------+
| id | customerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
<strong>Output:</strong> 
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+
</pre>


## Metadata

| Field | Value |
|---|---|
| Problem Number | 183 |
| Difficulty | Easy |
| Submissions | 3 |
| Languages | MySQL |

## Submission History

| Submission | Language | Status | Runtime | Memory | Date | Code |
|---|---|---|---:|---:|---|---|
| [1918040988](https://leetcode.com/submissions/detail/1918040988/) | MySQL | ✅ Accepted | 525 ms | 0.00 MB | 13 Feb 2026, 07:23 PM | [View Code](mysql/submission-1918040988.sql) |
| [1918041170](https://leetcode.com/submissions/detail/1918041170/) | MySQL | ✅ Accepted | 498 ms | 0.00 MB | 13 Feb 2026, 07:23 PM | [View Code](mysql/submission-1918041170.sql) |
| [1918041314](https://leetcode.com/submissions/detail/1918041314/) | MySQL | ✅ Accepted | 492 ms | 0.00 MB | 13 Feb 2026, 07:23 PM | [View Code](mysql/submission-1918041314.sql) |

## Solution Structure

```text
customers-who-never-order/
└── mysql/
└── README.md
```
