class cmdlinedemo
{
   public static void main(String sss[])
   {

   double s[] = new double[sss.length];
   double t;
   int min;
   for(int i=0;i<sss.length;i++)
   {
     s[i] = Double.parseDouble(sss[i]);
   }
   for(int i=0;i<s.length-1;i++)
   {
     min = i;
     for(int j = i+1;j<s.length;j++)
     {
       if(s[min]<s[j])
        min = j;
     }
      t = s[min];
      s[min] = s[i];
      s[i] = t;
   }
   System.out.println("Sorted array");
   for(int i =0;i<s.length;i++)
   {
     System.out.println(s[i]);
   }



 }
}
