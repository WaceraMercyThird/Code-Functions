fun main() {
    myString()
    modulus()
    nameAge("Maxine", 78)
    length()

}
fun myString(){
    var program = "CodeHive"
    println(program[4].toString()+program[5]+program[6]+program[7])
}

fun modulus(){
    var num = 30%7
   println(num)
}
fun nameAge(p:String, z:Int){
println("Hi, my name is"+" "+p+" "+ "and I am"+" "+ z +" "+"years old.")
}
fun length(){

    var name = "Mercy Wacera"
    println(name.length)
}