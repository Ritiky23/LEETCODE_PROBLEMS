class Result(object):
    def __init__(self, arg1, arg2):
        self.output1 = arg1  # int
        self.output2 = arg2  # int
class UserMainCode(object):
    @classmethod
    def profitDevelopment(cls, input1, input2, input3, input4):
        minheap = []
        country = 1
        def make_number(arr):
            num = 0
            for i in arr:
                num = num * 10 + i
            return num
        def push(heap, item):
            heap.append(item)
            pos = len(heap) - 1
            while pos > 0 and item[0] < heap[(pos - 1) // 2][0]:
                heap[pos], heap[(pos - 1) // 2] = heap[(pos - 1) // 2], heap[pos]
                pos = (pos - 1) // 2
        def pop(heap):
            if not heap:
                return None
            if len(heap) == 1:
                return heap.pop()
            root = heap[0]
            heap[0] = heap.pop()
            pos = 0
            while True:
                left_child = 2 * pos + 1
                right_child = 2 * pos + 2
                if left_child >= len(heap):
                    break
                min_child = left_child
                if right_child < len(heap) and heap[right_child][0] < heap[left_child][0]:
                    min_child = right_child
                if heap[min_child][0] < heap[pos][0]:
                    heap[pos], heap[min_child] = heap[min_child], heap[pos]
                    pos = min_child
                else:
                    break
            return root
        for i in range(0, input1, input2):
            push(minheap, (make_number(sorted(input4[i:i + input2])), country))
            country += 1
        while input3 - input2 > 0:
            pop(minheap)
            input3 -= input2
        state_rating, country = pop(minheap)
        state_rating = str(state_rating)
        return Result(country, int(state_rating[input3 - 1]))
input1 = int(input())
input2 = int(input())
input3 = int(input())
input4 = list(map(int, input().split()))
result_obj = UserMainCode.profitDevelopment(input1, input2, input3, input4)
print(result_obj.output1)
print(result_obj.output2)
