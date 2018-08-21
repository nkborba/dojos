class MergeStrings {

    fun merge(a: String, b: String): String {
        var result = ""
        var larger = if (a.length > b.length) a.length else b.length

        for (cont: Int in 0 until larger) {
            if (cont < a.length) result += a[cont]
            if (cont < b.length) result += b[cont]
        }

        return result
    }
}