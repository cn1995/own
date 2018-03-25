package cn.tedu.shoot;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
/** 整个世界 */
public class World extends JPanel {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;
	
	private Sky sky = new Sky();
	private Hero hero = new Hero();
	private FlyingObject[] enemies = new FlyingObject[]{
		new Airplane(),
		new BigAirplane(),
		new Bee()
	};
	private Bullet[] bullets = new Bullet[]{
		new Bullet(100,200)
	};
	
	public void action(){
		
	}
	
	/** 重写超类的paint */
	public void paint(Graphics g){
		sky.paintObject(g);
		hero.paintObject(g);
		for(int i=0;i<enemies.length;i++){
			enemies[i].paintObject(g);
		}
		for(int i=0;i<bullets.length;i++){
			bullets[i].paintObject(g);
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		frame.add(world);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		
		world.action();
	}
}















