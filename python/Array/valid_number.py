""" for a given array of n integers 
and assume that '0' is a invalid number 
and all others as a valid number , convert  the array in such a way 
that if both current and next element is valid  and both
have the same value then double current value  and replace
the next number with 0, after modification rearrange the 
array such all 0's shifted to the end
input =  {2,2,0,4,0,8}
output :4,4,8,0,0,0
in = {0,2,2,2,0,6,6,0,0,8}
op =  4,2,12,8,0,0,0,0,0,0

"""

def pushZero(arr,n):
    count = 0
    for i in range(0,n):
        if arr[i] != 0:
            arr[count] = arr[i]
            count+=1
    while(count < n):
        arr[count] =0
        count+=1

def modify(arr,n):
    if n ==1:
        return
    for i in range(0,n-1):
        if(arr[i]!=0 ) and (arr[i]==arr[i+1]):
            arr[i]=2*arr[i]

            arr[i+1] =0
            i+=1

    pushZero(arr,n)
def printA(arr,n):
    for i in range(n):
        print(arr[i],end=" ")

arr = [2,2,0,4,0,8]
n = len(arr)

modify(arr,n)
printA(arr,n)