fun main() {
   val test = 1
   val list = mutableListOf(2, 3, 4)

   val addedElement = addElement(test, list) //

   println("Added element: $addedElement")

   println("Print list ")
   list.forEach { println(it) }
}


// run: use this
// run is useful if at the end calling a few methods on the object and then one that return something else.
fun addElement(e: Int, items: MutableList<Int>) = e.run {
    items.add(this)
    this // implicit returns
}
