package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;
/** 小敌机 */
public class Airplane extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("airplane"+i+".png");
		}
	}
	
	private int speed;
	public Airplane(){
		super(49,36);
		Random rand = new Random();
		speed = rand.nextInt(3)+1;
	}
	public void step(){
		System.out.println("小敌机移动啦!");
	}
	
	int deadIndex = 1;
	public BufferedImage getImage(){
		if(isLife()){
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[deadIndex++];
			if(deadIndex==images.length){
				state = REMOVE;
			}
			return img;
		}
		return null;
	}
	
	
}












