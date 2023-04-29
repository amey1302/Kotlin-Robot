import java.util.Calendar

class Robot(val name:String) {
    //1. Alram the ring
    fun ringAlarm(time:String)= println("Good Morning!! I'm $name it's already $time wake up!!!")
    //2. Make coffee
    fun makeCoffee(coffee :Coffee)= if(coffee.black) println("Your Black coffee with ${coffee.spoonsofsuagr} sppons of sugar is ready!")
        else println("Your coffee with ${coffee.spoonsofsuagr} sppons of sugar is ready! ")

    //3. Heat Water
    fun heatWater(temp :Int )= println("Bath water with $temp is ready, come & take a bath now!")

    //4. Pack bag
    fun packBag(day :Int){
        val msgtmp= "Books for today are :"
        val subjects= arrayOf("Maths","Physics","Chemistry","Biology","English","Marathi","CS")

        when(day){
            Calendar.MONDAY-> println("$msgtmp ${subjects[0]},${subjects[2]},${subjects[3]},${subjects[4]},${subjects[5]}")
            Calendar.TUESDAY-> println("$msgtmp ${subjects[0]},${subjects[1]},${subjects[2]}")
            Calendar.WEDNESDAY-> println("$msgtmp ${subjects[2]},${subjects[3]},${subjects[5]}")
            Calendar.THURSDAY-> println("$msgtmp ${subjects[3]},${subjects[1]},${subjects[4]},${subjects[5]},${subjects[6]}")
            Calendar.FRIDAY-> println("$msgtmp ${subjects[1]},${subjects[2]},${subjects[3]},${subjects[4]}")
            Calendar.SATURDAY-> println("$msgtmp ${subjects[0]},${subjects[1]},${subjects[6]}")
            else -> println("Invalid or Today is Holiday!!")

        }


    }

    // 5. Cook
    fun cook() {
        val breakfast =
            mutableListOf("Bhel", "Panipuri", "Misal", "Pavbhaji", "PuriBhaji", "uttapam", "Dosa", "Eggcuri")
        val lunch = mutableListOf(
            "Maharashtrian thali",
            "Punjabi thali",
            "Shahi Panner with roti",
            "Pulav",
            "masala rice",
            "puranpoli and khavapoli"
        )
    println("Today's Breakfast is ${breakfast.random()} and lunch is ${lunch.random()}")
    }

    // 6. Iron the clothes
    fun ironClothes(shirtcol :String,trousercol :String){
        val shirtcolors = mutableListOf("Blue","Green","Black","Pink","Orange","Red","Yellow","White")
        val trousercolors = mutableListOf("Blue","White","Black")

        if(shirtcolors.contains(shirtcol)){
            if(trousercolors.contains(trousercol)){
                println("Your Clothes are ready!!")

            }
            else{
                println("You do not have trouser of this color. ")
            }
        }
        else{
            println("You do not have Shirt of this color. ")
        }

    }


}