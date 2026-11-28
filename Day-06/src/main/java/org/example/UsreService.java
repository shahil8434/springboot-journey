package org.example;

import java.util.HashMap;
import java.util.List;

public class UsreService {

//    private HashMap<Integer, String> UserData;
//
//    public UsreService(HashMap<Integer, String> UserData){
//
//      this.UserData = UserData;
//
//    }
//
//    public HashMap<Integer, String> getUserData(){
//        return UserData;
//    }

        public UsreService(){
            System.out.println("UserService Created");
        }

        public void init(){
            System.out.println("Post constract Phase");
        }

        public void cleanup(){
            System.out.println("Pre Destroy Phase");
        }
}
