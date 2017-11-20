package com.mobileapp.grady.photoviewer.dummy;

/**
 * Created by Grady on 2017-11-18.
 */

public class pictureContent {

    //a array of picture objects

    //a map of picture objects by id


    //create picture objects to be added to a list
    private static PictureItem createPictureItem(int id, String name)
    {
        return new PictureItem(String.valueOf(id), name, "/res/drawables." + name + ".jpg");
}

    /**
     * an object to hold a pictures information
     */
    public static class PictureItem
    {
        public final String id;
        public final String name;
        public final String filePath;

        //constructor
        public PictureItem(String id, String name, String filePath)
        {
            this.id = id;
            this.name = name;
            this.filePath = filePath;
        }
    }
}
