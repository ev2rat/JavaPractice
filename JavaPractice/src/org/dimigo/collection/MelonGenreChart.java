/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *    l_ MelonChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		map.put("발라드", new ArrayList<Music>());
		map.get("발라드").add(new Music("팔레트", "아이유"));
		map.put("댄스", new ArrayList<Music>());
		map.get("댄스").add(new Music("I LUV IT", "PSY"));
		map.get("댄스").add(new Music("맞지?", "언니쓰"));
		printMap(map);

		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);

		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		map.get("댄스").remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		List<Music> list = new ArrayList<>();
		for(String key : map.keySet()) {
			list = map.get(key);
			System.out.println("[" + key + "]");
			for(int i = 1; i <= list.size(); i ++) {
				System.out.println(i + ". " + list.get(i-1).getTitle() + " (" + list.get(i-1).getSinger() + ")");
			}
		}
		System.out.println();
	}

}
