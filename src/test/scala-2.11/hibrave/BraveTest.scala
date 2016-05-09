package hibrave

/**
  * Created by admin-k on 2016/5/10.
  */
import org.scalatest.{FlatSpec, ShouldMatchers}
class BraveTest extends FlatSpec with ShouldMatchers{
  "the brave alive" should "show when new and hp > 0 will be alive" in {
    val braveAmy = new Brave("Amy",15)
    braveAmy.name should be ("Amy")
    braveAmy.state should be ("alive")
  }

  "the brave dead " should "show when new and hp <= 0 will be dead" in {
    val braveAmy = new Brave("Hadoop",0)
    braveAmy.name should be ("Hadoop")
    braveAmy.state should be ("dead")
  }


  "the brave" should "minus 1 hp when touch three-head-dog and hp = 0 will be dead"in {
    val braveJohnny = new Brave("Johnny",10)
    braveJohnny.touch3HeadDog(1)
    braveJohnny.nowHp should be (9)
    val dieTouch = braveJohnny.nowHp
    braveJohnny.touch3HeadDog(dieTouch)
    braveJohnny.nowHp should be (0)
    braveJohnny.state should be ("dead")
  }
  "health check" should "check brave 's hp >0 and <=0 state" in{
    val braveAny = new Brave("Any",15)
    braveAny.touch3HeadDog(2)
    braveAny.healthCheck() should be ("alive")
    val braveDead = new Brave("Dead",0)
    braveDead.healthCheck() should be ("dead")
  }


}
