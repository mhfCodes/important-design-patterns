	package com.hossein.ImpDesignPatterns.Adapter;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;

	@Override
	public void play(MediaType mediaType, String filename) {
		
		switch(mediaType) {
			case MP3:
				System.out.println("Playing MP3 File. Name: " + filename);
				break;
			case MP4:
			case VLC:
				mediaAdapter = new MediaAdapter(mediaType);
				mediaAdapter.play(mediaType, filename);
			default:
				System.out.println("Invalid Media Type. " + mediaType + " Format Not Supported.");
		}
		
	}

}
