import java.util.Collections.swap

class QuickSort {
    fun quickSort(vetor:IntArray, left:Int, right:Int): IntArray{

        //VETOR = (654, 980, 50, 578, 65, 1)

        if (left == right) return vetor

        var pivot = vetor[left]
        var cont1 = 0
        var cont2 = 0

        while (left+cont2 < right-cont1) {

            while (cont1 < right - 1) {
                if (pivot > vetor[right - cont1]) {
                    vetor[right - cont1] = vetor[left+cont1].also { vetor[left+cont1] = vetor[right - cont1] }
                    //println(vetor.asList())
                    break
                }
                cont1++
            }

            while (cont2 < right - cont1) {
                if (pivot < vetor[left + cont2]) {
                    vetor[left + cont2] = vetor[right - cont1].also { vetor[right - cont1] = vetor[left + cont2] }
                    //println(vetor.asList())
                    break
                }
                cont2++
            }

            //println("Final:"+vetor.asList())
        }

        println(right-cont1-1)
        quickSort(vetor, left, right-cont1-1)

        return vetor
    }
}