# Towers of Hanoi
Recursive approach and solution for the Towers of Hanoi Algorithm 

## Task
Tower of Hanoi, is a mathematical puzzle which consists of three towers and n disks. These rings are of different sizes and stacked upon in an ascending order.
The mission is to move all the disks to some another tower without violating the sequence of arrangement. A few rules to be followed for Tower of Hanoi are:

- Only one disk can be moved among the towers at any given time.
- Only the "top" disk can be removed.
- No large disk can sit over a small disk.

Tower of Hanoi puzzle with n disks can be solved in minimum 2n−1 steps.

## Possible solutions

There are two ways to solve this task:
- Iterative
- Recursive

## Description of the solution

I've choosen to recreate the recursive version because it's simplier and more efficient at the same time. Using recursion often involves a key insight that makes everything simpler.
The solution is to recurse on the largest disk to be moved. I've writen a recursive function that takes as a parameter the disk that is the largest disk in the tower we want to move. 
The function will also take three parameters indicating from which peg the tower should be moved (start), to which peg it should go (end), and the other peg, which we can use temporarily to make this happen (intermediate).

## Complexity of the algorithm

T(n) = 2*T(n-1) + 1

T(n) = 2 * ( 2 * T(n-2) + 1) + 1

T(n) = (2 ^ 2) * T(n-2) + 2^1 + 2^0

T(n) = (2^k) * T(n-k) + 2^(k-1) + 2^(k-2) + ... + 2^0

Solving this the closed from comes out to be

T(n) = (2^n) - 1 with T(0) = 0
