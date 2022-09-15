package com.hossein.ImpDesignPatterns.Adapter;

public class AdapterMain {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play(MediaType.MP3, "beyond the horizon.mp3");
		audioPlayer.play(MediaType.MP4, "alone.mp4");
		audioPlayer.play(MediaType.VLC, "far far away.vlc");
	}

}
