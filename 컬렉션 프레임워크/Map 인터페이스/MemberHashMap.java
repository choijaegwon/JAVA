package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member){ //HashMap에 회원을 추가하는 메서드
		hashMap.put(member.getMemberId(), member); //키 벨류 쌍으로 추가
		
	}
	
	public boolean removeMember(int memberId){ //HashMap에서 회원을 삭제하는 메서드
		if(hashMap.containsKey(memberId)){ //HashMap에 매개변수로 받은 키값인 회원아이디가있다면
			hashMap.remove(memberId); //해당 회원 삭제
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){ //Iterator를 사용해 전체 회원을 출력하는 메서드
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
}
