## Synopsis

These are simple Java command line programs that demonstrate implementations of common algorithms.

## Motivation

testbed for understanding algorithms from a deeper level through the code.

## Sorting Algorithms

All three algorithms share common functionality. They all perform nested double looping over the data, hence O(n^2) in big O notation. They perform some type of comparision between two elements. Then what I call a Triangle swap occurs if the elements are out of order.

A Triangle swap is simply the use of one temp variable, and the two input variables. If these are aligned on the points of a triangle, they are swaped with the variable next to them. This enables swapping Var1 with Var2.

Temp = Var1
Var1 = Var2
Var 2 = Temp

- [ ] BubbleSort
- [ ] InsertionSort
- [ ] SelectionSort


## Todo

- [ ] Convert the sorting algorithms to use lambdas
- [ ] Add more algorithms.
