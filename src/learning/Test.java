import java.util.*;
import java.lang.*;
import java.io.*;

class Test {

    static int r, c;
    static String search;

    public static boolean isSafe(char[][] letters, boolean[][] visited, int i, int j, int index, int dir, int k){
        return (i>=0 && j>=0 && i<r && j<c && !visited[i][j] && letters[i][j]==search.charAt(index) && (dir==k || dir==Integer.MAX_VALUE))? true : false;
    }

    public static boolean findMatch(char[][] letters, boolean[][] visited, int i, int j, int index, int dir){
        if(index == search.length()){
            return true;
        }
        if(index > search.length()){
            return false;
        }
        int[] x = {-1,-1,-1,0,1,1,1,0};
        int[] y = {-1,0,1,1,1,0,-1,-1};

        visited[i][j] = true;

        boolean found = false;
        for(int k=0; k<8; k++){
            if(isSafe(letters, visited, i+x[k], j+y[k], index, dir, k)){
                found = findMatch(letters, visited, i+x[k], j+y[k], index+1, k);
                if(found == true){
                    break;
                }
            }
        }
        visited[i][j] = false;

        return found;
    }

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] input = br.readLine().split("\\s");
            r = Integer.parseInt(input[0]);
            c = Integer.parseInt(input[1]);

            char[][] letters = new char[r][c];
            boolean[][] visited = new boolean[r][c];

            input = br.readLine().split("\\s");
            int index = 0;
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    letters[i][j] = input[index++].charAt(0);
                }
            }
            search = br.readLine();

            boolean found;
            int count = 0;
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(search.charAt(0) == letters[i][j]){
                        found = findMatch(letters, visited, i, j, 1, Integer.MAX_VALUE);
                        if(found){
                            if(count == 0){
                                System.out.print(i+" "+j+",");
                            }else{
                                System.out.print(" "+i+" "+j+",");
                            }
                            count++;
                        }
                    }
                }
            }
            if(count == 0){
                System.out.print("-1");
            }
            System.out.println();
        }
    }
}