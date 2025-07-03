def solution(participant, completion):
    answer = ''
    dic = makeDic(participant)
    for person in completion:
        if person in dic :
            dic[person] -=1
    for key , value in dic.items():
        if value != 0:
            answer = key 
            break
    return answer

def makeDic(data):
    dic = {} 
    for person in data:
        if person in dic:
            dic[person] += 1
        else:
            dic[person] = 1
    return dic

