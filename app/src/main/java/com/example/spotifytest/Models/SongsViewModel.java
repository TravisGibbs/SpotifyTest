package com.example.spotifytest.Models;

import androidx.lifecycle.ViewModel;

import com.example.spotifytest.Models.SongFull;
import com.example.spotifytest.Services.PlaylistService;

import java.util.ArrayList;

import javax.annotation.Nullable;

public class SongsViewModel extends ViewModel {

  private ArrayList<SongFull> songList;
  private PlaylistService playlistService;

  public SongsViewModel() {
    songList = new ArrayList<>();
  }

  public ArrayList<SongFull> getSongList() {
    return songList;
  }

  public void setSongList(ArrayList<SongFull> songList) {
    this.songList = songList;
  }

  @Nullable
  public PlaylistService getPlaylistService() {
    return playlistService;
  }

  public void setPlaylistService(PlaylistService playlistService) {
    this.playlistService = playlistService;
  }
}