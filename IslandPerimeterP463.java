
public class IslandPerimeterP463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandPerimeterP463 p = new IslandPerimeterP463();
		int[][] pArr = {{0,1,0,0},
				 {1,1,1,0},
				 {0,1,0,0},
				 {1,1,0,0}};
		
		p.islandPerimeter(pArr);

	}
	
	public int islandPerimeter(int[][] grid) {

		 int lands = 0,neighbours =0;
	        
	        for(int i=0;i<grid.length;i++)
	        {
	            for(int j=0;j<grid[i].length;j++)
	            {
	                if(grid[i][j]==1)
	                {
	                    lands++;
	                    if(i<grid.length-1 && grid[i+1][j]==1)
	                    neighbours++;
	                    if(j<grid[i].length-1 && grid[i][j+1]==1)
	                    neighbours++;
	                }
	                    
	                
	                    
	            }
	        }
	        
	        return lands*4 - neighbours*2;
	}
}
