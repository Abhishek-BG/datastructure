def rotate(array,pos):
    a=0
    temp =[]
    for i in range(pos,len(array)):
        temp.append(array[i])
    for i in range(pos):
        temp.append(array[i])
    print(temp)


def main():
    array = list(map(int,input().split(",")))
    pos = int(input("position: "))
    rotate(array,pos)
    
main()