def solution(array, commands):
    answer = []
    for data in commands:
        newArray = makeSort(array, data[0] - 1, data[1])  
        sortedArray = sort(newArray) 
        answer.append(sortedArray[data[2] - 1])
    return answer

def makeSort(array, first, last):
    return array[first:last]

def sort(array):
    value = []
    array = array[:]  
    while array:
        minValue = makeMin(array)
        value.append(minValue)
        array.remove(minValue)
    return value

def makeMin(array):
    data = array[0]
    for i in array:
        if i < data:
            data = i
    return data
