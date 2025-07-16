import java.util.LinkedList;
import java.util.Scanner;

class MediaPlayer {
    public void play(String media) {
        System.out.println("Playing: " + media);
    }
}

class MusicPlayer extends MediaPlayer {
    private LinkedList<String> playlist;

    public MusicPlayer() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.addLast(song);
        System.out.println("Added song: " + song);
    }

    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void playNext() {
        if (!playlist.isEmpty()) {
            String nextSong = playlist.pollFirst();
            play(nextSong);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist: " + playlist);
        }
    }
}

public class MusicPlaylistQueue {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Song\n2. Remove Song\n3. Play Next Song\n4. Show Playlist\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song name to add: ");
                    String songToAdd = scanner.nextLine();
                    player.addSong(songToAdd);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    player.removeSong(songToRemove);
                    break;
                case 3:
                    player.playNext();
                    break;
                case 4:
                    player.showPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting Music Player...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
