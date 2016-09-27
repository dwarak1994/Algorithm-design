##counting sort in python
#sorting in near linear time
#creates two extra arrays
#little waste of memory
def sort(A,k):
    c=[]
    B=[]
    for i in range(0,len(A)):
        B.append(0)
    for i in range(max(A)+1):
        c.append(0)
    for j in range(0,len(A)):
        c[A[j]]=c[A[j]]+1
    for i in range(1,k+1):
        c[i]=c[i]+c[i-1]
    for j in range(len(A)):
        B[c[A[j]]-1]=A[j]
        c[A[j]]=c[A[j]]-1
    print B


a=[2,5,3,1,2,3,1,3]
sort(a,max(a))

