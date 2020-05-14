package com.jathu.prototype_pattern;

/**
 * Prototype Design pattern example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChannelStore.getEntertainment("Sun TV").addChannel();
        ChannelStore.getEntertainment("Star Vijay").addChannel();
        ChannelStore.getEntertainment("Colors TV").addChannel();
    }
}
