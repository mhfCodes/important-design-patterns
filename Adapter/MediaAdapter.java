package com.hossein.ImpDesignPatterns.Adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(MediaType mediaType) {
		
		switch(mediaType) {
			case MP4:
				advancedMediaPlayer = new Mp4Player();
				break;
			case VLC:
				advancedMediaPlayer = new VlcPlayer();
				break;
			default:
				System.out.println("Not A Valid Media Type");
		}
		
	}

	@Override
	public void play(MediaType mediaType, String filename) {
		
		switch(mediaType) {
			
			case MP4:
				advancedMediaPlayer.playMp4(filename);
				break;
			case VLC:
				advancedMediaPlayer.playVlc(filename);
				break;
			default:
				System.out.println("Not A Valid Media Type");
		}
	}

}
