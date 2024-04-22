class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> block = new HashSet<>(Arrays.asList(deadends));

        Set<String> visited = new HashSet<>();
        int[] start = new int[] { 0, 0, 0, 0 };

        Deque<int[]> queue = new LinkedList<>();
        queue.offer(start);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] current = queue.poll();
                String value = toString(current);
                if (block.contains(value)) {
                    continue;
                }

                if (target.equals(value)) {
                    return level;
                }

                if (visited.contains(value)) {
                    continue;
                }

                visited.add(value);

                for (int i = 0; i < 4; i++) {
                    int[] next = replaceAtIndex(current, i, 1);
                    int[] before = replaceAtIndex(current, i, -1);
                    if (!visited.contains(toString(next)) && !block.contains(toString(next))) {
                        queue.offer(next);
                    }
                    if (!visited.contains(toString(before)) && !block.contains(toString(before))) {
                        queue.offer(before);
                    }
                }
            }
            level++;
        }

        return -1;
    }

    String toString(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
        }
        return str.toString();
    }

    int[] replaceAtIndex(int current[], int index, int value) {
        int copy[] = new int[current.length];
        System.arraycopy(current, 0, copy, 0, current.length);
        if (value < 0) {
            value += 10;
        }
        copy[index] += value;
        copy[index] %= 10;
        return copy;
    }
}
