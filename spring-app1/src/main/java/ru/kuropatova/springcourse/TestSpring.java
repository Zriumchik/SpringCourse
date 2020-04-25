package ru.kuropatova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		

		MusicPlayer musicplayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		musicplayer.playMusicList();
		musicplayer.playInfo();
		context.close();
		
	}
	

}
