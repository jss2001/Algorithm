# 프로그래머스 2024 KAKAO WINTER INTERNSHIP 가장 많이 받은 선물


import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        Map<String, HashMap<String, Integer>> myGivenGift = new HashMap<>();
        Map<String, Integer> giftIndex = new HashMap<>();
        for(String fri : friends){
            myGivenGift.put(fri, new HashMap<>());
            giftIndex.put(fri, 0);
        }
        
        // 누가 누구에게 몇개의 선물을 주었는지, 한 친구의 선물 지수가 몇인지 초기화
        for(String fri: gifts){
            String[] friTm = fri.split(" ");
            giftIndex.put(friTm[0], giftIndex.getOrDefault(friTm[0], 0) + 1);
            giftIndex.put(friTm[1], giftIndex.getOrDefault(friTm[1], 0) - 1);
            
            if(myGivenGift.get(friTm[0]).containsKey(friTm[1])){
                myGivenGift.get(friTm[0]).put(friTm[1], 1 + myGivenGift.get(friTm[0]).get(friTm[1]));
            }else{
                myGivenGift.get(friTm[0]).put(friTm[1], 1);
            }
        }
        
        HashMap<String, Integer> friNextGiftCnt = new HashMap<>();
        HashSet<String> friSet = new HashSet<>();
        for(String fri1 : friends){
            friSet.add(fri1);
            for(String fri2 : friends){
                if(!friSet.contains(fri2)){
                    // 주고받은 선물수가 같다면
                    if((int)myGivenGift.get(fri1).getOrDefault(fri2, 0) == (int)myGivenGift.get(fri2).getOrDefault(fri1,0)){
                        // 선물 지수 비교
                        if((int)giftIndex.get(fri1) > (int)giftIndex.get(fri2)){
                            friNextGiftCnt.put(fri1, friNextGiftCnt.getOrDefault(fri1, 0) + 1);
                        }else if((int)giftIndex.get(fri1) < (int)giftIndex.get(fri2)){
                            friNextGiftCnt.put(fri2, friNextGiftCnt.getOrDefault(fri2, 0) + 1);
                        }
                    // 같지 않다면
                    }else{
                        // 주고받은 선물 수 비교
                        if((int)myGivenGift.get(fri1).getOrDefault(fri2,0) > (int)myGivenGift.get(fri2).getOrDefault(fri1,0)){
                            friNextGiftCnt.put(fri1, friNextGiftCnt.getOrDefault(fri1, 0) + 1);
                        }else{
                            friNextGiftCnt.put(fri2, friNextGiftCnt.getOrDefault(fri2, 0) + 1);
                        }
                    }
                }
            }
        }
        for(Integer i : friNextGiftCnt.values()){
            if(answer < i) answer = i;
        }
        return answer;
    }
}
