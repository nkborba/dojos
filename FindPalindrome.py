import time

def numberToList(n):
    lista = [int(numStr) for numStr in str(n)]
    return lista

def invertList(l):
    lista = l
    length = len(l) #To get the length of the list to be able to do a for properly over the list positions
    pos = length-1  #Length should gave us the total number, but we know lists starts at 0, so let's decrease this number by 1
    
    #We don't need to iterate over all list because we'll move 2 itens each loop
    #then we can divide this by 2 and convert to INT for round porpuses
    #if we have an odd number of elements the middle will always keep the same

    cont = int(length/2)

    for x in range(cont):
        aux = l[x]
        l[x] = l[pos]
        l[pos] = aux
        pos -= 1
    return l

def findPalindrome(start, end):

    start_time = time.time()

    for num in range(start, end+1):
        lista = numberToList(num)
        #A new list must be created, if we just 
        toCompare = invertList(numberToList(num))

        pos = len(lista)-1  #List lenght will be used as the current position

        if pos <= 0:
            print(num)
        else:   
            if toCompare == lista:
                print(num)
    
    return print("--- %s seconds ---" % (time.time() - start_time))
        
start = input("Digite o primeiro numero do intervalo: ")
end = input("Digite o segundo numero do intervalo: ")

findPalindrome(int(start), int(end))
