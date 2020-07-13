package com.example.spotifytest.Models;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseUser;

@ParseClassName("_User")
public class _User extends ParseUser {

    public _User() {
        super();
    }




    public static final String KEY_IMAGE = "ProfileImage";
    public static final String KEY_SPOTIFYID = "SpotifyID";
    public ParseFile getImage(){
        return(getParseFile(KEY_IMAGE));
    }
    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE,parseFile);
    }
    public String getKeySpotifyid() {
        return getString(KEY_SPOTIFYID);
    }
    public void setKeySpotifyid(String keySpotifyid){
        put(KEY_SPOTIFYID, keySpotifyid);
    }



}
