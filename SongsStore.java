package com.tv.service;

import java.util.ArrayList;
/**
 * 
 * @author Purna Chandra Lenka
 *
 */
public class SongsStore {

	ArrayList<String> songs = new ArrayList<>();

	public void playList() {
		songs.add("Song1");
		songs.add("Song2");
		songs.add("Song3");
		if (songs.size() == 3) {
			System.out.println("PlayList  -> [" + songs.get(0) + "," + songs.get(1) + "," + songs.get(2) + "]");
		}
	}

	public void recentPlayList(String song) {

		if (!songs.contains(song)) {
			if (songs.size() < 3) {
				songs.add(song);
			} else {
				songs.remove(0);
				songs.add(song);
			}

		} else if (songs.contains(song)) {
			songs.remove(song);
			songs.add(song);
		}

		if (songs.size() == 3) {

			System.out.println(
					"When " + song + " is Played -> [" + songs.get(0) + "," + songs.get(1) + "," + songs.get(2) + "]");
		}
	}

	public static void main(String[] args) {
		SongsStore songsStore = new SongsStore();
		songsStore.playList();
		songsStore.recentPlayList("Song4");
		songsStore.recentPlayList("Song2");
		songsStore.recentPlayList("Song1");

	}

}
