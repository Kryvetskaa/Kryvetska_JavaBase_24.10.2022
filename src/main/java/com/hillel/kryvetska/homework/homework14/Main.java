package com.hillel.kryvetska.homework.homework14;

public class Main  {
    public static void main(String[] args) {


                Information Information = new Information (null, null,
                                                            0,0,0,null,
                                                            0,0,0,0);
                Information.setLastName("Хэйл");
                Information.setSteps(25000);
                Information.printAccountInfo();

                Information Information2 = new Information (null,null,
                                                            0,0,0,null,
                                                            0, 0,0,0);
                Information2.setLastName("МакКолл");
                Information2.setSteps(3000);
                Information2.printAccountInfo();

                Information Information3 = new Information (null,null,
                                                            0,0,0,null,
                                                            0, 0,0,0);
                Information3.printAccountInfo();


                Information Information4 = new Information (null,null,
                                                            0,0,0,null,
                                                            0, 0,0,0);
                Information4.printAccountInfo();





    }



}
