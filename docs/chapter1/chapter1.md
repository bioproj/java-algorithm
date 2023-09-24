写作目的：
+ 阅读[Kraken: ultrafast metagenomic sequence classification using exact alignments](https://genomebiology.biomedcentral.com/articles/10.1186/gb-2014-15-3-r46)中提到说，Kraken是一个assigning taxonomic labels to metagenomic DNA sequences的程序，该文章中提到了算法`lowest common ancestor (LCA)`，故写下本文，以便对生物信息学的算法有深入了解。



学习资料:
+ https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/description/
+ 代码实现: `java-algorithm/src/main/java/org/bioproj/lcadl`



## 问题描述
Given the `root`of a binary tree, return the lowest common ancestor of its deepest leaves.

Recall that:
+ The node of a binary tree is a leaf if and only if it has no children.
+ The depth of the root of the tree is `0`. if the depth of the node is `d`, the depth of each of its children is `d+1`.
+ The lowest common ancestor of a set `S` of the nodes, is the node A with the largest depth such that every node in `S` is in the subtree with root `a`.

#### Example
![](figures/2023-09-24-14-36-46.png  ':size=400')

Input: root = [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation: 
+ we return the node with value 2, colored in yellow in the diagram.
+ The nodes colored  in blue are the deepth leaf-nodes of the tree.

> Note that nodes 6, 0, and 8 are also leaf nodes, but the depth of them is 2, but the depth of nodes 7 and 4 is 2.



![](figures/lcadl.drawio.svg)


