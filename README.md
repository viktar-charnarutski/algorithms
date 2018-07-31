# Algorithms
Solutions for algorithm questions which could be asked on a technical interview.

# Materials

## Articles
 - [x] MTU [How to Prepare Yourself for an Interview with Google](https://www.mtu.edu/career/students/networking/interviews/prepare.pdf)
 - [x] Larysa Aharkava [Want to Work in Google *In Russian*](http://larrr.com/wp-content/uploads/2016/10/InterviewPreparationGuide.pdf)
 - [x] Sergey Sema [How to get in Google: Preparation Instruction *In Russian*](https://dou.ua/lenta/articles/google-interview/)

## Books
 - [ ] Gayle McDowell [Cracking the Coding Interview](https://www.amazon.com/Cracking-Coding-Interview-Programming-Questions/dp/0984782850/ref=sr_1_1?ie=UTF8&qid=1528866608&sr=8-1&keywords=CRACKING+the+CODING+INTERVIEW)
 - [ ] Mongan J., Kindler N., Giguere E. [Programming Interviews Exposed](https://www.amazon.com/Programming-Interviews-Exposed-Through-Interview/dp/111941847X/ref=sr_1_1?s=books&ie=UTF8&qid=1528866738&sr=1-1&keywords=Programming+Interviews+Exposed)

## Dynamic Programming
### Videos
 - [x] HakerRank: [Algorithms: Solve 'Coin Change' Using Memoization and DP](https://www.youtube.com/watch?v=sn0DWI-JdNA)
 - [ ] MIT OpenCourseWare: [19. Dynamic Programming I: Fibonacci, Shortest Paths](https://www.youtube.com/watch?v=OQ5jsbhAv_M&t=605s)
 - [x] CS Dojo: [Dynamic Programming Interview Question #1 - Find Sets Of Numbers That Add Up To 16](https://www.youtube.com/watch?v=nqlNzOcnCfs&t=9s)
 - [x] [Jump Game Solution](https://leetcode.com/problems/jump-game/solution/)

### Reading
 - [ ] [Dynamic Programming - *In Russian*](http://awpris.blogspot.com/2012/02/blog-post.html)

## Notices

### Big O
 - Don't use *N* for time / memory complexity estimation, use different letters like: _L_ - letters; _W_ - words, etc.

### Interview
 - Listen carefully
 - Ask clarifying questions
 - Write down all the details
 - All the details metter
 - Draw an example (long enough and meaningful)
 - Think in loud
 - **Do not try to recall a solution you've seen before for a similar problem**, let your brain to come up with a logical one
 - Start with a simple possible solution, like a *brute-fource* one
 - Explain time and memory complexicty and ask yourself: **can we do metter?**
 - Come up with a pseudo code and then ask if you could start with real codding
 - Split the solution's functionality into separate fuctions
 - Test your code with an example **different from the one you already have**

### Linked List
 - Always check for ```null```
 - If your head node might be changed - use a *fake* head node
 - If it's required to change an order - keep tracking a *previous* node. For head node it could be ```null``` or your *fake node*
 - To *arrange* the list's nodes in a *particular order* use two (*or more*) brand new lists, so then you can combine it for a single list
 - Use *two pointers* if you need to find a cycle or count from the end (like a *middle* one)
 - To reverse a list you just need to *re-map* links to the *next* node pointing it to the *previous* one

### Stack
 - **FILO** First In, Last Out (*like a stack of plates*)
 - For *FIFO* functionality (*queue*) you can just revert the stack with help of an additional one: ```stack2.push(stack1.pop());```
 - For tracking a min or max value of the stack you can store your min/max value right before you got a new min/max.

### Trees
 - Trees (*not binary thees*) could be used for storing, for example, a bunch of phone numbers with each node having up to 10 children - one for each digit
 - A node is called a *leaf node* if it has no children
 - A *Binary Search Tree* is a binary tree in which every node fits a specific ordering property: *all left descendents <= n < all right descendents*
 - Clarify with your interviewer if your *BST* could have duplicates. If so, clarify on what side should they go
 - Do not assume that your tree is *BST*, it should be clarified
 - If the binary tree is balanced, you could expect ```O(log n)``` times for *insert* and *find* operations
 - A **complete binary tree** is a binary tree in which every level of the tree is *fully filled*, except for perhaps the last level
 - A **full binary tree** is a binary tree in which every node has either *zero or two* children
 - A **perfect binary tree** is one that is both *full* and *complete* with ```2^k - 1``` nodes (where ```k``` is the number of levels)

### Trees' Search
 - **In-Order tarversal** means to *visit* left node, then head, then - right one:
 ```
 public void inOrderTraversal(TreeNode node) {
    if (node == null) return;
    inOrderTraversal(node.left);
    visit(node);
    inOrderTraversal(node.right);
 }
 ```
  If we have *BST*, its elements will be visited in *ascending* order

 - **Pre-Order Traversal** means to *visit* a head first and then its children:
 ```
 public void preOrderTraversal(TreeNode node) {
    if (node == null) return;
    visit(node);
    preOrderTraversal(node.left);
    preOrderTraversal(node.right);
 }
 ```
 - **Post-Order Traversal** means to *visit* head's children first, and then the head itself:
 ```
 public void postOrderTraversal(TreeNode node) {
    if (node == null) return;
    postOrderTraverse(node.left);
    postOrderTraverse(node.right);
    visit(node);
 }
 ```

### Tries
 - A trie is a variant of an *n-ary tree* in which characters are stored at each node. Each path down the tree may represent a word
 - A trie can check if a string is a valid prefix in ```O(K)``` time, where ```K``` is the length of the string

### Graph Search
 - In **Depth-First Search** (DFS) we start at the root and explore each branch completely before moving on to the next branch. Recursive implementation:
 ```
 public boolen dfs(Node node, int valueToFind) {
    if (node == null || node.visited()) return false;

    node.markAsVisited();  // to avoid inifinite loop if the graph is cycled

    boolean isFound = false;
    if (node.value() == valueToFind) {
        isFound = true;
    } else {
        for (TreeNode child : node.children()) {
            isFound = dfs(child, checkForValue);
        }
    }
    return isFound;
 }
 ```
 If we want to find the shortest path between two nodes, *BFS* is generally better
 - In **Breadth-First Search** (BFS) we exploring all the heighbors before moving to its children. Iterative implementation based on ```Queue```:
 ```
 public boolean bfs(Node node, int valueToFind) {
    if (node == null) return false;

    Queue<Node> nodesToCheck = new LinkedList<>();
    nodesToCheck.push(node);

    boolean isFound = false;
    while (!nodesToCheck.isEmpty() || isFound) {
        Node currentNode = nodesToCheck.poll();

        currentNode.markAsVisited(); // to avoid inifinite loop if the graph is cycled

        if (currentNode.value() == valueToFind) {
            isFound = true;
        } else {
            for (Node child : currentNode.children()) {
                nodesToCheck.offer(child);
            }
        }
    }
    return isFound;
 }
 ```
*DFS* is often preferred if we want to visit *every node* in the graph

### Dynamic Programming
Solving and fully understanding a dynamic programming problem is a 4 step process:
1. Start with the recursive backtracking solution
2. Optimize by using a memoization table (_top-down dynamic programming_)
3. Remove the need for recursion (_bottom-up dynamic programming_)
4. Apply final tricks to reduce the time / memory complexity

# My Statistics

## Data Structures
- [x] [Linked Lists][1000]
- [ ] Trees
- [ ] *Tries* - in progress
- [ ] *Graphs* - in progress
- [x] Stacks
- [ ] Queues
- [ ] Heaps
- [ ] Vectors / Arraylists
- [ ] Heaps
- [ ] Hash Tables

## Algorithms
- [ ] Breadth-First Search
- [ ] Depth-First Search
- [x] Quick Sort
- [ ] Merge Sort
- [ ] Quick Sort

## Concepts
- [ ] Bit Manipulation
- [ ] Memory (Stack vs. Heap)
- [x] Recursion
- [ ] Merge Sort
- [ ] Dynamic Programming
- [x] [Big O Time and Space][1001]

## Problems

| # | Date | Question | Difficulty | Review Required |
|:-:|:----:|:---------|:----------:|:--------------:|
| 1 | 23-Mar-2018 | [657. Judge Route Circle][1] | Easy |  |
| 2 | 23-Mar-2018 | [344. Reverse String][2] | Easy |  |
| 3 | 24-Mar-2018 | [557. Reverse Words in a String III][3] | Easy |  |
| 4 | 24-Mar-2018 | [521. Longest Uncommon Subsequence I][4] | Easy |  |
| 5 | 24-Mar-2018 | [520. Detect Capital][5] | Easy |  |
| 6 | 24-Mar-2018 | [788. Rotated Digits][6] | Easy |  |
| 7 | 24-Mar-2018 | [696. Count Binary Substrings][7] | Easy | Y |
| 8 | 24-Mar-2018 | [13. Roman to Integer][8] | Easy |  |
| 9 | 25-Mar-2018 | [383. Ransom Note][9] | Easy |  |
| 10 | 25-Mar-2018 | [387. First Unique Character in a String][10] | Easy |  |
| 11 | 25-Mar-2018 | [551. Student Attendance Record I][11] | Easy |  |
| 12 | 25-Mar-2018 | [541. Reverse String II][12] | Easy |  |
| 13 | 26-Mar-2018 | [345. Reverse Vowels of a String][13] | Easy | Y |
| 14 | 26-Mar-2018 | [459. Repeated Substring Pattern][14] | Easy | |
| 15 | 26-Mar-2018 | [434. Number of Segments in a String][15] | Easy |  |
| 16 | 27-Mar-2018 | [443. String Compression][16] | Easy |  |
| 17 | 27-Mar-2018 | [20. Valid Parentheses][17] | Easy | |
| 18 | 28-Mar-2018 | [67. Add Binary][18] | Easy | Y |
| 19 | 28-Mar-2018 | [686. Repeated String Match][19] | Easy | |
| 20 | 28-Mar-2018 | [680. Valid Palindrome II][20] | Easy | |
| 21 | 28-Mar-2018 | [58. Length of Last Word][21] | Easy | |
| 22 | 28-Mar-2018 | [14. Longest Common Prefix][22] | Easy | Y |
| 23 | 29-Mar-2018 | [28. Implement strStr()][23] | Easy |  |
| 24 | 29-Mar-2018 | [125. Valid Palindrome][24] | Easy |  |
| 25 | 29-Mar-2018 | [771. Jewels and Stones][25] | Easy |  |
| 26 | 29-Mar-2018 | [804. Unique Morse Code Words][26] | Easy |  |
| 27 | 30-Mar-2018 | [806. Number of Lines To Write String][27] | Easy |  |
| 28 | 30-Mar-2018 | [728. Self Dividing Numbers][28] | Easy |  |
| 29 | 2-Apr-2018 | [412. Fizz Buzz][29] | Easy |  |
| 30 | 2-Apr-2018 | [500. Keyboard Row][30] | Easy |  |
| 31 | 2-Apr-2018 | [682. Baseball Game][31] | Easy |  |
| 32 | 2-Apr-2018 | [575. Distribute Candies][32] | Easy |  |
| 33 | 2-Apr-2018 | [463. Island Perimeter][33] | Easy |  |
| 34 | 2-Apr-2018 | [766. Toeplitz Matrix][34] | Easy |  |
| 35 | 3-Apr-2018 | [566. Reshape the Matrix][35] | Easy | Y |
| 36 | 3-Apr-2018 | [796. Rotate String][36] | Easy | Y |
| 37 | 3-Apr-2018 | [496. Next Greater Element I][37] | Easy | Y |
| 38 | 3-Apr-2018 | [136. Single Number][38] | Easy | |
| 39 | 3-Apr-2018 | [292. Nim Game][39] | Easy |  |
| 40 | 3-Apr-2018 | [485. Max Consecutive Ones][40] | Easy |  |
| 41 | 4-Apr-2018 | [695. Max Area of Island][41] | Easy | |
| 42 | 4-Apr-2018 | [283. Move Zeroes][42] | Easy | |
| 43 | 4-Apr-2018 | [389. Find the Difference][43] | Easy | Y |
| 44 | 4-Apr-2018 | [448. Find All Numbers Disappeared in an Array][44] | Easy | Y |
| 45 | 4-Apr-2018 | [171. Excel Sheet Column Number][45] | Easy |  |
| 46 | 5-Apr-2018 | [226. Invert Binary Tree][46] | Easy | Y |
| 47 | 5-Apr-2018 | [349. Intersection of Two Arrays][47] | Easy |  |
| 48 | 5-Apr-2018 | [690. Employee Importance][48] | Easy |  |
| 49 | 5-Apr-2018 | [653. Two Sum IV - Input is a BST][49] | Easy |  |
| 50 | 5-Apr-2018 | [104. Maximum Depth of Binary Tree][50] | Easy |  |
| 51 | 6-Apr-2018 | [100. Same Tree][51] | Easy |  |
| 52 | 6-Apr-2018 | [617. Merge Two Binary Trees][52] | Easy |  |
| 53 | 6-Apr-2018 | [811. Subdomain Visit Count][53] | Easy |  |
| 54 | 6-Apr-2018 | [637. Average of Levels in Binary Tree][54] | Easy |  |
| 55 | 7-Apr-2018 | [784. Letter Case Permutation][55] | Easy | Y |
| 56 | 7-Apr-2018 | [733. Flood Fill][56] | Easy |  |
| 57 | 7-Apr-2018 | [404. Sum of Left Leaves][57] | Easy |  |
| 58 | 7-Apr-2018 | [242. Valid Anagram][58] | Easy |  |
| 59 | 7-Apr-2018 | [530. Minimum Absolute Difference in BST][59] | Easy | Y |
| 60 | 8-Apr-2018 | [783. Minimum Distance Between BST Nodes][60] | Easy | Y |
| 61 | 8-Apr-2018 | [206. Reverse Linked List][61] | Easy | Y |
| 62 | 9-Apr-2018 | [599. Minimum Index Sum of Two Lists][62] | Easy | |
| 63 | 9-Apr-2018 | [661. Image Smoother][63] | Easy | |
| 64 | 10-Apr-2018 | [409. Longest Palindrome][64] | Easy | |
| 65 | 10-Apr-2018 | [543. Diameter of Binary Tree][65] | Easy | |
| 66 | 10-Apr-2018 | [628. Maximum Product of Three Numbers][66] | Easy | Y |
| 67 | 10-Apr-2018 | [350. Intersection of Two Arrays II][67] | Easy | |
| 68 | 10-Apr-2018 | [744. Find Smallest Letter Greater Than Target][68] | Easy | |
| 69 | 11-Apr-2018 | [674. Longest Continuous Increasing Subsequence][69] | Easy | |
| 70 | 11-Apr-2018 | [697. Degree of an Array][70] | Easy | |
| 71 | 12-Apr-2018 | [107. Binary Tree Level Order Traversal II][71] | Easy | Y |
| 72 | 13-Apr-2018 | [506. Relative Ranks][72] | Easy | |
| 73 | 13-Apr-2018 | [237. Delete Node in a Linked List][73] | Easy | |
| 74 | 14-Apr-2018 | [108. Convert Sorted Array to Binary Search Tree][74] | Easy | |
| 75 | 15-Apr-2018 | [606. Construct String from Binary Tree][75] | Easy | |
| 76 | 16-Apr-2018 | [746. Min Cost Climbing Stairs][76] | Easy | Y |
| 77 | 16-Apr-2018 | [747. Largest Number At Least Twice of Others][77] | Easy | Y |
| 78 | 16-Apr-2018 | [671. Second Minimum Node In a Binary Tree][78] | Easy | |
| 79 | 16-Apr-2018 | [415. Add Strings][79] | Easy | |
| 80 | 16-Apr-2018 | [257. Binary Tree Paths][80] | Easy | |
| 81 | 17-Apr-2018 | [70. Climbing Stairs][81] | Easy | |
| 82 | 17-Apr-2018 | [202. Happy Number][82] | Easy | |
| 83 | 17-Apr-2018 | [21. Merge Two Sorted Lists][83] | Easy | Y |
| 84 | 17-Apr-2018 | [594. Longest Harmonious Subsequence][84] | Easy | |
| 85 | 17-Apr-2018 | [27. Remove Element][85] | Easy | |
| 86 | 18-Apr-2018 | [231. Power of Two][86] | Easy | |
| 87 | 18-Apr-2018 | [326. Power of Three][87] | Easy | |
| 88 | 18-Apr-2018 | [101. Symmetric Tree][88] | Easy | Y |
| 89 | 18-Apr-2018 | [53. Maximum Subarray][89] | Easy | |
| 90 | 18-Apr-2018 | [83. Remove Duplicates from Sorted List][90] | Easy | |
| 91 | 18-Apr-2018 | [669. Trim a Binary Search Tree][91] | Easy | Y |
| 92 | 19-Apr-2018 | [572. Subtree of Another Tree][92] | Easy | Y |
| 93 | 19-Apr-2018 | [437. Path Sum III][93] | Easy | Y |
| 94 | 19-Apr-2018 | [35. Search Insert Position][94] | Easy | |
| 95 | 19-Apr-2018 | [198. House Robber][95] | Easy | Y |
| 96 | 20-Apr-2018 | [235. Lowest Common Ancestor of a Binary Search Tree][96] | Easy | Y |
| 97 | 20-Apr-2018 | [66. Plus One][97] | Easy | |
| 98 | 20-Apr-2018 | [645. Set Mismatch][98] | Easy | Y |
| 99 | 20-Apr-2018 | [110. Balanced Binary Tree][99] | Easy | Y |
| 100 | 21-Apr-2018 | [501. Find Mode in Binary Search Tree][100] | Easy | Y |
| 101 | 21-Apr-2018 | [643. Maximum Average Subarray I][101] | Easy | Y |
| 102 | 22-Apr-2018 | [441. Arranging Coins][102] | Easy | Y |
| 103 | 22-Apr-2018 | [367. Valid Perfect Square][103] | Easy | Y |
| 104 | 23-Apr-2018 | [9. Palindrome Number][104] | Easy | |
| 105 | 23-Apr-2018 | [141. Linked List Cycle][105] | Easy | |
| 106 | 23-Apr-2018 | [112. Path Sum][106] | Easy | |
| 107 | 23-Apr-2018 | [438. Find All Anagrams in a String][107] | Easy | |
| 108 | 23-Apr-2018 | [111. Minimum Depth of Binary Tree][108] | Easy | |
| 109 | 24-Apr-2018 | [290. Word Pattern][109] | Easy | |
| 110 | 24-Apr-2018 | [203. Remove Linked List Elements][110] | Easy | |
| 111 | 24-Apr-2018 | [724. Find Pivot Index][111] | Easy | Y |
| 112 | 24-Apr-2018 | [234. Palindrome Linked List][112] | Easy | Y |
| 113 | 24-Apr-2018 | [687. Longest Univalue Path][113] | Easy | Y |
| 114 | 25-Apr-2018 | [219. Contains Duplicate II][114] | Easy | |
| 115 | 25-Apr-2018 | [507. Perfect Number][115] | Easy | |
| 116 | 25-Apr-2018 | [303. Range Sum Query - Immutable][116] | Easy | |
| 117 | 25-Apr-2018 | [633. Sum of Square Numbers][117] | Easy | Y |
| 118 | 25-Apr-2018 | [88. Merge Sorted Array][118] | Easy | Y |
| 119 | 26-Apr-2018 | [160. Intersection of Two Linked Lists][119] | Easy | Y |
| 120 | 26-Apr-2018 | [400. Nth Digit][120] | Easy | Y |
| 121 | 26-Apr-2018 | [605. Can Place Flower][121] | Easy | |
| 122 | 27-Apr-2018 | [475. Heaters][122] | Easy | |
| 123 | 27-Apr-2018 | [581. Shortest Unsorted Continuous Subarray][123] | Easy | |
| 124 | 29-Apr-2018 | [414. Third Maximum Number][124] | Easy | |
| 125 | 29-Apr-2018 | [204. Count Primes][125] | Easy | Y |
| 126 | 30-Apr-2018 | [278. First Bad Version][126] | Easy | Y |
| 127 | 30-Apr-2018 | [189. Rotate Array][127] | Easy | |
| 128 | 30-Apr-2018 | [7. Reverse Integer][128] | Easy | |
| 129 | 30-Apr-2018 | [665. Non-decreasing Array][129] | Easy | |
| 130 | 30-Apr-2018 | [807. Max Increase to Keep City Skyline][130] | Easy | |
| 131 | 1-May-2018 | [535. Encode and Decode TinyURL][131] | Medium | |
| 132 | 1-May-2018 | [814. Binary Tree Pruning][132] | Medium | |
| 133 | 1-May-2018 | [654. Maximum Binary Tree][133] | Medium | |
| 134 | 1-May-2018 | [763. Partition Labels][134] | Medium | Y |
| 135 | 2-May-2018 | [419. Battleships in a Board][135] | Medium | Y |
| 136 | 2-May-2018 | [791. Custom Sort String][136] | Medium | Y |
| 137 | 2-May-2018 | [442. Find All Duplicates in an Array][137] | Medium | Y |
| 138 | 2-May-2018 | [513. Find Bottom Left Tree Value][138] | Medium | Y |
| 139 | 3-May-2018 | [540. Single Element in a Sorted Array][139] | Medium | |
| 140 | 3-May-2018 | [515. Find Largest Value in Each Tree Row][140] | Medium | |
| 141 | 3-May-2018 | [553. Optimal Division][141] | Medium | |
| 142 | 3-May-2018 | [647. Palindromic Substrings][142] | Medium | Y |
| 143 | 3-May-2018 | [413. Arithmetic Slices][143] | Medium | |
| 144 | 3-May-2018 | [260. Single Number III][144] | Medium | Y |
| 145 | 3-May-2018 | [739. Daily Temperatures][145] | Medium | |
| 146 | 3-May-2018 | [451. Sort Characters By Frequency][146] | Medium | Y |
| 147 | 4-May-2018 | [462. Minimum Moves to Equal Array Elements II][147] | Medium | Y |
| 148 | 4-May-2018 | [677. Map Sum Pairs][148] | Medium | |
| 149 | 4-May-2018 | [748. Shortest Completing Word][149] | Medium | |
| 150 | 5-May-2018 | [712. Minimum ASCII Delete Sum for Two Strings][150] | Medium | Y |
| 151 | 5-May-2018 | [238. Product of Array Except Self][151] | Medium | Y |
| 152 | 5-May-2018 | [94. Binary Tree Inorder Traversal][152] | Medium | |
| 153 | 6-May-2018 | [817. Linked List Components][153] | Medium | |
| 154 | 7-May-2018 | [347. Top K Frequent Elements][154] | Medium | Y |
| 155 | 7-May-2018 | [672. Bulb Switcher II][155] | Medium | Y |
| 156 | 7-May-2018 | [565. Array Nesting][156] | Medium | Y |
| 157 | 7-May-2018 | [547. Friend Circles][157] | Medium | |
| 158 | 8-May-2018 | [676. Implement Magic Dictionary][158] | Medium | |
| 159 | 8-May-2018 | [769. Max Chunks To Make Sorted][159] | Medium | |
| 160 | 9-May-2018 | [503. Next Greater Element II][160] | Medium | |
| 161 | 9-May-2018 | [648. Replace Words][161] | Medium | Y |
| 162 | 9-May-2018 | [382. Linked List Random Node][162] | Medium | Y |
| 163 | 10-May-2018 | [646. Maximum Length of Pair Chain][163] | Medium | Y |
| 164 | 11-May-2018 | [384. Shuffle an Array][164] | Medium | |
| 165 | 13-May-2018 | [725. Split Linked List in Parts][165] | Medium | |
| 166 | 13-May-2018 | [343. Integer Break][166] | Medium | Y |
| 167 | 13-May-2018 | [241. Different Ways to Add Parentheses][167] | Medium | Y |
| 168 | 14-May-2018 | [445. Add Two Numbers II][168] | Medium | Y |
| 169 | 14-May-2018 | [357. Count Numbers with Unique Digits][169] | Medium | Y |
| 170 | 14-May-2018 | [121. Best Time to Buy and Sell Stock][170] | Easy | |
| 171 | 14-May-2018 | [714. Best Time to Buy and Sell Stock with Transaction Fee][171] | Medium | Y |
| 172 | 15-May-2018 | [122. Best Time to Buy and Sell Stock II][172] | Easy | |
| 173 | 15-May-2018 | [623. Add One Row to Tree][173] | Medium | Y |
| 174 | 16-May-2018 | [539. Minimum Time Difference][174] | Medium | |
| 175 | 16-May-2018 | [123. Best Time to Buy and Sell Stock III][175] | Medium | Y |
| 176 | 16-May-2018 | [318. Maximum Product of Word Lengths][176] | Medium | Y+ |
| 177 | 17-May-2018 | [309. Best Time to Buy and Sell Stock with Cooldown][177] | Medium | Y |
| 178 | 17-May-2018 | [554. Brick Wall][178] | Medium | Y+ |
| 179 | 18-May-2018 | [230. Kth Smallest Element in a BST][179] | Medium | Y |
| 180 | 18-May-2018 | [378. Kth Smallest Element in a Sorted Matrix][180] | Medium | Y |
| 181 | 18-May-2018 | [78. Subsets][181] | Medium | Y |
| 182 | 19-May-2018 | [398. Random Pick Index][182] | Medium | |
| 183 | 20-May-2018 | [392. Is Subsequence][183] | Medium | |
| 184 | 20-May-2018 | [583. Delete Operation for Two Strings][184] | Medium | Y |
| 185 | 21-May-2018 | [287. Find the Duplicate Number][185] | Medium | Y |
| 186 | 21-May-2018 | [142. Linked List Cycle II][186] | Medium | Y |
| 187 | 22-May-2018 | [740. Delete and Earn][187] | Medium | Y |
| 188 | 22-May-2018 | [494. Target Sum][188] | Medium | Y |
| 189 | 22-May-2018 | [173. Binary Search Tree Iterator][189] | Medium | Y |
| 190 | 22-May-2018 | [102. Binary Tree Level Order Traversal][190] | Medium | Y |
| 191 | 23-May-2018 | [341. Flatten Nested List Iterator][191] | Medium | |
| 192 | 28-May-2018 | [524. Longest Word in Dictionary through Deleting][192] | Medium | Y |
| 193 | 29-May-2018 | [105. Construct Binary Tree from Preorder and Inorder Traversal][193] | Medium | Y |
| 194 | 29-May-2018 | [449. Serialize and Deserialize BST][194] | Medium | Y |
| 195 | 29-May-2018 | [516. Longest Palindromic Subsequence][195] | Medium | Y |
| 196 | 30-May-2018 | [199. Binary Tree Right Side View][196] | Medium | |
| 197 | 30-May-2018 | [377. Combination Sum IV][197] | Medium | |
| 198 | 31-May-2018 | [424. Longest Repeating Character Replacement][198] | Medium | Y |
| 199 | 31-May-2018 | [386. Lexicographical Numbers][199] | Medium | Y |
| 200 | 31-May-2018 | [729. My Calendar I][200] | Medium | Y |
| 201 | 1-Jun-2018 | [621. Task Scheduler][201] | Medium | |
| 202 | 2-Jun-2018 | [394. Decode String][202] | Medium | Y |
| 203 | 3-Jun-2018 | [718. Maximum Length of Repeated Subarray][203] | Medium | Y |
| 204 | 3-Jun-2018 | [525. Contiguous Array][204] | Medium | Y |
| 205 | 4-Jun-2018 | [64. Minimum Path Sum][205] | Medium | Y |
| 206 | 4-Jun-2018 | [435. Non-overlapping Intervals][206] | Medium | Y |
| 207 | 5-Jun-2018 | [215. Kth Largest Element in an Array][207] | Medium | Y |
| 208 | 5-Jun-2018 | [795. Number of Subarrays with Bounded Maximum][208] | Medium | Y |
| 209 | 6-Jun-2018 | [611. Valid Triangle Number][209] | Medium | Y |
| 210 | 7-Jun-2018 | [813. Largest Sum of Averages][210] | Medium | Y |
| 211 | 7-Jun-2018 | [838. Push Dominoes][211] | Medium | Y |
| 212 | 8-Jun-2018 | [380. Insert Delete GetRandom O(1)][212] | Medium | Y |
| 213 | 8-Jun-2018 | [593. Valid Square][213] | Medium | Y |
| 214 | 9-Jun-2018 | [48. Rotate Image][214] | Medium | Y |
| 215 | 10-Jun-2018 | [24. Swap Nodes in Pairs][215] | Medium | Y |
| 216 | 11-Jun-2018 | [162.  Find Peak Element][216] | Medium | |
| 217 | 12-Jun-2018 | [452. Minimum Number of Arrows to Burst Balloons][217] | Medium | |
| 218 | 13-Jun-2018 | [334. Increasing Triplet Subsequence][218] | Medium | Y |
| 219 | 14-Jun-2018 | [322. Coin Change][219] | Medium | Y |
| 220 | 15-Jun-2018 | [300. Longest Increasing Subsequence][220] | Medium | Y |
| 221 | 15-Jun-2018 | [532. K-diff Pairs in an Array][221] | Easy | Y |
| 222 | 16-Jun-2018 | [567. Permutation in String][222] | Easy | Y |
| 223 | 16-Jun-2018 | [46. Permutations][223] | Medium | Y |
| 224 | 17-Jun-2018 | [47. Permutations II][224] | Medium | Y |
| 225 | 18-Jun-2018 | [316. Remove Duplicate Letters][225] | Hard | Y |
| 226 | 19-Jun-2018 | [URLify][226] | Easy | |
| 227 | 19-Jun-2018 | [266. Palindrome Permutation][227] | Easy | |
| 228 | 19-Jun-2018 | [161. One Edit Distance][228] | Easy | Y |
| 229 | 20-Jun-2018 | [73. Set Matrix Zeroes][229] | Medium | |
| 230 | 20-Jun-2018 | [82. Remove Duplicates from Sorted List II][230] | Medium | |
| 231 | 21-Jun-2018 | [Remove Duplicates from Unsorted List][231] | Easy | |
| 232 | 21-Jun-2018 | [19. Remove Nth Node From End of List][232] | Medium | Y |
| 233 | 22-Jun-2018 | [2. Add Two Numbers][233] | Medium | Y |
| 234 | 23-Jun-2018 | [328. Odd Even Linked List][234] | Medium | Y |
| 235 | 24-Jun-2018 | [15. 3Sum][235] | Medium | Y |
| 236 | 25-Jun-2018 | [109. Convert Sorted List to Binary Search Tree][236] | Medium | Y |
| 237 | 26-Jun-2018 | [Delete a Linked List][237] | Easy | |
| 238 | 26-Jun-2018 | [Find Length of a Linked List (Iterative and Recursive)][238] | Easy | |
| 239 | 26-Jun-2018 | [147. Insertion Sort List][239] | Medium | |
| 240 | 26-Jun-2018 | [Find the middle of a given linked list][240] | Medium | Y |
| 241 | 27-Jun-2018 | [Detect loop in a linked list][241] | Easy | |
| 242 | 27-Jun-2018 | [Swap Nodes][242] | Easy | |
| 243 | 27-Jun-2018 | [Pairwise swap][243] | Easy | |
| 244 | 27-Jun-2018 | [Move last element to front of a given Linked List][244] | Easy | |
| 245 | 27-Jun-2018 | [Intersection of two Sorted Linked Lists][245] | Easy | |
| 246 | 28-Jun-2018 | [Intersection Point][246] | Medium | |
| 247 | 28-Jun-2018 | [Two Stacks in an Array][247] | Easy | |
| 248 | 29-Jun-2018 | [155. Min Stack][248] | Easy | Y |
| 249 | 29-Jun-2018 | [Stack of Plates][249] | Easy | |
| 250 | 1-Jul-2018 | [Queue Via Stacks][250] | Easy | |
| 251 | 1-Jul-2018 | [Sort Stack][251] | Easy | |
| 252 | 2-Jul-2018 | [Animal Shelter][252] | Easy | |
| 253 | 3-Jul-2018 | [Route Between Nodes][253] | Easy | |
| 254 | 3-Jul-2018 | [Minimal Tree][254] | Easy | |
| 255 | 3-Jul-2018 | [860. Lemonade Change][255] | Easy | |
| 256 | 6-Jul-2018 | [List of Depths][256] | Easy | |
| 257 | 8-Jul-2018 | [Check Balanced][257] | Easy | |
| 258 | 8-Jul-2018 | [Validate BST][258] | Easy | |
| 259 | 8-Jul-2018 | [Successor][259] | Easy | |
| 260 | 9-Jul-2018 | [Build Order][260] | Medium | |
| 261 | 9-Jul-2018 | [First Common Ancestor][261] | Medium | Y |
| 262 | 10-Jul-2018 | [BST Sequences][262] | Medium | |
| 263 | 10-Jul-2018 | [144. Binary Tree Preorder Traversal][263] | Medium | |
| 264 | 10-Jul-2018 | [Minimum Difference of Two Arrays][264] | Medium | |
| 265 | 11-Jul-2018 | [Check Subtree][265] | Easy | |
| 266 | 11-Jul-2018 | [Random Node][266] | Medium | |
| 267 | 12-Jul-2018 | [Paths with Sum][267] | Medium | |
| 268 | 12-Jul-2018 | [Determine If Two Rectangles Overlap][268] | Medium | |
| 269 | 13-Jul-2018 | [Triple Step][269] | Easy | |
| 270 | 14-Jul-2018 | [Robot in a Grid][270] | Medium | |
| 271 | 14-Jul-2018 | [62. Unique Paths][271] | Medium | |
| 272 | 15-Jul-2018 | [63. Unique Paths II][272] | Medium | |
| 273 | 16-Jul-2018 | [486. Predict the Winner][273] | Medium | Y |
| 274 | 17-Jul-2018 | [Recursive Multiply][274] | Easy | |
| 275 | 17-Jul-2018 | [Longest Common Subsequence][275] | Medium | Y |
| 276 | 18-Jul-2018 | [Longest Increasing Subsequence I][276] | Medium | Y |
| 277 | 18-Jul-2018 | [Edit Distance][277] | Medium | Y |
| 278 | 19-Jul-2018 | [76. Minimum Window Substring][278] | Hard | Y |
| 280 | 20-Jul-2018 | [Ways to Cover a Distance][280] | Easy | |
| 281 | 20-Jul-2018 | [3. Longest Substring Without Repeating Characters][281] | Medium | |
| 282 | 21-Jul-2018 | [Longest Path In Matrix][282] | Medium | |
| 283 | 22-Jul-2018 | [Subset Sum][283] | Medium | |
| 284 | 22-Jul-2018 | [416. Partition Equal Subset Sum][284] | Medium | Y |
| 285 | 23-Jul-2018 | [Optimal Strategy for a Game][285] | Medium | Y |
| 286 | 23-Jul-2018 | [Knapsack Problem][286] | Medium | Y |
| 287 | 24-Jul-2018 | [213. House Robber II][287] | Medium | Y |
| 288 | 24-Jul-2018 | [337. House Robber III][288] | Medium | Y |
| 289 | 25-Jul-2018 | [841. Keys and Rooms][289] | Medium | |
| 290 | 26-Jul-2018 | [417. Pacific Atlantic Water Flow][290] | Medium | |
| 291 | 26-Jul-2018 | [832. Flipping an Image][291] | Easy | |
| 292 | 26-Jul-2018 | [55. Jump Game][292] | Medium | Y |
| 293 | 27-Jul-2018 | [139. Word Break][293] | Medium | Y |
| 294 | 27-Jul-2018 | [315. Count of Smaller Numbers After Self][294] | Hard | Y |
| 295 | 28-Jul-2018 | [96. Unique Binary Search Trees][295] | Medium | Y |
| 296 | 30-Jul-2018 | [187. Repeated DNA Sequences][296] | Medium | |
| 297 | 30-Jul-2018 | [34. Find First and Last Position of Element in Sorted Array][297] | Medium | |
| 298 | 31-Jul-2018 | [691. Stickers to Spell Word][298] | Hard | |
| 299 | 31-Jul-2018 | [859. Buddy Strings][299] | Easy | |

[1]: https://leetcode.com/problems/judge-route-circle/
[2]: https://leetcode.com/problems/reverse-string/
[3]: https://leetcode.com/problems/reverse-words-in-a-string-iii/
[4]: https://leetcode.com/problems/longest-uncommon-subsequence-i/
[5]: https://leetcode.com/problems/detect-capital/
[6]: https://leetcode.com/problems/rotated-digits/
[7]: https://leetcode.com/problems/count-binary-substrings/
[8]: https://leetcode.com/problems/roman-to-integer/
[9]: https://leetcode.com/problems/ransom-note/
[10]: https://leetcode.com/problems/first-unique-character-in-a-string/
[11]: https://leetcode.com/problems/student-attendance-record-i/
[12]: https://leetcode.com/problems/reverse-string-ii/
[13]: https://leetcode.com/problems/reverse-vowels-of-a-string/
[14]: https://leetcode.com/problems/repeated-substring-pattern/
[15]: https://leetcode.com/problems/number-of-segments-in-a-string/
[16]: https://leetcode.com/problems/string-compression/
[17]: https://leetcode.com/problems/valid-parentheses/
[18]: https://leetcode.com/problems/add-binary/
[19]: https://leetcode.com/problems/repeated-string-match/
[20]: https://leetcode.com/problems/valid-palindrome-ii/
[21]: https://leetcode.com/problems/length-of-last-word/
[22]: https://leetcode.com/problems/longest-common-prefix/
[23]: https://leetcode.com/problems/implement-strstr/
[24]: https://leetcode.com/problems/valid-palindrome/
[25]: https://leetcode.com/problems/jewels-and-stones/
[26]: https://leetcode.com/problems/unique-morse-code-words/
[27]: https://leetcode.com/problems/number-of-lines-to-write-string/
[28]: https://leetcode.com/problems/self-dividing-numbers/
[29]: https://leetcode.com/problems/fizz-buzz/
[30]: https://leetcode.com/problems/keyboard-row/
[31]: https://leetcode.com/problems/baseball-game
[32]: https://leetcode.com/problems/distribute-candies/
[33]: https://leetcode.com/problems/island-perimeter/
[34]: https://leetcode.com/problems/toeplitz-matrix/
[35]: https://leetcode.com/problems/reshape-the-matrix/
[36]: https://leetcode.com/problems/rotate-string/
[37]: https://leetcode.com/problems/next-greater-element-i/
[38]: https://leetcode.com/problems/single-number/
[39]: https://leetcode.com/problems/nim-game/
[40]: https://leetcode.com/problems/max-consecutive-ones/
[41]: https://leetcode.com/problems/max-area-of-island/
[42]: https://leetcode.com/problems/move-zeroes/
[43]: https://leetcode.com/problems/find-the-difference/
[44]: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
[45]: https://leetcode.com/problems/excel-sheet-column-number/
[46]: https://leetcode.com/problems/invert-binary-tree/
[47]: https://leetcode.com/problems/intersection-of-two-arrays/
[48]: https://leetcode.com/problems/employee-importance/
[49]: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
[50]: https://leetcode.com/problems/maximum-depth-of-binary-tree/
[51]: https://leetcode.com/problems/same-tree/
[52]: https://leetcode.com/problems/merge-two-binary-trees/
[53]: https://leetcode.com/problems/subdomain-visit-count/
[54]: https://leetcode.com/problems/average-of-levels-in-binary-tree/
[55]: https://leetcode.com/problems/letter-case-permutation/
[56]: https://leetcode.com/problems/flood-fill/
[57]: https://leetcode.com/problems/sum-of-left-leaves/
[58]: https://leetcode.com/problems/valid-anagram/
[59]: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
[60]: https://leetcode.com/problems/minimum-distance-between-bst-nodes/
[61]: https://leetcode.com/problems/reverse-linked-list/
[62]: https://leetcode.com/problems/minimum-index-sum-of-two-lists/
[63]: https://leetcode.com/problems/image-smoother/
[64]: https://leetcode.com/problems/longest-palindrome/
[65]: https://leetcode.com/problems/diameter-of-binary-tree/
[66]: https://leetcode.com/problems/maximum-product-of-three-numbers/
[67]: https://leetcode.com/problems/intersection-of-two-arrays-ii/
[68]: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
[69]: https://leetcode.com/problems/longest-continuous-increasing-subsequence/
[70]: https://leetcode.com/problems/degree-of-an-array/
[71]: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
[72]: https://leetcode.com/problems/relative-ranks/
[73]: https://leetcode.com/problems/delete-node-in-a-linked-list/
[74]: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
[75]: https://leetcode.com/problems/construct-string-from-binary-tree/
[76]: https://leetcode.com/problems/min-cost-climbing-stairs/
[77]: https://leetcode.com/problems/largest-number-at-least-twice-of-others/
[78]: https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
[79]: https://leetcode.com/problems/add-strings/
[80]: https://leetcode.com/problems/binary-tree-paths/
[81]: https://leetcode.com/problems/climbing-stairs/
[82]: https://leetcode.com/problems/happy-number/
[83]: https://leetcode.com/problems/merge-two-sorted-lists/
[84]: https://leetcode.com/problems/longest-harmonious-subsequence/
[85]: https://leetcode.com/problems/remove-element/
[86]: https://leetcode.com/problems/power-of-two/
[87]: https://leetcode.com/problems/power-of-three/
[88]: https://leetcode.com/problems/symmetric-tree/
[89]: https://leetcode.com/problems/maximum-subarray/
[90]: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
[91]: https://leetcode.com/problems/trim-a-binary-search-tree/
[92]: https://leetcode.com/problems/subtree-of-another-tree/
[93]: https://leetcode.com/problems/path-sum-iii/
[94]: https://leetcode.com/problems/search-insert-position/
[95]: https://leetcode.com/problems/house-robber/
[96]: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
[97]: https://leetcode.com/problems/plus-one/discuss/
[98]: https://leetcode.com/problems/set-mismatch/
[99]: https://leetcode.com/problems/balanced-binary-tree/
[100]: https://leetcode.com/problems/find-mode-in-binary-search-tree/
[101]: https://leetcode.com/problems/maximum-average-subarray-i/
[102]: https://leetcode.com/problems/arranging-coins/
[103]: https://leetcode.com/problems/valid-perfect-square/
[104]: https://leetcode.com/problems/palindrome-number/
[105]: https://leetcode.com/problems/linked-list-cycle/
[106]: https://leetcode.com/problems/path-sum/
[107]: https://leetcode.com/problems/find-all-anagrams-in-a-string/
[108]: https://leetcode.com/problems/minimum-depth-of-binary-tree/
[109]: https://leetcode.com/problems/word-pattern/
[110]: https://leetcode.com/problems/remove-linked-list-elements/
[111]: https://leetcode.com/problems/find-pivot-index/
[112]: https://leetcode.com/problems/palindrome-linked-list/
[113]: https://leetcode.com/problems/longest-univalue-path/
[114]: https://leetcode.com/problems/contains-duplicate-ii/
[115]: https://leetcode.com/problems/perfect-number/
[116]: https://leetcode.com/problems/range-sum-query-immutable/
[117]: https://leetcode.com/problems/sum-of-square-numbers/
[118]: https://leetcode.com/problems/merge-sorted-array/
[119]: https://leetcode.com/problems/intersection-of-two-linked-lists/
[120]: https://leetcode.com/problems/nth-digit/
[121]: https://leetcode.com/problems/can-place-flowers/
[122]: https://leetcode.com/problems/heaters/
[123]: https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
[124]: https://leetcode.com/problems/third-maximum-number/
[125]: https://leetcode.com/problems/count-primes/
[126]: https://leetcode.com/problems/first-bad-version/
[127]: https://leetcode.com/problems/rotate-array/
[128]: https://leetcode.com/problems/reverse-integer/
[129]: https://leetcode.com/problems/non-decreasing-array/
[130]: https://leetcode.com/problems/max-increase-to-keep-city-skyline/
[131]: https://leetcode.com/problems/encode-and-decode-tinyurl/
[132]: https://leetcode.com/problems/binary-tree-pruning/
[133]: https://leetcode.com/problems/maximum-binary-tree/
[134]: https://leetcode.com/problems/partition-labels/
[135]: https://leetcode.com/problems/battleships-in-a-board/
[136]: https://leetcode.com/problems/custom-sort-string/
[137]: https://leetcode.com/problems/find-all-duplicates-in-an-array/
[138]: https://leetcode.com/problems/find-bottom-left-tree-value/
[139]: https://leetcode.com/problems/single-element-in-a-sorted-array/
[140]: https://leetcode.com/problems/find-largest-value-in-each-tree-row/
[141]: https://leetcode.com/problems/optimal-division/
[142]: https://leetcode.com/problems/palindromic-substrings/
[143]: https://leetcode.com/problems/arithmetic-slices/
[144]: https://leetcode.com/problems/single-number-iii/
[145]: https://leetcode.com/problems/daily-temperatures/
[146]: https://leetcode.com/problems/sort-characters-by-frequency/
[147]: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
[148]: https://leetcode.com/problems/map-sum-pairs/
[149]: https://leetcode.com/problems/shortest-completing-word/
[150]: https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/
[151]: https://leetcode.com/problems/product-of-array-except-self/
[152]: https://leetcode.com/problems/binary-tree-inorder-traversal/
[153]: https://leetcode.com/problems/linked-list-components/
[154]: https://leetcode.com/problems/top-k-frequent-elements/
[155]: https://leetcode.com/problems/bulb-switcher-ii/
[156]: https://leetcode.com/problems/array-nesting/
[157]: https://leetcode.com/problems/friend-circles/
[158]: https://leetcode.com/problems/implement-magic-dictionary/
[159]: https://leetcode.com/problems/max-chunks-to-make-sorted/
[160]: https://leetcode.com/problems/next-greater-element-ii/
[161]: https://leetcode.com/problems/replace-words/
[162]: https://leetcode.com/problems/linked-list-random-node/
[163]: https://leetcode.com/problems/maximum-length-of-pair-chain/
[164]: https://leetcode.com/problems/shuffle-an-array/
[165]: https://leetcode.com/problems/split-linked-list-in-parts/
[166]: https://leetcode.com/problems/integer-break/
[167]: https://leetcode.com/problems/different-ways-to-add-parentheses/
[168]: https://leetcode.com/problems/add-two-numbers-ii/
[169]: https://leetcode.com/problems/count-numbers-with-unique-digits/
[170]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
[171]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
[172]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
[173]: https://leetcode.com/problems/add-one-row-to-tree/
[174]: https://leetcode.com/problems/minimum-time-difference/
[175]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
[176]: https://leetcode.com/problems/maximum-product-of-word-lengths/
[177]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
[178]: https://leetcode.com/problems/brick-wall/
[179]: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
[180]: https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
[181]: https://leetcode.com/problems/subsets/
[182]: https://leetcode.com/problems/random-pick-index/
[183]: https://leetcode.com/problems/is-subsequence/
[184]: https://leetcode.com/problems/delete-operation-for-two-strings/
[185]: https://leetcode.com/problems/find-the-duplicate-number/
[186]: https://leetcode.com/problems/linked-list-cycle-ii/
[187]: https://leetcode.com/problems/delete-and-earn/
[188]: https://leetcode.com/problems/target-sum/
[189]: https://leetcode.com/problems/binary-search-tree-iterator/
[190]: https://leetcode.com/problems/binary-tree-level-order-traversal/
[191]: https://leetcode.com/problems/flatten-nested-list-iterator/
[192]: https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
[193]: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
[194]: https://leetcode.com/problems/serialize-and-deserialize-bst/
[195]: https://leetcode.com/problems/longest-palindromic-subsequence/
[196]: https://leetcode.com/problems/binary-tree-right-side-view/
[197]: https://leetcode.com/problems/combination-sum-iv/
[198]: https://leetcode.com/problems/longest-repeating-character-replacement/
[199]: https://leetcode.com/problems/lexicographical-numbers/
[200]: https://leetcode.com/problems/my-calendar-i/
[201]: https://leetcode.com/problems/task-scheduler/
[202]: https://leetcode.com/problems/decode-string/
[203]: https://leetcode.com/problems/maximum-length-of-repeated-subarray/
[204]: https://leetcode.com/problems/contiguous-array/
[205]: https://leetcode.com/problems/minimum-path-sum/
[206]: https://leetcode.com/problems/non-overlapping-intervals/
[207]: https://leetcode.com/problems/kth-largest-element-in-an-array/
[208]: https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
[209]: https://leetcode.com/problems/valid-triangle-number/
[210]: https://leetcode.com/problems/largest-sum-of-averages/
[211]: https://leetcode.com/problems/push-dominoes/
[212]: https://leetcode.com/problems/insert-delete-getrandom-o1/
[213]: https://leetcode.com/problems/valid-square/
[214]: https://leetcode.com/problems/rotate-image/
[215]: https://leetcode.com/problems/swap-nodes-in-pairs/
[216]: https://leetcode.com/problems/find-peak-element/
[217]: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
[218]: https://leetcode.com/problems/increasing-triplet-subsequence/
[219]: https://leetcode.com/problems/coin-change/
[220]: https://leetcode.com/problems/longest-increasing-subsequence/
[221]: https://leetcode.com/problems/k-diff-pairs-in-an-array/
[222]: https://leetcode.com/problems/permutation-in-string/
[223]: https://leetcode.com/problems/permutations/
[224]: https://leetcode.com/problems/permutations-ii/
[225]: https://leetcode.com/problems/remove-duplicate-letters/
[226]: http://www.crackingthecodinginterview.com/
[227]: https://leetcode.com/articles/palindrome-permutation/
[228]: https://leetcode.com/problems/one-edit-distance/
[229]: https://leetcode.com/problems/set-matrix-zeroes/
[230]: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
[231]: https://algorithms.tutorialhorizon.com/remove-duplicates-from-an-unsorted-linked-list/
[232]: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
[233]: https://leetcode.com/problems/add-two-numbers/
[234]: https://leetcode.com/problems/odd-even-linked-list/
[235]: https://leetcode.com/problems/3sum/
[236]: https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
[237]: https://www.geeksforgeeks.org/write-a-function-to-delete-a-linked-list/
[238]: https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
[239]: https://leetcode.com/problems/insertion-sort-list/
[240]: https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
[241]: https://www.geeksforgeeks.org/write-a-c-function-to-detect-loop-in-a-linked-list/
[242]: https://www.geeksforgeeks.org/swap-nodes-in-a-linked-list-without-swapping-data/
[243]: https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/
[244]: https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
[245]: https://www.geeksforgeeks.org/intersection-of-two-sorted-linked-lists/
[246]: https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
[247]: https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/
[248]: https://leetcode.com/problems/min-stack/
[249]: https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_03_Stack_of_Plates
[250]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_04_Queue_via_Stacks/MyQueue.java
[251]: https://www.geeksforgeeks.org/sort-stack-using-temporary-stack/
[252]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_06_Animal_Shelter/AnimalQueue.java
[253]: https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_01_Route_Between_Nodes
[254]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/CtCILibrary/CtCILibrary/TreeNode.java
[255]: https://leetcode.com/problems/lemonade-change/
[256]: https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2004.%20Trees%20and%20Graphs
[257]: http://www.growingwiththeweb.com/2015/11/check-if-a-binary-tree-is-balanced.html
[258]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_05_Validate_BST/Question.java
[259]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_06_Successor/Question.java
[260]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_07_Build_Order/DFS/Question.java
[261]: https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_08_First_Common_Ancestor
[262]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_09_BST_Sequences/Question.java
[263]: https://leetcode.com/problems/binary-tree-preorder-traversal/
[264]: https://www.geeksforgeeks.org/smallest-difference-pair-values-two-unsorted-arrays/
[265]: https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_10_Check_Subtree
[266]: https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_11_Random_Node
[267]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2004.%20Trees%20and%20Graphs/Q4_12_Paths_with_Sum/QuestionB.java
[268]: https://articles.leetcode.com/determine-if-two-rectangles-overlap/
[269]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2008.%20Recursion%20and%20Dynamic%20Programming/Q8_01_Triple_Step/QuestionA.java
[270]: https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2008.%20Recursion%20and%20Dynamic%20Programming/Q8_02_Robot_in_a_Grid/QuestionA.java
[271]: https://leetcode.com/problems/unique-paths/
[272]: https://leetcode.com/problems/unique-paths-ii/
[273]: https://leetcode.com/problems/predict-the-winner/
[274]: https://www.geeksforgeeks.org/multiply-two-numbers-without-using-multiply-division-bitwise-operators-and-no-loops/
[275]: https://www.geeksforgeeks.org/multiply-two-numbers-without-using-multiply-division-bitwise-operators-and-no-loops/
[276]: https://www.geeksforgeeks.org/longest-increasing-subsequence/
[277]: https://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
[278]: https://leetcode.com/problems/minimum-window-substring/
[279]: https://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/
[280]: https://www.geeksforgeeks.org/count-number-of-ways-to-cover-a-distance/
[281]: https://leetcode.com/problems/longest-substring-without-repeating-characters/
[282]: https://www.geeksforgeeks.org/find-the-longest-path-in-a-matrix-with-given-constraints/
[283]: https://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
[284]: https://leetcode.com/problems/partition-equal-subset-sum/
[285]: https://www.geeksforgeeks.org/dynamic-programming-set-31-optimal-strategy-for-a-game/
[286]: https://www.geeksforgeeks.org/knapsack-problem/
[287]: https://leetcode.com/problems/house-robber-ii/
[288]: https://leetcode.com/problems/house-robber-iii/
[289]: https://leetcode.com/problems/keys-and-rooms/
[290]: https://leetcode.com/problems/pacific-atlantic-water-flow/
[291]: https://leetcode.com/problems/flipping-an-image/
[292]: https://leetcode.com/problems/jump-game/
[293]: https://leetcode.com/problems/word-break/
[294]: https://leetcode.com/problems/count-of-smaller-numbers-after-self/
[295]: https://leetcode.com/problems/unique-binary-search-trees/
[296]: https://leetcode.com/problems/repeated-dna-sequences/
[297]: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
[298]: https://leetcode.com/problems/stickers-to-spell-word/
[299]: https://leetcode.com/problems/buddy-strings/

[1000]: https://www.geeksforgeeks.org/data-structures/linked-list/
[1001]: http://bigocheatsheet.com/