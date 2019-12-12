fun main() {
   val test = 1
   val list = mutableListOf(2, 3, 4)

   val addedElement = addElement(test, list) //

   println("Added element: $addedElement")

   println("Print list ")
   list.forEach { println(it) }
}

// apply is useful if you need to call several methods on an object without caring for their return, like setters. Like the other 3 Extended Functions if the target object is null the block won’t be called and inside the block the object is always of a non nullable type.
fun addElement(e: Int, items: MutableList<Int>) = with(e) {
    val t = e + 1
    items.add(t)
}
