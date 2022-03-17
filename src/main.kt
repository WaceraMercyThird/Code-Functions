fun main() {
    myString()
    var returned = modulus(30,7)
    println(returned)
    var file = nameAge("Maxine", 78)
    println(file)
    var lenStm= length("Mercy Wacera")
    println(lenStm)

}
//String “codeHive”. Write a function that prints out a string composed
//of the fifth, sixth, seventh and eighth  characters of the string
fun myString(){
    var program = "CodeHive"
    println(program[4].toString()+program[5]+program[6]+program[7])
}

//invoke a function that given two numbers returns the
//remainder of their division
fun modulus(num1:Int, num2:Int):Int{
    var reminder = num1%num2
   return reminder
}
//a function that takes in two parameters, name and age and returns a
//String with this structure “Hi, my name is p and I am z years old.” Where p
//and  z are your  name and age respectively
fun nameAge(p:String, z:Int):String{

   var structure = ("Hi, my name is $p and I am $z years old.")
       return structure
}
//a function that takes in a string and returns its length
fun length(name:String):Int{

    var len = name.length
    return len
}