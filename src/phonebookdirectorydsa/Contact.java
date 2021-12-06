/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebookdirectorydsa;

import javax.swing.JOptionPane;

/**
 *
 * @author Hammad Ali
 */
class Contact
{
   private String name;
   private String phone;
   private boolean dataValid;

   public Contact (String name, String phone)
   {
      dataValid = false;

      if (name.length() == 0)
      {
         JOptionPane.showMessageDialog(null, "Name cannot be blank.",
              "Name Error:", JOptionPane.ERROR_MESSAGE);

         //throw new Exception ("Invalid Name");
      }
      else if (phone.length() == 0)
      {
         JOptionPane.showMessageDialog(null, "Phone cannot be blank.",
              "Phone Error:", JOptionPane.ERROR_MESSAGE);
      }
      else
      {
         // OK, no errors, all is OK.
         dataValid  = true;
         this.name  = name;
         this.phone = phone;
      }
   }

   public String getName ()
   {
      return name;
   }

   public String getPhone ()
   {
      return phone;
   }

   public boolean isDataValid ()
   {
      return dataValid;
   }
   
}
