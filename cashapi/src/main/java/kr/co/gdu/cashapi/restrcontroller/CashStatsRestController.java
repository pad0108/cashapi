package kr.co.gdu.cashapi.restrcontroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.gdu.cashapi.service.CashStatsService;

@RestController
public class CashStatsRestController {	
	@Autowired CashStatsService cashStatsService;
	
	@GetMapping("/totalOfMonthByYear")
	public Map<String, Object> totalOfMonthByYear() {
		Map<String, Object> map = cashStatsService.getTotalOfMonthByYear();
		return map; //@RestController -> 리턴객체를 JSON문자열로 변경
	}
}
