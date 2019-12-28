//entry point the application starts from
fun main() {
    var variable = "123"
    val valiable = 234

    print("hello world")
    print("Variable value $variable , whereas valiable value is " + valiable)

    println("the same while loop construction as it is in Java:")
    print("loading")
    while (System.currentTimeMillis() % 5 != 0L) {
        print(".")
    }
    println()

    //for loop, nothing special
    for (i in 1..9){
        println(i)
    }

    if (1.equals(1)){
        print("look weird, doesn't it")
    }

    if (1.equals(1L)){
        print("not gonna happen?") //not gonna happen
    }

    val someValue = if (10>20) 1 else 2 //ternary operator, kotlin edition
    println(someValue)
}

//one-line comment
/* comment */

/***
 * @kek obviously, not a javadoc
 * ***************************************************/