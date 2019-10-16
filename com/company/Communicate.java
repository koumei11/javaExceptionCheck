package com.company;

public class Communicate {
    String isBoss(String person) throws YourNotMyBossException {
        if(person == "BOSS"){
            return "あなたはすごい優秀な方です。";
        } else {
            throw new YourNotMyBossException("ボスではありません");
        }
     }
}
