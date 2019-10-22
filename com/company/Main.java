package com.company;


import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // HelloWorldを変数に格納して表示
        String greeting = "HelloWorld";
        System.out.println(greeting);

        // for文を用いて1〜10までの数字を表示
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        // StreamAPIを用いて1〜10までの数字を表示
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integerList.stream()
                .forEach(i -> System.out.println(i));

        // 3年後の今日が何曜日か取得
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.plusYears(3).getDayOfWeek());

        // コマンドライン引数が0なら偽、1なら真を表示
        if(Integer.parseInt(args[0]) == 0) {
            System.out.println('偽');
        } else {
            System.out.println('真');
        }

        // List
        List<String> countries = new ArrayList<>();
        countries.add("Japan");
        countries.add("United States");
        countries.add("Korea");
        countries.add("Chinese");
        countries.add("United Kingdom");
        System.out.println(countries);
        // Listの中身を一つ一つ表示
        countries.stream()
                .forEach(country -> System.out.println(country));
        // Listの中で５文字以上の国名を表示
        countries.stream()
                .filter(country -> country.length() > 5)
                .forEach(country -> System.out.println(country));

        // Map
        Map<String, String> map = new HashMap<>();
        map.put("Tokyo", "Japan");
        map.put("Hong Kong", "Hong Kong");
        map.put("NYC", "United States");
        map.put("Nagoya", "Japan");
        System.out.println(map);
        // Mapの中身を一つ一つ表示(keyから)
        for(String city : map.keySet()){
            System.out.println(map.get(city));
        }
        // Mapの中身を一つ一つ表示(valueから)
        for(String country : map.values()) {
            System.out.println(country);
        }

        // WorkplaceCommunicationクラスのインスタンスを生成
        WorkplaceCommunication wc = new WorkplaceCommunication();
        // Helloという言葉を受けたらHelloと返す
        System.out.println(wc.greet("Hello"));
        // ここが職場なら挨拶をする
        if(wc.sayWhere("Office")){
            System.out.println("Hello");
        }

        // WorkplaceCommunicationクラスをCommunication型でインスタンス生成
        Communication communication = new WorkplaceCommunication();
        // Helloという言葉を受けたらHelloと返す
        System.out.println(communication.greet("Hello"));
        // ここが職場なら挨拶をする
        if(communication.sayWhere("Office")){
            System.out.println("Hello");
        }

        // Communicateクラスのインスタンスを生成
        Communicate com = new Communicate();
        try {
            // ボスじゃなければ例外を発生させる
            System.out.println(com.isBoss("OTHERS"));
        } catch (YourNotMyBossException e){
            System.out.println(e);
        }

        // Supermanクラスのインスタンスを生成
        Superman superman1 = new Superman("スーパーマン１", 200);
        superman1.run();
        superman1.fallAsleep();
        System.out.println(superman1.mp);

        // SupermanクラスをCharacter型でインスタンス生成
        Character superman2 = new Superman("スーパーマン２", 250);
        superman2.run();
        superman2.fallAsleep();
        System.out.println(superman2.mp);

        // NormalPersonクラスのインスタンスを生成
        NormalPerson np1 = new NormalPerson("普通の人１", 50);
        np1.run();
        np1.fallAsleep();
        System.out.println(np1.mp);

        // NormalPersonクラスをCharacter型でインスタンス生成
        Character np2 = new NormalPerson("普通の人２", 30);
        np2.run();
        np2.fallAsleep();
        System.out.println(np2.mp);

        // リストに詰める
        List<Character> characterList = new ArrayList<>();
        characterList.add(superman1);
        characterList.add(superman2);
        characterList.add(np1);
        characterList.add(np2);

        characterList.stream()
                .forEach(character -> System.out.println(character.name));

        MatcherClass mc = new MatcherClass();
        System.out.println(mc.vowelOnly("sekaisaikyo"));
    }
}
