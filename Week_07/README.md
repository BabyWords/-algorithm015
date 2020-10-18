学习笔记
- 字典树
- 并查集
- 剪枝 ,双向 BFS
- AVL 树
    - 左右子树高度差为 1
    - 不平衡时可以通过旋转操作来保持平衡
```
Deque<String> beginDeque = new ArrayDeque<>();
Deque<String> endDeque = new ArrayDeque<>();
Set<String> visited = new HashSet<>();

Deque<String> tmp;

// 初始化顶端和底端
beginDeque.addFirst(begin);
endDeque.addFirst(end);

while(!beginDeque.isEmpty() && !endDeque.isEmpty()){
    // 每次取状态少的一端扩展
    if(beginDeque.size()>endDeque.size()){
        Deque<String> deque = beginDeque;
        beginDeque = endDeque;
        endDeque = deque;
    }
    tmp = new ArrayDeque<>();

    // 扩展，扩展得到的内容暂存在tmp中
    while(!beginDeque.isEmpty()){
        String str = beginDeque.removeLast();
        // 对str进行扩展
        if(endDeque.contains(extendedStr)){
            // 相遇了，进行处理
        }else if(!visited.contains(extendedStr)){
            tmp.addFirst(extendedStr);
            visited.add(extendedStr);
        }
    }
    beginDeque = tmp;
}
```
基础太差,跟不上了...接下来按照自己的节奏复习前几章,没做的题都补上