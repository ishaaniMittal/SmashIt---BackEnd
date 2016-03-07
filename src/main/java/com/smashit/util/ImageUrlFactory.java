
package com.smashit.util;

/**
 * Created by Vijay on 20/02/2016.
 */
public class ImageUrlFactory {

    private static final String IMG_BASE_URL="http://ec2-54-201-199-54.us-west-2.compute.amazonaws.com:8080/images";
    private static final String SLASH="/";
    private static final String TEAM_DIRECTORY ="team";
    private static final String SBAR_DIRECTORY="sportsbar";
    private static final String SBAR_MENU_DIRECTORY="menu";
    private static final String SBAR_IMG_DIRECTORY="img";
    private static final String MDPI="16";
    private static final String HDPI="24";
    private static final String XHDPI="32";
    private static final String XXHDPI="48";
    private static final String PNG_IMAGE_EXT=".png";


    public static String getTeamImageUrl(String eventName,String density)
    {
        return IMG_BASE_URL+SLASH+ TEAM_DIRECTORY +SLASH+resolveDensity(density)+SLASH+eventName+PNG_IMAGE_EXT;
    }

    public static String getSportsbarImageUrl(String sportsbarName,String density,int imgNo)
    {
        return IMG_BASE_URL+SLASH+SBAR_DIRECTORY+SLASH+SBAR_IMG_DIRECTORY+SLASH+resolveDensity(density)+SLASH+sportsbarName+SLASH+imgNo+PNG_IMAGE_EXT;
    }

    public static String getSportsbarMenuUrl(String sportsbarName,String density,int imgNo)
    {
        return IMG_BASE_URL+SLASH+SBAR_DIRECTORY+SLASH+SBAR_MENU_DIRECTORY+SLASH+resolveDensity(density)+SLASH+sportsbarName+SLASH+imgNo+PNG_IMAGE_EXT;
    }

    private static String resolveDensity(String density)
    {
        switch (density)
        {
            case "MEDIUM":
                return MDPI;
            case "HIGH":
                return HDPI;
            case "XHIGH":
                return XHDPI;
            case "XXHIGH":
                return XXHDPI;
        }
        return "Error";
        //raise exception here
    }



}
