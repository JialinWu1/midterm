/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author k.w
 */
public class StatusGenerator 
{   
    private int size = 4;
    StausUser[] output = new StausUser[size];
    
    public static StatusUser[] statusDetail(StatusUser.StatusCode code)
   {
       int i = 0;
       for(StausUser.StatusCode code: StausUser.StatusCode.values())
       {
           for(StausUser.Status status : StausUser.Status.values())
           {
               output[i] = new StausUser(code, status);
               i++;
           }
       }
   }  
}
