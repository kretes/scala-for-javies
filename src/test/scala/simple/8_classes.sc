class ScalaBean(val name:String,age:Int,var alive:Boolean) {
  private val string = name + age.toString
}

val bean: ScalaBean = new ScalaBean("Tomek",100,true)
bean.name // public value
bean.alive
//this is a scala-bean generated setter for Variable
bean.alive_=(false)
bean.alive
//will not compile as name is an immutable value and therefore does not have a setter
//bean.name_=("Hubert")


// will not compile, as this is a private member
//bean.age


// will not compile, as this is a private member
//bean.string













