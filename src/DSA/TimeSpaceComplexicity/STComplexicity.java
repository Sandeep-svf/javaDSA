package DSA.TimeSpaceComplexicity;

public class STComplexicity {

    /***

     Time Complexity:

     Old Computer (slow)       New Computer (Fast)
     run data    1M elements in array      1M elements in array
     algo:       Linear Search             Linear Search
     Target:     Number doesn't exist in array for both.
     Time taken: 10 Sec                    1 sec.


     Now question is : which one have better time complexity.
     Answer: Both of these machine have the same time complexity.

     conclusion : Time complexity does not rely on the machine. or Time complexity != Time Taken.

     as shown in the graph below :

     Old computer :

     Time (T)
     ↑
     |
     9k                                 *
     |
     5k                           *
     |
     1k                     *
     |
     200               *
     |
     100        *
     |
     10 *
     |______________________________________________→ Input Size (N)
     10      100      1k      5k      10k


     New computer :

     Time (T)
     ↑
     |
     9k                                    *
     5k                               *
     1k                          *
     200                     *
     100                *
     10          *
     |   *
     |______________________________________________→ Input Size (N)
     10      100      1k      5k      10k


     Note: in both graph time is growing linear as input growing.
     most imp: Value may be different, but it is growing linear.

     Then, what is time complexity : it is a function that tells us the time is going to grow as the input grow.
     take same example for ola and new computer


     Actual definition : Function that gives relationship about how the time will grow as the input grows.


     Tips: If someone say time taken to run the algo is time complexity this is not correct. but it is relationship
     between how time grow as input grows.

     Note: we already know binary search have TC log(n) and Linear search have TC o(n).

     NOte: We take worst case scenario to compute TC.

     e.g. Linear search graph for TC

     Time (T)
     ↑
     |
     |                               *
     |                          *
     |                      *
     |                  *
     |              *
     |          *
     |      *
     |   *
     | *
     +--------------------------------------------→  Input Size (N)
     0     10     20     30     40     50

     e.g. Binary search log(n) graph for TC

     Binary Search Time Complexity (O(log n))

     Time (T) ↑
     |           *
     |         *
     |       *
     |     *
     |    *
     |   *
     |  *
     | *
     |*
     +--------------------------------------------------------------------→ Input Size (N)
     1      10      100      1k      10k      100k      500k

     Hence, the curve rises quickly early (1 → 100),
     but rises very slowly later (100k → 500k).

     Note : fix data for both than time taken by linear search > time taken by binary search
     and for larger log(n) is better than o(n).

     and most imp: For smaller time o(n) is taking less time and log(n) is taking more time. but only for small number.
     and we do not care about small number. that is very less difference.

     VVI: What  do we consider when thinking about complexity.
     1: Always look at the worst case complexity.
     2: always look at complexity for large input of data.
     3: a: Even thou value of actual time is different they are growing linear. ( Ignore contents.)
     b: We do not care about actual time taken by machine , we care about how time grow as input grow. (So we need relationship
     )
     e.g. for same linear value time taken different for different input but relationship of growing time with input is same.
     y = x.
     y = 2x.
     y = 3x.
     Hence, We consider relation not constent here. This is why we ignore small value.
     4: Always ignore less dominating terms.
     e.g.
     O(n3 + log n)
     ( from point no.2 we always consider larger ampit of data when taking about complexity analyses.)
     above equation for n = 1 million array data
     ( (1M)3 + log(1M))   // log(1M) = 6
     ( (1M)3 + 6) // so here , total time is (1M)3 sec + 6 sec.
     // compar (1M)3 sec and 6 sec so we can ignore it here.
     note :



     Let's found out time complexity of
     O ( (3n)3  +4(n)2 +5n +6)

     from above point... ignore constent , ignore less dominating terms.
     O ( (n)3  +(n)2 + n)
     O((n)3) is answer.
     */

