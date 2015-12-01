package ass;
import java.util.*;
public class LRU {
    Scanner sc = new Scanner(System.in);
    int[] page=new int[1000];
		int[] frame=new int[1000];
		int[] recent=new int[1000];
		int fault = 0;
		int i,n,f,k,m=0,max=0,flag=0,ba=-1;
                public String st = " ";
		// TODO Auto-generated method stub
		
	//	System.out.print("Give no.of pages:");
		
		//System.out.print("Give no.of Frames:"
	//	System.out.print("Give pages:");
                void setvalues(int a[],int fram,int pag)
                {
                for(i=0;i<pag;i++)
			page[i]=a[i];
                f = fram;
                n = pag;
                }
		int code()
                {
		for(i=0;i<f;i++){
			frame[i]=-1;
			recent[i]=-1;
		}
		for(i=0;i<f;i++){
			for(k=0;k<f;k++){
				System.out.print(frame[k]+" ");
                                st += frame[k];
                                st += " ";
                        }
                        st += " \n";
			System.out.println();
			frame[i]=page[i];
			recent[i]=f-i-1;
		}
		fault = f;
		for(i=f;i<n;i++){
			int pa = page[i];
			max=0;flag=0;ba=-1;
			for(k=0;k<f;k++){
				System.out.print(frame[k]+" ");
                                st += frame[k];
                                st += " ";
                        }
                        st +="\n";
			System.out.println();
			for(int j=0;j<f;j++){
				if(frame[j]==pa){
					flag=1;
					ba=j;
				}
			}
			if(flag==1){
				for(k=0;k<f;k++)
					recent[k]=recent[k]+1;
				recent[ba]=0;
			}
			else{
				for(k=0;k<f;k++)
					recent[k]=recent[k]+1;
				for(k=0;k<f;k++){
					if(recent[k]>max){
						max=recent[k];
						m=k;
					}
				}
				fault = fault + 1;
				recent[m]=0;
				frame[m]=pa;
			}
		}
		for(k=0;k<f;k++){
			System.out.print(frame[k]+" ");
                        st +=frame[k];
                        st += " ";
                }
                st += "\n";
		System.out.println();
		System.out.println(fault);
                return fault;
                }
}