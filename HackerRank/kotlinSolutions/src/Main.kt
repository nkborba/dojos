fun main(args : Array<String>){

    //Instanciar as classes para chamar suas respectivas funções
    val m = MergeStrings()
    val bubbleSort = BubbleSort()

    //Input para função de ordenar vetor com BubbleSort
    val vetor:IntArray = intArrayOf(12, 98, 50, 578, 65, 48, 100)

    //MergeStrings intercalando
    //println(m.merge("aaaa", "bbbbbbbbb"))

    //BubbleSort
    println(bubbleSort.sort(vetor))

}