package kr.co.bomapp.planner.service;

import kr.co.bomapp.planner.model.Planner;
import org.springframework.stereotype.Service;

@Service
public class PlannerService {

    public Planner getPlannerInfo(String plannerId) {
        Planner planner = Planner.builder()
                            .id(plannerId)
                            .name("Planner Lee")
                            .phoneNo("010-9876-5432")
                            .build();

        return planner;
    }
}
