package ass;
import java.util.*;
public class FIFO {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
                public String st = " ";
		int i=0;
		int k=0;
		int p=0;
		int n=0;
		int y=0;
               public int fault;
                int [] aaa = new int[1000];
		int [] arra1=new int[1000];
		int [] arra=new int[3];
	//	Scanner in = new Scanner(System.in);
                void setvalues(int a[],int fram,int pag)
                {
		y=fram;
		n=pag;
		for(int x=0;x<y;x++)
		{
			arra[x]=-1;
                }
                for(int x=0;x<pag;x++)
                {
                    arra1[x] = a[x];
                }
                }
                void code()
                {
		for(int x=0;x<n;x++)
		{	k=0;
			for(int s=0;s<y;s++)
			{
			if(arra[s]==arra1[x])
			{	//System.out.println(arra1[x]);			
				k=1;
			}
			}
			if(k==0)
			{
				if(p==y)
				{
					p=0;
				}
				//System.out.println(arra1[x]);
				
					arra[p]=arra1[x];
					i=i+1;
					p=p+1;
					System.out.print("Fault Page = ");
                                        for(int s=0;s<y;s++)
					{	System.out.print(" "+arra[s]);
					   aaa[s] = arra[s];
                                           st +=  " ";
                                           st += arra[s];
				           fault = s;	       
					}
                                       
				System.out.println("\n");
				st +="\n";
			}
			
		}
		//System.out.println("faults are : "+i);
                }

}