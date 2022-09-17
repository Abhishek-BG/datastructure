"""

Connect n ropes with minimum cost

given are N ropes of different lengths

the task is to connect these ropes into

one rope with min cost, such that the

cost to connect two ropes is equal to

the sum of their lengths

example :

input : arr[] = {4,3,2,6}

N = 4

Output : 29

input : arr[] = {1,2,3}

N = 3

Output : 9

"""

import heapq



def mincost(arr,n):

    #priority queue

    heapq.heapify(arr)

    res =0

    while(len(arr)> 1):

        first = heapq.heappop(arr)

        second = heapq.heappop(arr)



        res +=first+second

        heapq.heappush(arr,first+second)

    return res



if __name__ == '__main__':

    lengths =[1,3,4,6]

    size = len(lengths)

    print(mincost(lengths,size))