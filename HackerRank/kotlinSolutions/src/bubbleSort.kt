class BubbleSort {
    fun sort(vetor: IntArray): List<Int> {

        var aux: Int

        for (posVet1 in 0 until vetor.size-1){
            for (posVet2 in 0 until vetor.size-1-posVet1){
                if (vetor[posVet2] > vetor[posVet2+1]){
                    aux = vetor[posVet2]
                    vetor[posVet2] = vetor[posVet2+1]
                    vetor[posVet2+1] = aux
                }
            }
        }

        return vetor.asList()
    }
}