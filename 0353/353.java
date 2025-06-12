
import java.util.*;
class SnakeGame {
    int width, height; int[] food; int foodIdx=0; int score=0;
    Deque<int[]> snake=new LinkedList<>(); Set<Integer> body=new HashSet<>();
    public SnakeGame(int width, int height, int[][] food) {
        this.width=width; this.height=height; this.food=new int[food.length*2];
        for (int i=0;i<food.length;i++){this.food[i*2]=food[i][0];this.food[i*2+1]=food[i][1];}
        snake.addFirst(new int[]{0,0}); body.add(0);
    }
    public int move(String direction) {
        int[] head=snake.peekFirst(); int nr=head[0], nc=head[1];
        if(direction.equals("U"))nr--;else if(direction.equals("D"))nr++;else if(direction.equals("L"))nc--;else nc++;
        if(nr<0||nr>=height||nc<0||nc>=width) return -1;
        int[] tail=snake.peekLast(); body.remove(tail[0]*width+tail[1]);
        if(body.contains(nr*width+nc)) return -1;
        snake.removeFirst(); snake.addFirst(new int[]{nr,nc});
        if(foodIdx<food.length&&food[foodIdx]==nr&&food[foodIdx+1]==nc){
            score++; foodIdx+=2; snake.addLast(tail); body.add(tail[0]*width+tail[1]);
        }
        body.add(nr*width+nc);
        return score;
    }
}
