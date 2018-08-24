import java.util.Collections.swap

class QuickSort {
    fun quickSort(vetor:IntArray, left:Int, right:Int): List<Int>{

        //VETOR = (12, 98, 50, 578, 65, 48, 100)

        var pivot:Int; var pointEsq = left; var pointDir = right
        var cont:Int = left

        if (pointDir-pointEsq <= 0){
            println("estrou aqui")
            return vetor.asList()
        }


        //for(i in 0 until vetor.size){
        while (pointDir-pointEsq != 0) {

            pivot = vetor[pointEsq]
            println("Pivot: " + pivot)
            println(vetor.asList())

            //Enquanto ponteiro da direita for maior que o pivot, diminui a pos. do ponteiro
            while (vetor[pointDir] > pivot) {
                pointDir--
            }

            //println("Point Dir: "+vetor[pointDir])

            //
            if (vetor[pointDir] < pivot) {
                vetor[pointEsq] = vetor[pointDir]
                vetor[pointDir] = pivot
            }

            //Enquanto ponteiro da esquerda for menor que o pivot, aumenta a pos. do ponteiro
            while (vetor[pointEsq] < pivot) {
                pointEsq++
            }

            //
            if (vetor[pointEsq] > pivot) {
                vetor[pointDir] = vetor[pointEsq]
                vetor[pointEsq] = pivot
            }

            println(pointEsq.toString() + " " + pointDir.toString())

        }
        cont++
        quickSort(vetor, cont, vetor.size-1)
        //}

        return vetor.asList()
    }
}