class nicholasSort {
    fun sortHigh(vetor:IntArray, pos:Int): List<Int>{

        if (pos >= vetor.size-1) return vetor.asList()

        var aux = vetor[pos]
        var cont:Int = pos

        while (cont < vetor.size){
            if (vetor[cont] < aux){
                vetor[pos] = vetor[cont]
                vetor[cont] = aux
                aux = vetor[pos]
            }
            cont++
        }

        //Pega o maior e coloca na posição correta, achei que fosse melhor a velocidade mas n adiantou nada

//        cont -= 1
//        aux = vetor[cont]
//
//        while (cont > 0+pos){
//            if (vetor[cont] > aux){
//                vetor[vetor.size-1-pos] = vetor[cont]
//                vetor[cont] = aux
//                aux = vetor[vetor.size-1-pos]
//                println(vetor.asList())
//            }
//            cont--
//        }

        sortHigh(vetor, pos+1)

        return vetor.asList()
    }
}