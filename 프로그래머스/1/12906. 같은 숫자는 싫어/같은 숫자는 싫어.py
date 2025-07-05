from collections import deque

def solution(arr):
    return makeFIFO(deque(arr))

def makeFIFO(arr):
    answer = [] 
    if not arr:
        return answer

    data = arr.popleft()
    answer.append(data)

    while arr:
        index = arr.popleft()
        if data == index:
            continue
        answer.append(index)
        data = index

    return answer
