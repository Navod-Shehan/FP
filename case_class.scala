object MyApp extends App{
	val p1= Point(3,3)
	val p2=  Point(8,8)
	val p3=p1.move(3,4)
	val p4=p1.add(p2)
	val p5=p1.invert
	val p6=p1.distance(p4)
	println(p1)
	println(p2)
	println(p3)
	println(p4)
	println(p5)
	println(p6)
	
	println(p1+p2)

}

case class Point(a:Int, b:Int)
{
	def x:Int=a
	def y:Int=b

	def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

	def add(that:Point)=Point(this.x+that.x,this.y+that.y)


	def distance(that:Point)=Point(this.x-that.x,this.y-that.y)

	def invert=Point(this.y,this.x)
}
