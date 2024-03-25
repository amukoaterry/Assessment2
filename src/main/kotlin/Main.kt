fun main() {
   sentence("Barnie bakes brown bangles and buns")


    arr(arrayOf(12,20,5,6,10))
}

fun sentence(fact:String){
    var word= fact.split("b")
    println(word)

    }


fun arr(nums:Array<Int>){
    var x= nums.sum()
    println(x)

    var y= nums.count()
    println(y)

    var p= nums.average()
    println(p)
}













