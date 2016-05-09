package hibrave

/**
  * Created by admin-k on 2016/5/10.
  */
class Brave(var name:String, var initHp:Int) {
  var nowHp = this.initHp
  var state = healthCheck()
  def touch3HeadDog(touchCount:Int):Unit={
    nowHp = nowHp - touchCount
    state = healthCheck()
  }
  def healthCheck():String={
    if (nowHp <= 0){
      "dead"
    }else{
      "alive"
    }
  }
}
