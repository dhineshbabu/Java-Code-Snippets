package com.kanu;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Song 1", 4.6);
        album.addSong("Song 2", 4.22);
        album.addSong("Song 3", 4.3);
        album.addSong("Song 4", 5.6);
        album.addSong("Hold on", 3.21);
        album.addSong("Holy Man", 6.23);
        album.addSong("high Ball Shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("Kanu's Album", "Deep Pink");
        album.addSong("Song 190", 4.6);
        album.addSong("Song 54", 4.22);
        album.addSong("Song 87", 4.3);
        album.addSong("Song 8", 5.6);
        album.addSong("Thank you", 3.21);
        album.addSong("Cat Song", 6.23);
        album.addSong("Low Ball Shooter", 4.27);
        album.addSong("Cars", 4.2);
        album.addSong("Vaaydai petha pulla", 3.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("high Ball Shooter", playList);
        albums.get(0).addToPlayList("The Gypsy", playList);
        albums.get(0).addToPlayList("Random Song Name", playList); // Does not exists
        albums.get(0).addToPlayList(9, playList); //another way of adding
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // Does not exists

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No Songs in playlist");
            return;
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("PlayList Complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of teh playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("we are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying "+ listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions : \n press");
        System.out.println("0 - to quit \n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to play the current song \n" +
                "4 - list songs in the playlist \n" +
                "5 - print available actions. \n" +
                "6 - Delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=========================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }
}
