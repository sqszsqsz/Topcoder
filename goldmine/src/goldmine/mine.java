package goldmine;

import java.util.Arrays;


public class mine {

	public int[] getAllocation(String[] mines, int miners){
		int[][] mine=convert(mines);
		int[][] value = new int[mine.length][7];
		
		for (int i=0;i<mine.length;i++){
			value[i][0]=0;
			for (int j=1;j<7;j++){
				int sum=0;
				for (int k=0;k<7;k++){
					if (mine[i][k]==0) continue;
					if (j<k) sum+=60*j*mine[i][k];
					else if (j==k) sum+=50*k*mine[i][k];
					else if (j>k) sum+=(mine[i][k])*(50*k-20*(j-k));
				}
				value[i][j]=sum;
			}
		}
		System.out.println(Arrays.toString(value[0]));
		System.out.println(Arrays.toString(value[1]));
		
		int[][] add_v=new int[mine.length][7];
		for (int i=0;i<mine.length;i++){
			for (int j=1;j<7;j++){
				add_v[i][j]=value[i][j]-value[i][j-1];
			}
		}
		
		System.out.println(Arrays.toString(add_v[0]));
		System.out.println(Arrays.toString(add_v[1]));
		
		int[] ret=new int[mine.length];
		int remain=miners;
		int[] step = new int[mine.length];
		Arrays.fill(step, 1);
		
		while(remain>0){
			int index=0,max=Integer.MIN_VALUE;
			for (int i=0;i<mine.length;i++){
				if (add_v[i][step[i]]>max) {
					max=add_v[i][step[i]];
					index=i;
				}
			}
			ret[index]++;
			step[index]++;
			remain--;
		}
		
		return ret;
	}
	
	public int[][] convert(String[] mines){
		int n=mines.length;
		int[][] ret=new int[n][7];
		
		for (int i=0;i<n;i++){
			 String[] ss=mines[i].split(", ");
			 for (int j=0;j<7;j++){
				 ret[i][j]=Integer.parseInt(ss[j]);
			 }
		}
		System.out.println(Arrays.toString(ret[0]));
		System.out.println(Arrays.toString(ret[1]));
		
		return ret;
	}
	
	
	public static void main(String [ ] args) {
		String[] test1={ "000, 030, 030, 040, 000, 000, 000",
			 			 "020, 020, 020, 010, 010, 010, 010" };
		mine solution=new mine();
		int[] actual = solution.getAllocation(test1,4);
		
		System.out.println(Arrays.toString(actual));
	}
}