    /***

     Big-O Notation: Showing upper bound.
        e.g.  if Big-O Notation is n3 than means time will never exceed more than n3. It will fall equal or below of it.
     Definition:

     Mathematical Representation:

        F(n) = O (g(n))

          f(n)
     lim  ___   < ∞         // Means it finite number or Actually some value. ( Always look for large data so using ∞ here.)
     n→∞  g(n)


     e.g. Given:
     lim (n → ∞) f(n) / g(n) < ∞

     f(n) = 6n³ + 3n + 5
     g(n) = n³

     O(n³) = O(6n³ + 3n + 5)

     Solve:

     lim (n → ∞) (6n³ + 3n + 5) / n³
     = lim (n → ∞) (6n³ / n³ + 3n / n³ + 5 / n³)
     = lim (n → ∞) (6 + 3/n² + 5/n³)

     Substitute n = ∞:

     3 / ∞² = 0
     5 / ∞³ = 0

     (Hint: any finite number divided by ∞ becomes 0)

     Therefore:

     6 + 0 + 0 = 6

     6 < ∞

     Therefore: Here getting finite value.
     f(n) = O(n³)



     Big-Omega Notation: Opposite of Big-O notation Lower bound. Take at least this time to execute.

     definition: Ω (n3)  for any algo is given than means,it will take at least (n3) to execute.
     Mathematical Representation:

          f(n)
     lim  ___   > ∞     // Means, it will take at lest this time to execute and can take more than that as well based on the input.
     n→∞  g(n)


     Question: What is the algo of upper and lower bound is (n2).
     so , math terms can write

     O (n2)  = Ω (n3)  // Here it will be repetitive so we use theta notation.
     So write it theta notation : Θ(n2)

     Θ Theta notation: Combining both big-oh ad big-omega.

     that means :

          f(n)
 0 < lim  ___   < ∞
     n→∞  g(n)

     Both upper bound and lower bound is n2.


     Note:

     Little o notation:
     This is also giving upper bound. ( Not a strict upper bound like Big-oh, basically loose upper bound.)
    e.g.

     Big-Oh O     |      Little-Oh o
     f = O(g)     |      f = o(g)
     f <= g       |      f < g


     means: In big-oh O it will less or equal to g. upper bound.
     in little-oh o it is slower than g.(Strictly slower.)


     Mathematical Representation:

          f(n)
     lim  ___   = 0
     n→∞  g(n)

     e.g.




     lim (n → ∞)  f(n) / g(n)  =  0

     Given e.g. :
     f(n) = n²
     g(n) = n³

     Solve:

     lim (n → ∞)  (n² / n³)
     = lim (n → ∞)  (1 / n)

     As n → ∞:
     1 / ∞ = 0   (any finite number divided by infinity becomes 0)

     Therefore:
     lim (n → ∞) (n² / n³) = 0

     Conclusion:
     n² = o(n³)    // little-o notation



     Little-omega notation:

     e.g.

     Big-Omega (Ω)|     Little Omega (ω)
     f = Ω(g)     |      f = ω(g)
     f >= g       |      f > g


     Mathematical Representation:


     f(n)
     lim  ___   = ∞
     n→∞  g(n)


     e.g.
     Little-omega Notation

     lim (n → ∞)  f(n) / g(n)  =  ∞

     Given:
     f(n) = n³
     g(n) = n²

     Solve:

     lim (n → ∞) (n³ / n²)
     = lim (n → ∞) (n)

     As n → ∞:
     n → ∞

     Therefore:
     lim (n → ∞) (n³ / n²) = ∞

     Conclusion:
     n³ = ω(n²)    // little-omega notation

     */

    // Space Complexity

    /***

     SPACE COMPLEXITY...

     Space complexity is input space + auxiliary space taken by run that algo.
     auxiliary space -> extra space or temporary space taken by that also other than input space.

     Standard definition:
     Auxiliary Space is the extra space or temporary space used by an algorithm.

     Space Complexity of an algorithm is the total space taken by the algorithm with respect to the input size.
     Space complexity includes both auxiliary space and space used by input.

     For example, if we want to compare standard sorting algorithms on the basis of space, then auxiliary space would be a better
     criterion than space complexity. Merge Sort uses O(n) auxiliary space, Insertion Sort and Heap Sort use O(1) auxiliary space.
     Space complexity of all these sorting algorithms is O(n) though.

    int i,j,n,k;

     for(i=1;i<=n;){
        for(j=1; j<=k; k++){
            // some operation which is taking t time.
     }
     i = i+k;
     }


     Solution:


     Let inner operation = t (constant time)

     Inner loop:
     k iterations → k * t time

     Outer loop:
     i increases by k each time → n/k iterations

     Total time:
     T(n) = (n/k) * (k * t)
     = n * t

     Remove constant t:
     T(n) = O(n)



     */

}
