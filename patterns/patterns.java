class Patterns {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
       int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
				//if skip the space after last column of every row
			    if(j!=n-1)
                System.out.print("_");
            }
            System.out.println();
        }
    }
}

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * *
-----------------------------------
class Patterns {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
       int rows=5;
       int cols=5;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(i==0 || j==0 || j==cols-1 || i==rows-1)
                System.out.print("*");
                //if(j!=cols-1)
                else
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}

*****
*   *
*   *
*   *
*****
---------------------------------------------------

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Patterns {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
     
       int n=10;
        for(int i=0;i<n;i++)
        {
            for(int gap=0;gap<n-i;gap++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n/2;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

          *****
         *****
        *****
       *****
      *****
     *****
    *****
   *****
  *****
 *****
--------------------------------------------------
class Patterns {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");

       int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int gap=0;gap<n-i;gap++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    *
   ***
  *****
 *******
*********
------------------------------------------------

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Patterns {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");

       int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int gap=1;gap<n-i+1;gap++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*********
 *******
  *****
   ***
    *
	
----------------------------------------------------------------
 