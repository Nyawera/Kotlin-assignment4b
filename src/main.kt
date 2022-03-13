fun main(){
    var p =number(arrayOf(12,10,40,30,50))
    println(p)

    var f =mix(arrayOf(6,8,9,4,"Tut",4.5F,6.2F,"Nyawera",5,7))
    println(f)

    var v=char(arrayOf('a','e','i','o','u'))
    println(v)



}
fun number(numbers:Array<Int>):Int {
    var product = 1
    numbers.forEach { num ->
        product*=num
    }
    return product

//
//    Assignment 4(b): Arrays
//    1.Write a function that takes in an array of integers and returns the product of
//    all the elements(3pts)
//    2.Write a function that takes in an array of mixed types and returns the sum of
//            all the decimal elements(3pts)
//    3.Write a function that takes in an array of characters and returns the number of
//    vowels in the array(4pts)
}

fun mix(number:Array<Any>):Float {
    var sum = 0.0F
    number.forEach { Tut ->
        if (Tut is Double || Tut is Float) {
            sum += Tut.toString().toFloat()

        }
    }
    return sum

   }
fun char(numb:Array<Any>):Int{
    var vowels= 0
    numb.forEach{wera ->
        if (wera=='a'||wera=='e'||wera=='i' || wera=='o'||wera=='u') {
            vowels++
        }
        }
         return vowels

    }









