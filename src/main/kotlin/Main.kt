import java.util.Calendar

fun main() {

    val robot=Robot("Amey")
    //robot info
    println("Hii!! My name is ${robot.name} & I will be your robot")
    println()

    /* Input for ring alarm*/
    robot.ringAlarm("6:35 AM")
    println()

    //2. Make coffee
    robot.makeCoffee(Coffee(true, 2))
    println()

    //3. Heat Water with temperature in Celsius
    robot.heatWater(38)
    println()
    //4. Pack the bag
    robot.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()
    // 5. Cook the food
    robot.cook()
    println()
    // 6. Iron the clothes
    robot.ironClothes("White","Black")
    println()


}