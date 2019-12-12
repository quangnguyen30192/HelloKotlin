fun main() {
   val test = 1
   val list = mutableListOf(2, 3, 4)

   val addedElement = addElement(test, list) //

   println("Added element: $addedElement")

   println("Print list ")
   list.forEach { println(it) }
}

// also is useful if you have a value that you need to return, but before returning you also need to use it to do something else
fun addElement(e: Int, items: MutableList<Int>) = e.also { // return e but please do the statement first
   items.add(it) // e as a param and return e
}
