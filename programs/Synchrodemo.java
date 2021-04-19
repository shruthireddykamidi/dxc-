package jp;
public class Synchrodemo
{
   public static void main (String [] args)
   {
      FinTrans ft = new FinTrans ();
      TransThread tt1 = new TransThread (ft, "Deposit Thread");
      TransThread tt2 = new TransThread (ft, "Withdrawal Thread");
      tt1.start ();
      tt2.start ();
   }
}
class FinTrans
{
   public static String transName;
   public static double amount;
}
class TransThread extends Thread
{
   TransThread (FinTrans ft, String name)
   {
      super (name); // Save thread's name
   }
   public void run ()
   {
      for (int i = 0; i < 100; i++)
      {
           if (getName ().equals ("Deposit Thread"))
           {
               // Start of deposit thread's critical code section
               FinTrans.transName = "Deposit";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               FinTrans.amount = 2000.0;
               System.out.println (FinTrans.transName + " " + FinTrans.amount);
               // End of deposit thread's critical code section
           }
           else
           {
               // Start of withdrawal thread's critical code section
               FinTrans.transName = "Withdrawal";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               FinTrans.amount = 250.0;
               System.out.println (FinTrans.transName + " " + FinTrans.amount);
               // End of withdrawal thread's critical code section
           }
      }
   }
}

