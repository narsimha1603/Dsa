import java.util.*;
public class BacktrackMazepath {
public static void main(String[] args) {
    boolean[][] maze = {
        {true, true, true},
        {true, false, true},
        {true, true, true}};
        pathrestrictions("", maze, 0, 0);
    };
static ArrayList<String> path(String p,int r, int c)
{
    if(r==1&&c==1)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
ArrayList<String> list = new ArrayList<>();
    if(r>1&&c>1)
    {
       list.addAll( path(p+"D", r-1, c-1));
    }
    if(r>1)
    {
       list.addAll(path(p+'V',r-1,c));
    }
    if(c>1)
    {
        list.addAll(path(p+'H',r,c-1));
    }
    return list;
}
static void pathrestrictions(String p,boolean[][] maze,int r,int c)
{
    if(r==maze.length-1&&c==maze[0].length-1)
    {
        System.out.println(p);
        return;
    }
    if (!maze[r][c]) {
        return;
    }
    if(r<maze.length-1)
    {
        pathrestrictions(p+'D', maze, r+1, c);
    }
    if(c<maze[0].length-1)
    {
        pathrestrictions(p+'R', maze, r, c+1);
    }
}
}