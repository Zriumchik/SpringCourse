package ru.kuropatova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		//Music music = context.getBean("musicBean", Music.class);		
		//MusicPlayer musicplayer = new MusicPlayer(music);
		MusicPlayer musicplayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicplayer.playMusic();
		context.close();
		
	}
	

}
