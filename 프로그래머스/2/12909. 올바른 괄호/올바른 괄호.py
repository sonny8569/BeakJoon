def solution(s):
    answer = True
    stack = [] 
    for data in s:
        if data == "(":
            stack.append(data)
        elif stack:
            stack.pop() 
        else:
            return False 
    if len(stack) == 0:
        return True 
    return False 