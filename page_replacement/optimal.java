package ass;
import java.util.*;
import java.io.*;
public class optimal {

        int pos = 0;
       public String st = " ";
		int i;
		int take=0;
		 int[] my = new int[1000];
		 int[] cot = new int[1000];
		 int[] fra = new int[1000];
//		 int flag = 0;
		 int min = 1000000;
		 int pos1=0;
                 int f;
                 int p;
                public int fault;
  void setvalues(int a[],int fram,int pag)
  {
      for(int k=0;k<pag;k++)
      {
          my[k] = a[k];
          String sss = " " + my[k];
        //  st = st + my[k];
         // st = st + " ";
      }
     // st = st + " \n";
      f = fram;
      p = pag;
  }
  
  int  code()
  {
      
                 int j;
//		 int fault = 0;
		 for(j=0;j<f;j++)
		 {
		  fra[j] = my[j];
                  st += my[j];
                  st += " ";
		 }
                 st += " \n";
		 fault  = f;
		 take = f;
         for(j=0;j<p;j++)
         {
        	 cot[my[j]] = cot[my[j]] + 1;
     //   	 System.out.print(cot[a[j]] + " ");
         }
         for(j=take;j<p;j++)
         {
        	 int k = my[j];
        	 
        //	 for(i=0;i<f;i++)
        	// {
        	//	 System.out.print(fra[i] + " ");
        	// }
        	// System.out.println();
        	 int flag=0;
        	 for( i = 0;i<f;i++)
        	 {
        		 if(fra[i]==k)
        		 {
        			 flag = 1;
        			 pos = i;
        			 
        		 }
        	 }
        	 if(flag == 1)
        	 {
        		 cot[fra[pos]] = cot[fra[pos]] - 1;
         }
        	 if(flag == 0)
        	 {
        		for(int b=0;b<f;b++)
        		{
        			System.out.print(fra[b] + " ");
                                st += fra[b];
                                st += " ";
        		}
                        st += " \n";
        		System.out.println();
        		 for(int b = 0;b<f;b++)
        		 {
        			 if(cot[fra[b]]< min)
        			 {
        				 min = cot[fra[b]];
        				 pos1 = b;
        			 }
        		 }
        		// for(int l=0;l<f;l++)
        		// {
        	//		 System.out.print(fra[l] + " ");
        		// }
        		 fra[pos1] = k;
        		 cot[fra[pos1]] = cot[fra[pos1]] - 1;
        		 fault = fault + 1;
        	 }
         }
         for(int u = 0 ; u<f;u++)
         {
             st +=fra[u];
             st += " ";
             System.out.print(fra[u] + " ");
         }
         st +="\n";
         System.out.println();
         System.out.println(fault);
         return fault;
        

      
      
  }
		// TODO Auto-generated method stub
		
	/*	 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the no.of Frames");
		 int f = in.nextInt();
		 System.out.println("Enter no.of Pages");
		 int p = in.nextInt();
		 System.out.print("Enter the Values\n");
		 int j;
		 for(j=0;j<p;j++)
		 {
			 a[j] = in.nextInt();
		 } */
            
            
            
        
}
