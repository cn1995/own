package cn.tedu.shoot;
//求一组图形中的最大面积
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		shapes[0] = new Circle(1);
		shapes[1] = new Circle(2); //大
		shapes[2] = new Square(1);
		shapes[3] = new Square(2); 
		shapes[4] = new Six(1);
		shapes[5] = new Six(2);    
		
		double max = shapes[0].area();
		int maxIndex = 0; //最大面积下标
		for(int i=1;i<shapes.length;i++){
			double area = shapes[i].area();
			if(area>max){
				max=area;
				maxIndex=i;
			}
		}
		System.out.println("最大面积为:"+max+"，所在下标为:"+maxIndex);
		
	}
}

abstract class Shape{
	protected double c; //周长
	public abstract double area();
}
class Circle extends Shape{
	public Circle(double c){
		this.c = c;
	}
	public double area(){
		return 0.0796*c*c;
		//Square(0.0625),Six(0.0721)
	}
}
class Square extends Shape{
	public Square(double c){
		this.c = c;
	}
	public double area(){
		return 0.0625*c*c;
	}
}
class Six extends Shape{
	public Six(double c){
		this.c = c;
	}
	public double area(){
		return 0.0721*c*c;
	}
}

















