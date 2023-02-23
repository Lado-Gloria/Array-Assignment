import java.util.Arrays

fun main() {
    names("Gloria" ,"Mary", "Stella", "Joyce")
    city()
    number()
    println(takes("Snaida","Sonia", "Kevine"))
}
fun names(name1:String,name2:String,name3:String,name4:String){
    val nameArray = arrayOf(name1,name2,name3,name4)
    println(nameArray.contentToString())

}
fun city(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var gramatically = (cities.map { it.capitalize() }.sorted())
    println(gramatically)


}

fun number(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println( numbers[1] + numbers[4])
    println( numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
fun takes(name1:String,name2:String,name3: String, ):String{
    var take= arrayOf(name1,name2,name3 )
    return take.contentToString()
}




