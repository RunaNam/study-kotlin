package view

object OutputView {

    fun printException(e: Exception) {
        println(e.message)
        println()
    }
}