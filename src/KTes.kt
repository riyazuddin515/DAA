class KTes {
    fun main(){

    }
}

fun main(){
    val list = mutableListOf<Int>()
    for (i in 1..10)
        list.add(i)
    val count = list.count {
        it % 2 == 0
    }
    println(list.size)
    print(count)
}