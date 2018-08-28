import kotlin.system.measureTimeMillis

fun main(args : Array<String>){

    //Instanciar as classes para chamar suas respectivas funções
    val m = MergeStrings()
    val bubbleSort = BubbleSort()
    val quick = QuickSort()
    val nbSort = nicholasSort()

    //Input para função de ordenar vetor com BubbleSort
    val vetor:IntArray = intArrayOf(654, 980, 50, 578, 65, 1)
    val bigVetor:IntArray = intArrayOf(654, 980, 50, 578, 65, 1, 800, 546, 48 ,87 ,5498, 75, 7, 789, 54, 8,4 ,78)
    val vetorSimples:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)


    //MergeStrings intercalando
    //println(m.merge("aaaa", "bbbbbbbbb"))

    //BubbleSort
    //println(measureTimeMillis { println(bubbleSort.sort(vetor)) })

    //QuickSort WIP
    println(vetor.asList())
    println(quick.quickSort(vetor, 0, vetor.size-1).asList())

    //Nicholas Borba Sort
    //println(measureTimeMillis { println(nbSort.sortHigh(vetor, 0))})

}