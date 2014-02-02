class ScalaBean(val name:String,age:Int,var alive:Boolean) {
  private val string = name + age.toString
}

val bean: ScalaBean = new ScalaBean("Tomek",100,true)
bean.name // public value
bean.alive
bean.alive_=(false)
bean.alive
bean.age // private


bean.string // private







