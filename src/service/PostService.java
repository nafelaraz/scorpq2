package service;

import model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostService {

    // since we only visit all the elements only once the time complexity would be O(N) where N is the sum of size of elements in posts
    public List<Post> mergePosts(List<List<Post>> posts) {
        List<Post> result = new ArrayList<>();
        for (int i = posts.size() - 1; i >= 0; i--) {
            List<Post> tempPost = posts.get(i);
            Integer tempId = null;
            for (int j = tempPost.size() - 1; j >= 0; j--) {
                if(tempId == null){
                    result.add(tempPost.get(j));
                }else{
                    if(tempId!=tempPost.get(j).getId()){
                        result.add(tempPost.get(j));
                    }
                }
                tempId=tempPost.get(j).getId();

            }
        }
        return result;

    }

}
