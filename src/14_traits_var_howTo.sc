trait WithName {
  var name:String
  override def name_(a:String):Unit = {name = a}
}



trait WithAge {
  var age: Int
  def age_=(a:Int):Unit = { age=a}
}










trait WithId {
  var id: Long
  def isPersisted = id > 0
}
class NameAndAge extends WithName with WithAge






val nameAndAge: NameAndAge = new NameAndAge





nameAndAge.name


nameAndAge.age



class NameEntity extends WithId with WithName







