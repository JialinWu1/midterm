/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public enum StatusCode
   {
       ZERO, ONE, TWO, TREE
   }
   public enum Status
   {
       REJECTED, PENDING, PROCESSING, APPROVED, NOTVALIDCODE
   }
   private StatusCode code;
   private Status status;
   
   public StausUser(StatusCode code, Status status)
   {
       this.code = code;
       this.status = status;
   }
   public String setCode(StatusCode code)
   {
       if(code!="ZERO"&&code!="ONE"&&code!="TWO"&&code!="THREE")
       {
           return "NOT VALID CODE";
       }
       else
       {
           this.code = code;
       }
   }
   public StatusCode getCode()
   {
       return this.code;
   }
   
   public void setStatus(Status status)
   {
       this.status = status;
   }
   public Status getStatus()
   {
       return this.status;
   }
           
   
 /*  public void statusDetail(String code)
{
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}*/
}
