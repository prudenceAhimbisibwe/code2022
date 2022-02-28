fun main(){
    val text = "Akirachix"
    val x =text[0].toString()+ text[2]+ text[3]
    println(x)
    statement()
    count()
    clarify()
    prove()


}
fun statement(){
    val name = "Ahimbisibwe Prudence"
    val age = "20"
    val statement = "Hi my name is $name and I am $age years old"
    println(statement)
}
fun count(){
    val x = "codehive"
    val y = (x.length)
    println("There are $y characters in a string")
}
fun clarify(){
    val name = "Ahimbisibwe"
    if("Ahimbisibwe" in name){
        println("Thats me")}
    else{
        println("I don't know who that is")}

    }
fun prove(){
    val animal = "goat"
    if ("cow" in animal){
        println("Domestic animal")}
    else{
        println("I am not sure")}
}




