__author__ = 'ranaf'
def numberList(a ,k):
    result = 0

    last_biggest = -1
    a_len = len(a)

    for idx in range(a_len):
        if a[idx] > k:
            result += (idx-last_biggest)*(a_len-idx)
            last_biggest = idx

    return result

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n,k = map(int, input().split())
        a = list(map(int, input().split()))
        print(numberList(a ,k))
