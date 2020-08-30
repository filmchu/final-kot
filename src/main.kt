fun main() {
    var myAnimal = Animal()
    myAnimal.eat()
    myAnimal.roam()
    myAnimal.MakeNoise()
    myAnimal.sleep()

    var myHippo = Hippo()
    myHippo.MakeNoise()
    myHippo.eat()

    var myFeline = feline()
    myFeline.roam()

    var myLion = Lion()
    myLion.MakeNoise()
    myLion.eat()

    var myCheetah = Cheetah()
    myCheetah.MakeNoise()
    myCheetah.eat()

    var myCanine = Canine()
    myCanine.roam()

    var myWolf = Wolf()
    myWolf.MakeNoise()
    myWolf.eat()

    var myFox = Fox()
    myFox.MakeNoise()
    myFox.eat()

}
open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun MakeNoise(){
        println("The Animal is making a noise")
    }
    open fun eat(){
        println("The Animal is eating")
    }
    open fun roam(){
        println("The Animal is roam")
    }
    open fun sleep(){
        println("The Animal is sleeping")
    }
}
class Hippo : Animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override  val habitat = "water"

    override fun MakeNoise(){
        println("Grunt! Grunt!")
    }
    override  fun eat(){
        println("ฮิปโปกิน $food")
    }
}
open class feline : Animal(){
    override fun roam() {
        println("คลาส Feline กำลังเดินและปีนต้นไม้ได้")
    }

}
class Lion : feline(){
    override val image = "Lion.jpg"
    override val food = "เนื้อสัตว์"
    override  val habitat = "น้ำ"

    override fun MakeNoise(){
        println("สิงโตร้องคำรามแบบสิงโต")
    }
    override fun eat(){
        println("สิงโตกิน $food")
    }
}
class Cheetah : feline(){
    override val image = "Cheetah.jpg"
    override val food = "เนื้อสัตว์"
    override  val habitat = "ถ้ำ"

    override fun MakeNoise(){
        println("เสือชีต้าร้องคำรามแบบเสือ")
    }
    override fun eat(){
        println("เสือชีต้ากิน $food")
    }
}
class Lynx : feline(){
    override val image = "Lynx.jpg"
    override val food = "เนื้อสัตว์ เช่น แมว"
    override  val habitat = "ถ้ำ"

    override fun MakeNoise(){
        println("เเมวป่าร้องคำรามแบบเเมวป่า")
    }
    override fun eat(){
        println("เเมวป่ากิน $food")
    }
}
open class Canine : Animal(){
    override fun roam(){
        println("คลาส Canine เดินบนพื้นได้เท่านั้น")
    }
}
class Wolf : Canine() {
    override val image = "Wolf.jpg"
    override val food = "เพดดีกรี"
    override val habitat = "ถ้ำ"

    override fun MakeNoise() {
        println("หมาป่าร้องคำรามแบบสุนัข")
    }

    override fun eat() {
        println("หมาป่ากิน $food")
    }
}
class Fox : Canine() {
    override val image = "Fox.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "บนบก"

    override fun MakeNoise() {
        println("หมาป่าร้องคำรามแบบสุนัข")
    }

    override fun eat() {
        println("หมาป่ากิน $food")
    }
}
class Vet{
    fun giveShot(animal: Animal){
        animal.MakeNoise()
    }
}
fun main(arg: Array<String>){
    val animal = arrayOf(Hippo(), Lion(),Cheetah(),Lynx(),Wolf(),Fox())
    for (item in animal){
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val hippo = Hippo()
    val lion = Lion()
    val cheetah = Cheetah()
    val lynx = Lynx()
    val wolf = Wolf()
    val fox = Fox()
    vet.giveShot(hippo)
    vet.giveShot(lion)
    vet.giveShot(cheetah)
    vet.giveShot(lynx)
    vet.giveShot(wolf)
    vet.giveShot(fox)

}
