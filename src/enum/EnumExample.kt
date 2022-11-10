package enum

// typical approach
enum class Numbers(val deg: Int) {
    ONE(1),
    TWO(2),
    THREE(3);

    companion object {
        infix fun from(value: Int): Numbers? = Numbers.values().firstOrNull { it.deg == value }
    }
}

// using map to cache, faster than 1
enum class NumberV2(val value: Int) {
    ONE(1), TWO(2), THREE(3);

    companion object {
        private val map = NumberV2.values().associateBy { it.value }
        infix fun from(value: Int) = map[value]
    }
}

// operator overloading
enum class NumberV3(val value: Int) {
    ONE(1), TWO(2), THREE(3);

    companion object {
        private val map = NumberV3.values().associateBy { it.value }
        operator fun get(value: Int) = map[value]
    }
}

// aproach 4: a bit improved
abstract class EnumFinder<V, E>(private val valueMap: Map<V, E>) {
    infix fun from(value: V) = valueMap[value]
}

enum class NumberV4(val value: Int) {
    ONE(1), TWO(2), THREE(3);

    companion object : EnumFinder<Int, NumberV4>(NumberV4.values().associateBy { it.value })
}

fun main(args: Array<String>) {
    val number = Numbers from 1
    print(number)

    val number3 = NumberV3[2]
    print(number3)

    val number4 = NumberV4 from 3
    println(number4)
}
