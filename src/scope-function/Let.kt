// to replace the if else block: if (a !== null) a.test else "default" => return a?.let { it.property } ?: "default"
fun main() {
   val test = "hello"

   val t =  printLength(test) // 5 since test is not null
   // val t =  printLength(null) // -1 since test is null
   print(t)
}


// RULE: let pass it
fun printLength(v: String?) = v?.let { it.length } ?: -1
