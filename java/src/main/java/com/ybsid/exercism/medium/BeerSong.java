package com.ybsid.exercism.medium;

/**
 * <a href="https://exercism.org/tracks/java/exercises/beer-song">...</a>
 */
class BeerSong{
    private static String FIRST_LINE = "%s bottles of beer on the wall, %s bottles of beer.";
    private static String SECOND_LINE = "Take one down and pass it around, %s bottles of beer on the wall.";
    public String singSong(){
        return sing(99,100);
    }
    public String sing(int startNum , int numLines){
        StringBuilder song = new StringBuilder();
        for(int i=0;i<numLines;i++){
            if(startNum==0)
                song.append(String.format(FIRST_LINE,"No more","no more"));
            else if(startNum==1){
                song.append(String.format(FIRST_LINE,startNum,startNum).replace("bottles","bottle"));
            }
            else
                song.append(String.format(FIRST_LINE,startNum,startNum));
            song.append("\n");
            if(startNum==1)
                song.append(String.format(SECOND_LINE,"no more")
                        .replace("one","it"));
            else if (startNum==0)
                song.append("Go to the store and buy some more, 99 bottles of beer on the wall.");
            else if (startNum==2){
                song.append(String.format(SECOND_LINE,startNum-1).replace("bottles","bottle"));
            }
            else
                song.append(String.format(SECOND_LINE,startNum-1));
            song.append("\n\n");
            startNum-=1;
        }
        return song.toString();
    }
}
