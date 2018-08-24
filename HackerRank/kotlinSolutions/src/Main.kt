fun main(args : Array<String>){

    //Instanciar as classes para chamar suas respectivas funções
    val m = MergeStrings()
    val bubbleSort = BubbleSort()
    val quick = QuickSort()

    //Input para função de ordenar vetor com BubbleSort
    val vetor:IntArray = intArrayOf(100, 98, 50, 578, 65, 48, 12)

    //MergeStrings intercalando
    //println(m.merge("aaaa", "bbbbbbbbb"))

    //BubbleSort
    //println(bubbleSort.sort(vetor))

    //QuickSort
    println(quick.quickSort(vetor, 0, vetor.size-1))


}